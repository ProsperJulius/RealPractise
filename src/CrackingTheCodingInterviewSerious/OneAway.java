package CrackingTheCodingInterviewSerious;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class OneAway {
    public static boolean oneAway(String initialWord,String modifiedString){
        if(initialWord==null || modifiedString==null) return false;
        if(initialWord.length()==modifiedString.length()){
            return oneEditReplace(initialWord,modifiedString);
        }else if(initialWord.length()-1==modifiedString.length()){
            return oneEditInsert(modifiedString,initialWord);
        }else if(initialWord.length()+1==modifiedString.length()){
            return oneEditInsert(initialWord,modifiedString);
        }else{
            return false;
        }
    }
    public static boolean oneEditReplace(String originalString, String modifiedString){
        boolean differenceFound=false;
        for(int i=0;i<originalString.length();i++){
            if(originalString.charAt(i)!=modifiedString.charAt(i)){
                if(differenceFound){
                    return false;
                }
                differenceFound=true;
            }
        }
        return true;
    }
    public static boolean oneEditInsert(String originalString, String modifiedString){
        int index1=0;
        int index2=0;
        while(index1 < originalString.length() && index2 <modifiedString.length()){
            if(originalString.charAt(index1)!=modifiedString.charAt(index2)){
                if(index1!=index2){
                    return false;
                }
                index2++;
            }else{
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(oneAway("pale","ple"));
        System.out.println(oneAway("pales","pale"));
        System.out.println(oneAway("pale","bale"));
        System.out.println(oneAway("pale","bae"));
        System.out.println(oneAway("pale","baless"));
    }
}
