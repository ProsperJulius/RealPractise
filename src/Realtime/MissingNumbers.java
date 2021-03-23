package Realtime;

import java.util.*;

public class MissingNumbers {
    public List<Integer> misNum(int[] nums){
        int value=0;
        List<Integer> result_list=new ArrayList<>();
        if(nums==null) return null;// if the array is empty return null;
        for(int i=0;i<nums.length;i++){
            value= Math.abs(nums[i])-1;
            if(value>0){
                nums[value]*=-1;
            }

        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) result_list.add(i+1);
        }
        return result_list;
    }
    public static List<Integer> missingNumbers(int[] nums) {


        LinkedHashSet<Integer> hash_set = new LinkedHashSet<>();
        List<Integer> result_list = new ArrayList<>();
        for (int element : nums) {
            hash_set.add(element);
        }
        int counter = 1;

        while (counter <= nums.length) {
            if (!hash_set.contains(counter)) result_list.add(counter);
            counter++;
        }
        return result_list;
    }

    public static List<Integer> themMissing(int[] nums) {
        List<Integer> result=new ArrayList<>();
   for(int i=0;i<nums.length;i++){
       int value=Math.abs(nums[i])-1;
       if(nums[value]>0) nums[value]*=-1;
   }
   for(int i=0;i<nums.length;i++){
       if(nums[i]>0) result.add(i+1);
   }
    return result;
    }


    public static void main(String[] args){
        int [] nums={1,1};
        List<Integer> list=themMissing(nums);
        System.out.println(list);
    }
}
