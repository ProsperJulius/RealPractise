package Miscellenous;

public class ReserveInteger {

public static int reverseInteger(int input){

    String inputAsString=String.valueOf(input);
    char[] characters=inputAsString.toCharArray();
    String results="";
      for(int i=characters.length-1;i>=0;i--){
          results+=characters[i];

      }
    int output=Integer.parseInt(results);
      return output;
}
    }

