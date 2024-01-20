package Blind75;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null || nums.length == 0) return results;
        backTrack(results, new ArrayList<>(), nums);
        return results;

    }

    private void backTrack(List<List<Integer>> list, List<Integer> temp, int[] nums) {

        if (temp.size() == nums.length) {
            list.add(new ArrayList<>(temp));
        } else {

            for (int i = 0; i < nums.length; i++) {
                if (temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                backTrack(list, temp, nums);
                temp.remove(temp.size()-1);

            }
        }
    }
}
