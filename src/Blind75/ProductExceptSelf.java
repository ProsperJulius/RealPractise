package Blind75;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        if (nums == null || nums.length == 0) return nums;
        int size = nums.length;
        int[] productOutput = new int[size];
        int[] leftOutput = new int[size];
        int[] rightOutput = new int[size];
        leftOutput[0] = 1;
        rightOutput[size - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftOutput[i] = nums[i - 1] * leftOutput[i - 1];
        }
        for (int i = size - 2; i >= 0; i--) {
            rightOutput[i] = nums[i + 1] * rightOutput[i + 1];
        }

        for (int i = 0; i < size; i++) {
            productOutput[i] = leftOutput[i] * rightOutput[i];
        }
        return productOutput;

    }
}
