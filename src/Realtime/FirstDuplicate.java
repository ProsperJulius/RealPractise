package Realtime;

import java.util.*;
import java.util.stream.Collectors;

public class FirstDuplicate {
    public static int noneRepeatingCharacter(String word){
        if(word==null)return -1;
        LinkedHashMap<Character,Integer> structure=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<word.length();i++){
            if(structure.containsKey(word.charAt(i))){
                structure.put(word.charAt(i),-6);

            }else{
                structure.put(word.charAt(i),i);
               System.out.println("puting this "+word.charAt(i)+"at indext "+i);
            }

        }

            for(Integer value : structure.values()){
                System.out.println(value);
            }

        return -1;

    }
    public static int firstDuplicate(int [] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]<0){
                return nums[i];
            }else{
                nums[Math.abs(nums[i])-1]=nums[Math.abs(nums[i])-1]*-1;
                //System.out.println(nu)
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int nums[]={1,2,4,3,3,2,5,4};
        //System.out.println(noneRepeatingCharacter("leetcode"));
        System.out.println(missingNumbers(nums));

    }
    public static int duplicate(int [] ints){
        for(int i=0;i<ints.length;i++){
            if(ints[Math.abs(ints[i])-1]<0){
                return ints[i];
            }else{
                ints[Math.abs(ints[i])-1]=ints[Math.abs(ints[i])-1]*-1;
            }
        }
        return -1;
    }
    public static List<Integer> missingNumbers(int [] ints){
        List<Integer> results_list=new ArrayList<Integer>();
        for(int i=0;i<ints.length;i++){
            if(ints[Math.abs(ints[i])-1]>0)
            ints[Math.abs(ints[i])-1]=ints[Math.abs(ints[i])-1]*-1;
        }
        for(int i=0;i<ints.length;i++){

            if(ints[i]>0) results_list.add(i+1);
        }
        return results_list;

    }
}
