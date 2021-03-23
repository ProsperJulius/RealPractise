package Realtime;

public class LongestSequence {
    public int longestSequence(int[] nums){

        int length=nums.length;

        int count =0;
        int max=1;
        for(int i=0;i<length;i++){
            count=i==0?1:count;
            if(nums[i]>nums[i-1]){
                count++;
            }else{
                max=(max<count?count:max);
                count=1;
            }
        }
        max=(max<count?count:max);
        return max;

    }
}
