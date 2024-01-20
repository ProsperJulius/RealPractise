package Blind75;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> counterToIndex = new HashMap<>();
        counterToIndex.put(0, -1);
        int counter = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            counter += (nums[i] == 1 ? (1) : -1);
            if (!counterToIndex.containsKey(counter)) {
                counterToIndex.put(counter, i);
            } else {
                result = Math.max(result, (i - counterToIndex.get(counter)));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{0, 1, 1, 0}));
    }
}
