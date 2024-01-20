package CrackingTheCodingInterview;

import java.util.Arrays;

public class CheckPermutation {
  public static boolean  isPermutationOf(String firstWord,String secondWord){
      if(firstWord==null || secondWord==null || firstWord.length()!=secondWord.length()){
          return false;
      }
      char[] firstWordChar= firstWord.toLowerCase().toCharArray();
      char[] secondWordChar=secondWord.toLowerCase().toCharArray();
      return isEqual(firstWordChar,secondWordChar);

  }
  public static boolean isEqual(char[] firstWord,char[] secondWord){
      Arrays.sort(firstWord);
      Arrays.sort(secondWord);
      return Arrays.equals(firstWord,secondWord);
  }

    public static void main(String[] args) {
        System.out.println(isPermutationOf("Big","gib"));
    }
}
