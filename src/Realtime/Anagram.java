package Realtime;

import java.util.Arrays;

public class Anagram {

    public static boolean verifyAnagram(String first,String second){
        if (first.length()!=second.length()) return false;
        char [] firstArray=first.toCharArray();
        char [] secondArray=second.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray,secondArray);
    }
    public static boolean verifyExistance(int [] input,int element){
        int length=input.length;
        
        if(input[length/2]>element){
            for(int i=0;i<length/2;i++){
                if(input[i]==element)return true;
            }
        }else{
            for(int i=length/2;i<=length-1;i++){
                if(input[i]==element)return true;
            }
        }
        return false;
    }
    public static int verifyExistance(int [] input, int left, int right,int key){
        int   mid= left+(right-left)/2;
        if(right>=left){

           if(input[mid]==key){
               return mid;
           }
        }

        if(input[mid]>key){
            return verifyExistance(input,left,mid-1,key);

        }else{
            return verifyExistance(input,mid+1,right,key);
        }
    }

    public static void main(String[] args){
       // System.out.println(Anagram.verifyAnagram("prosper","reporp"));
        int [] array={3,4,5,8,9,10,11,23,56,78,103};
        System.out.println(Anagram.verifyExistance(array,0,10,103));
    }
}
