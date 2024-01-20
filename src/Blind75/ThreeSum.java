package Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>();
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]){
                int leftPointer = i+1;
                int rightPointer = nums.length-1;
                int sumNeeded = 0 - nums[i];
                while(leftPointer < rightPointer){
                    if(nums[leftPointer] + nums[rightPointer] == sumNeeded){
                        results.add(List.of(nums[i],nums[rightPointer],nums[leftPointer]));
                        while(leftPointer < rightPointer && nums[leftPointer]== nums[leftPointer+1]){leftPointer++;}
                        while(leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer-1]){rightPointer--;}
                        rightPointer--;
                        leftPointer++;
                    }else if(nums[leftPointer]+nums[rightPointer]> sumNeeded){
                        rightPointer--;
                    }else{
                        leftPointer++;
                    }
                }
            }
        }
        return results;
    }
}
