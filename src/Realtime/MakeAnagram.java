package Realtime;

import java.util.Arrays;

public class MakeAnagram {
    public static int makeAnagram(String a, String b) {

        char [] arr_a=a.toCharArray();
        char [] arr_b=b.toCharArray();
        Arrays.sort(arr_a);
        Arrays.sort(arr_b);
        int count=0;
        for(int i=0;i<a.length();i++){
            if(arr_a[i]!=arr_b[i]){
                count++;
            }
        }
        return count;


    }
}
