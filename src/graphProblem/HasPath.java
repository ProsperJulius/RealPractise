package graphProblem;

import java.util.*;

public class HasPath {

    public static boolean existPath(String[][] graph, String src, String destination) {
        Map<String, List<String>> edges = buildGraph(graph);
        System.out.println(edges);
        return hasPathBFS(edges, src, destination, new HashSet<>());
    }

    public static boolean hasPathBFS(Map<String, List<String>> edges, String src, String destination, Set<String> visited) {
        //{i=[j, k], j=[i], k=[i, m, l], l=[k], m=[k], n=[o], o=[n]}
        Queue<String> nodesToVisit = new LinkedList<>();
        nodesToVisit.add(src);
        while (!nodesToVisit.isEmpty()) {
            String currentNode = nodesToVisit.remove();
            if (currentNode.equals(destination)) return true;
            visited.add(currentNode);

            List<String> neighbours = edges.getOrDefault(currentNode, List.of());
            for (String neighbour : neighbours) {
                if (visited.contains(neighbour)) continue;
                 nodesToVisit.add(neighbour);
            }
        }
        return false;
    }

    public static boolean hasPath(Map<String, List<String>> edges, String src, String destination, Set<String> lookUp) {
        if (src.equals(destination)) return true;
        if (lookUp.contains(src)) return false;
        lookUp.add(src);
        for (String neighbor : edges.get(src)) {
            if (hasPath(edges, neighbor, destination, lookUp)) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, List<String>> buildGraph(String[][] graph) {
        Map<String, List<String>> edges = new HashMap<>();
        for (String[] pairNode : graph) {
            String firstNode = pairNode[0];
            String secondNode = pairNode[1];
            if (!edges.containsKey(firstNode)) {
                edges.put(firstNode, new ArrayList<>());
            }
            if (!edges.containsKey(secondNode)) {
                edges.put(secondNode, new ArrayList<>());
            }
            edges.get(firstNode).add(secondNode);
            edges.get(secondNode).add(firstNode);
        }
        return edges;

    }

    public static void main(String[] args) {
        String[][] graph = {{"i", "j"}, {"k", "i"}, {"m", "k"}, {"k", "l"}, {"o", "n"}};
        System.out.println(existPath(graph, "m", "n"));
    }

}
