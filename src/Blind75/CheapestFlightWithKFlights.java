package Blind75;

import java.util.*;

public class CheapestFlightWithKFlights {
    public static int cheapDistance = Integer.MAX_VALUE;
    public static boolean routeFound = false;

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> adjacents = buildGraph(flights);
        Set<Integer> lookUp = new HashSet<>(src);
        return bfs(adjacents, src, dst, k);
//        dfs(adjacents, src, dst, k, lookUp, 0);
//        if (!routeFound) return -1;
//        return cheapDistance;
    }

    public static int bfs(Map<Integer, List<int[]>> adjacents, int src, int dst, int k) {
        int cost = Integer.MAX_VALUE;
        k +=1;
        Queue<int[]> flightsEdges = new LinkedList<>();
        flightsEdges.add(new int[]{src,0});
        Set<Integer> visited = new HashSet<>();
        while (!flightsEdges.isEmpty() && k > 0) {
            int size =  flightsEdges.size();
            for(int i = 0; i<size;i++){
                int[] currentNode = flightsEdges.remove();
                int currentPlace = currentNode[0];
                if (currentPlace == dst) {
                    cost = Math.min(cost, currentNode[1]);
                }
                visited.add(currentPlace);

                for (int[] neighbour : adjacents.getOrDefault(currentPlace,List.of())) {
                    if (visited.contains(neighbour[0])) continue;
                    neighbour[1]+=currentNode[1];
                    flightsEdges.add(neighbour);
                }
            }
            k--;
        }
        return cost;
    }

    public static void dfs(Map<Integer, List<int[]>> adjacents, int src, int dst, int k, Set<Integer> lookUp, int distance) {

        if (src == dst) {
            routeFound = true;
            cheapDistance = Math.min(cheapDistance, distance);
        }
        if (k < 0) return;
        if (!adjacents.containsKey(src)) return;
        for (int[] neighbour : adjacents.get(src)) {
            if (!lookUp.contains(neighbour[0])) {
                lookUp.add(neighbour[0]);
                if (cheapDistance < distance + neighbour[1]) continue;
                dfs(adjacents, neighbour[0], dst, k - 1, lookUp, distance + neighbour[1]);
            }

        }
    }

    public static Map<Integer, List<int[]>> buildGraph(int[][] flights) {
        Map<Integer, List<int[]>> adjacents = new HashMap<>();
        for (int[] flight : flights) {
            int firstPlace = flight[0];
            int secondPlace = flight[1];
            int cost = flight[2];
            if (!adjacents.containsKey(firstPlace)) {
                adjacents.put(firstPlace, new ArrayList<>());
            }
            adjacents.get(firstPlace).add(new int[]{secondPlace, cost});
        }
        return adjacents;
    }

    public static void main(String[] args) {
        System.out.println(findCheapestPrice(4, new int[][]{{0,1,1},{0,2,5},{1,2,1},{2,3,1}}, 0, 3, 1));
    }
}
