package graphProblem;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

public class ConnectedComponents {
    //{c=[d], d=[a, c], a=[b, d]}
    public static int connectedComponents(Map<String, List<String>> adjacents) {
        Set<String> visited = new HashSet<>();
        int result = 0;
        for (String node : adjacents.keySet()) {
            if (explore(adjacents, visited, node)) {
                result += 1;
            }
        }
        return result;
    }

    //{c=[d], d=[a, c], a=[b, d]}
    public static boolean explore(Map<String, List<String>> adjacents, Set<String> visited, String currentNode) {
        if (visited.contains(currentNode)) return false;
        visited.add(currentNode);
        List<String> neighbours = adjacents.getOrDefault(currentNode, List.of());
        for (String neighbour : neighbours) {
            explore(adjacents, visited, neighbour);
        }
        return true;
    }

    public static int largestConnectedComponent(Map<String, List<String>> adjacents) {
        Set<String> visited = new HashSet<>();
        int largestSize = 0;
        int size = 0;
        for (String node : adjacents.keySet()) {
            size = exploreSize(adjacents, visited, node);
            if (largestSize < size) {
                largestSize = size;
            }
        }
        return largestSize;
    }

    public static int exploreSize(Map<String, List<String>> adjacents, Set<String> visited, String currentNode) {
        if (visited.contains(currentNode)) return 0;
        visited.add(currentNode);
        int size = 1;
        List<String> neighbours = adjacents.getOrDefault(currentNode, List.of());
        for (String neighbour : neighbours) {
            size += exploreSize(adjacents, visited, neighbour);
        }
        return size;
    }


    public static void main(String[] args) {
        Map<String, List<String>> adjacents = Map.ofEntries(entry("a", List.of("b", "d", "e")), entry("c", List.of("d")), entry("d", List.of("a", "c")));
        System.out.println(largestConnectedComponent(adjacents));
        System.out.println(connectedComponents(adjacents));
    }
}
