package Blind75;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
     int max = Integer.MIN_VALUE;
     int currentSum = Integer.MIN_VALUE;
     for(int i = 0;i< nums.length;i++){
         currentSum = Math.max(currentSum+nums[i],nums[i]);
         max = Math.max(max,currentSum);
     }
     return max;

    }
}
