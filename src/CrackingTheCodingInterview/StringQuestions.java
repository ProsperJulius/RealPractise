package CrackingTheCodingInterview;

import jdk.jfr.Timespan;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StringQuestions {

    private static boolean isUnique(String string) {

        if (string == null) return false;
        if (string.length() > 128) return false;
        boolean[] characterSet = new boolean[128];
        for (int i = 0; i < string.length(); i++) {
            int integerValueOfCaracter = string.charAt(i);
            if (characterSet[integerValueOfCaracter]) {
                return false;
            } else {
                characterSet[integerValueOfCaracter] = true;
            }
        }
        return true;
    }

    private static boolean checkPermutation(String firstString, String secondString) {
        if (firstString == null || secondString == null) return false;
    if (firstString.length() != secondString.length()) return false;

        return sortString(firstString).equals(sortString(secondString));
    }

    private static String sortString(String string) {
        char[] stringToChar = string.toCharArray();
        Arrays.sort(stringToChar);
        return new String(stringToChar);

    }
    public static Character firstReapitingCaracter(String input){

        boolean[] lookUpTable=new boolean[128];
        for(int i=0;i<input.length();i++){
            if(lookUpTable[input.charAt(i)]){
                return input.charAt(i);
            }else{
                lookUpTable[input.charAt(i)]=true;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(firstReapitingCaracter("advekok"));
    }
}
