package Realtime;

import java.util.ArrayList;
import java.util.List;

public class reverseArray {
    public static int[] reverseArr(int []nums){
        int length=nums.length;
        int permu=0;//variable for permutation
        int i=0,j=length-1;
        while(i<j){
            permu=nums[i];
            nums[i]=nums[j];
            nums[j]=permu;
            i++;j--;

        }
        return nums;

    }
    public static int[] rotateArr(int [] nums,int k){
        if (k==nums.length) return nums;
        int length=nums.length;
 for(int j=0;j<k;j++){
        int prev=nums[length-1];
        int permutation=0;// variable for permutation
        for(int i=0;i<length;i++){

                permutation=prev;
                prev=nums[i];
                nums[i]=permutation;


            }

        }
 return nums;
    }


    public static void main(String [] args){
         int [] input_data={1,2,3,4,5,6,7};
         input_data=rotateArr(input_data,7);

        System.out.println(9%7);
        ArrayList<Integer> list=new ArrayList();
       // int inp=list.toArray();
    }
}
