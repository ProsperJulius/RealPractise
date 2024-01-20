package Blind75;

public class SortColors {
    public void sortColors(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int currentIndex = 0;
        while (start < end && currentIndex <= end) {

            if (nums[currentIndex] == 0) {
                nums[currentIndex]=nums[start];
                nums[start] =0;
                start++;
                currentIndex++;
            }else if(nums[currentIndex] == 2){
                nums[currentIndex] = nums[end];
                nums[end] = 2;
                end--;
            }else{
                currentIndex++;
            }
        }

    }
}
