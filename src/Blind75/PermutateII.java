package Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutateII {


    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null || nums.length == 0) return results;

        Arrays.sort(nums);

        permuteHelper(results, nums, new ArrayList<>(),new boolean[nums.length]);
        return results;

    }

    private void permuteHelper(List<List<Integer>> results, int[] nums, List<Integer> temp,boolean [] used) {

        if (temp.size() == nums.length) {
            results.add(new ArrayList<>(temp));
            return;
        } else {

            for (int i = 0; i < nums.length; i++) {
                if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i-1]) continue;
                temp.add(nums[i]);
                used[i] =true;
                permuteHelper(results, nums, temp,used);
                used[i]=false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}
