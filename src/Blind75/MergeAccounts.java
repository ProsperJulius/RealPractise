package Blind75;

public class MergeAccounts {
    public static List<List<String>> accountsMerge(List<List<String>> accounts) {

        Map<String, List<String>> adjacents = getEdges(accounts);
        List<List<String>> mergedAccounts = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            String name = account.get(0);
            if (visited.contains(firstEmail)) continue;
            List<String> newAccount = new ArrayList<>();
            newAccount.add(name);
            dfs(adjacents, firstEmail, newAccount, visited);
            Collections.sort(account.subList(1, account.size()));
            mergedAccounts.add(newAccount);

        }


        return mergedAccounts;

    }

    public static void dfs(Map<String, List<String>> adjacents, String firstEmail, List<String> account, Set<String> visited) {
        if (!adjacents.containsKey(firstEmail)) return;
        visited.add(firstEmail);
        account.add(firstEmail);

        for (String neighour : adjacents.get(firstEmail)) {
            if (!visited.contains(neighour)) {
                dfs(adjacents, neighour, account, visited);
            }

        }

    }

    public static  Map<String, List<String>> getEdges(List<List<String>> accounts) {
        Map<String, List<String>> edges = new HashMap<>();
        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            for (int i = 2; i < account.size(); i++) {
                if (!edges.containsKey(firstEmail)) {
                    edges.put(firstEmail, new ArrayList<>());
                }
                edges.get(firstEmail).add(account.get(i));
                if (!edges.containsKey(account.get(i))) {
                    edges.put(account.get(i), new ArrayList<>());
                }
                edges.get(account.get(i)).add(firstEmail);
            }
        }
        return edges;
    }

    public static void main(String[] args) {
        System.out.println(accountsMerge(List.of(List.of("John","johnsmith@mail.com","john_newyork@mail.com"), List.of("John","johnsmith@mail.com","john00@mail.com"),List.of("Mary","mary@mail.com"), List.of("John","johnnybravo@mail.com"))));
    }
}
