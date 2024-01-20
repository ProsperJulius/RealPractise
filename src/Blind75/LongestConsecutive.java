package Blind75;

import java.util.Arrays;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;//[0 0 1 2 3 4 5 6 7 8]
        Arrays.sort(nums);
        int results = 1;
        int counter = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                counter++;
            } else if (nums[i + 1] == nums[i]) {
                continue;
            } else {

                counter = 1;
            }
            results = Math.max(results, counter);

        }

        return results;
    }

}
