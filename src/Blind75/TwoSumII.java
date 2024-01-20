package Blind75;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right = numbers.length -1;
        int [] results = new int [2];
        while(left < right){
            int sumNeeded = target-numbers[left];
            if(sumNeeded == numbers[right]){
                return new int[]{left+1,right+1};
            }else if(sumNeeded < numbers[right]){
                right--;
            }else{
                left++;
            }
        }
        return results;

    }
}
