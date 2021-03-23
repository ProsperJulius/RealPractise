package Realtime;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Isomophic {
    public static boolean isIsomophic(String s, String t){
        LinkedHashMap<Character,Character> theHashMap=new LinkedHashMap<>();
        for(int i=0; i<s.length();i++){
            if(theHashMap.containsKey(s.charAt(i))){
                if(theHashMap.get(s.charAt(i))!=t.charAt(i)) return false;
            }else{
                if(!theHashMap.containsValue(t.charAt(i))){
                theHashMap.put(s.charAt(i),t.charAt(i));}else{
                    return false;
                }
            }
        }
        return true;
    }

   public static void numberTimes(String string){
        HashMap<Character,Integer> counter=new HashMap<>();
        for(int i=0;i<string.length();i++){
            if(counter.containsKey(string.charAt(i))){
                counter.put(string.charAt(i),counter.get(string.charAt(i))+1);
            }else{
                counter.put(string.charAt(i),1);
            }
        }
        int mx=0;
        char thewanted = 0;
        for(Character xchars : counter.keySet()){
            if(counter.get(xchars)>mx){
                mx=counter.get(xchars);
                thewanted=xchars;
            }
            
        }
       System.out.println("the most appering character is "+thewanted+" with a number of times "+ mx);
   }
   public static boolean canPlaceFlowers(int [] ints,int n){
        int numflowers=0;
        int array_length=ints.length;//length of the array
       if((array_length+1/2)<n)return false;
        for(int i=0;i<array_length;i++){

            if(ints[i]==0){
                int prev=(i==0?0:ints[i-1]);
                int next=(i==array_length-1?0:ints[i+1]);
                if(next==0 && prev==0){
                    numflowers++;
                    ints[i]=1;
                    if(numflowers>=n) return true;
                }


            }
        }
        return numflowers>=n;// this line is very important revise it oftenly baby baby
   }
    public static void main(String[] args){
        int [] ints={1,0,1,0,1,0,1};
        System.out.println(canPlaceFlowers(ints,0));
    }
}
