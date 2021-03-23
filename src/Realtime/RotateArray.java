package Realtime;

import java.util.Collections;

public class RotateArray {
    static int[] rotLeft(int[] a, int d) {
        d%=a.length;
        reverseArray(a,0,a.length);
        reverseArray(a,a.length-d,a.length-1);

        return  a;




    }
    static void reverseArray(int [] sums,int start,int end){
        while(start<end){
            int temp=sums[end];
            sums[end]=sums[start];
            sums[start]=temp;
            start++;
            end--;
        }

    }
}
