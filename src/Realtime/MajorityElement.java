package Realtime;

import java.util.Arrays;

public class MajorityElement {
    public static int majorityExist(int[] array){
        Arrays.sort(array);
        int max_elem= array.length/2;
        int counter=0;
        int temp=array[0];
        int thereal=0;
        int max=0;
        counter++;
        for(int i=1;i<array.length;i++){

            if(temp==array[i]){
                counter++;
                if(counter>max){
                  max=counter;
                  thereal=temp;

                }
            }
            else{
                temp=array[i];
                counter=1;
            }



        }
        return thereal;
    }
    public static String reverseString(String input){
        /*
        * function for reversing a string */
        char [] result=input.toCharArray();
        StringBuilder finalResult=new StringBuilder();
        for(int i=result.length-1;i<0;i--){
            finalResult.append(result[i]);
        }
        return finalResult.toString();

    }
    public static boolean checkPalandrone(String input){
        return checkPalandrone(input,0,input.length()-1);

    }
    public static boolean checkPalandrone(String input,int left,int right){
        if(left>=right)return true;
        if(input.charAt(left)==input.charAt(right)){
            return checkPalandrone(input,left+1,right-1);

        }else{
            return false;
        }
    }
    public static boolean checkPalandroneWord(String prosper){
        String [] input=prosper.split(" ");
        System.out.println(input[0]+" "+input[1]);
        return checkPalandroneWord(input,0, input.length-1);
    }
    public static boolean checkPalandroneWord(String [] input,int left,int right){
        if(left>=right)return true;
        if(input[left].equals(input[right])){
            return checkPalandroneWord(input,left+1,right-1);
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int [] array={2,2,1,1,1,2,2};
        System.out.println(checkPalandroneWord("prosper julius prosper "));

    }
}
