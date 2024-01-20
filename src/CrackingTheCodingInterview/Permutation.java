package CrackingTheCodingInterview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Permutation {
    public static boolean permutationOfPalindrome(String word){
        Map<Character,Integer> characterIntegerMap= new LinkedHashMap<>();
        char[] wordInChar=word.toCharArray();
        for(int i=0;i<word.length();i++){
            Character key=wordInChar[i];
            if(characterIntegerMap.containsKey(key)){
                int newNumberOfCounts=characterIntegerMap.get(key)+1;
                characterIntegerMap.put(key,newNumberOfCounts);
            }else{
                characterIntegerMap.put(key,1);
            }
        }
        int numberOfOddNumbers=0;
        for(int value: characterIntegerMap.values()){

            if(value%2!=0){
                numberOfOddNumbers++;
            }
        }
        return numberOfOddNumbers>1?false:true;
    }

    public static void main(String[] args) {
        System.out.println(permutationOfPalindrome("taco cat"));
    }
}
