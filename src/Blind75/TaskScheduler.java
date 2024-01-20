package Blind75;

public class TaskScheduler {

    public int leastInterval(char[] tasks, int n) {

        Map<Character, Integer> taskOccurrencies = new HashMap<>();

        for (char character : tasks) {
            taskOccurrencies.put(character, taskOccurrencies.getOrDefault(character, 0) + 1);
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);
        priorityQueue.addAll(taskOccurrencies.values());
        List<Integer> temp = new ArrayList<>();
        int cycles = 0;

        while (!priorityQueue.isEmpty()) {

            for (int i = 0; i < n + 1; i++) {
                if (!priorityQueue.isEmpty()) {
                    temp.add(priorityQueue.remove());

                }
            }

            for (int i : temp) {
                if (--i > 0) {
                    priorityQueue.add(i);
                }
            }
            cycles += priorityQueue.isEmpty() ? temp.size() : n + 1;
        }
        return cycles;
    }
}
