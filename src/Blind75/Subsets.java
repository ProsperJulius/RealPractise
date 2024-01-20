package Blind75;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backTrack(0, nums, new ArrayList<>(), result);

        return result;

    }

    private static void backTrack(int start, int[] nums, ArrayList<Integer> temp, List<List<Integer>> result) {

        result.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backTrack(i+1, nums, temp, result);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(subsets(new int[]{1,2}));

    }


}
