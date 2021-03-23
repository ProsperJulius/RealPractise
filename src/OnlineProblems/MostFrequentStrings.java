package OnlineProblems;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentStrings {

    public static String freqWord(String input) {

        if(input == null)return null;
        Map<String,Integer> wordFrequence = new HashMap<>();

        String[] splitInput = input.split(" ");
        if(splitInput == null) return null;
        //if(splitInput.length == 0) return what?;

        for(int i = 0; i < splitInput.length; i++) {
            if(wordFrequence.containsKey(splitInput[i])) {
                wordFrequence.put(splitInput[i] , wordFrequence.get(splitInput[i])+1);
            }
            else {
                wordFrequence.put(splitInput[i], 1);
            }
        }

        int numberOccurence = 0;
        String word = "";
        for(String keyWord :  wordFrequence.keySet()) {
            if(wordFrequence.get(keyWord) > numberOccurence) {  // compares the variable numberOcc [an integer]
                //to the max can you explain how the method get works,
                //it gets the key like in the case of getting a set of keys and it also gets the value to
                // the key like in the part of the code where it compares the value with numberOcc variable

                numberOccurence = wordFrequence.get(keyWord);
                word = keyWord;


            }

        }
        return word;
    }
    public static void main(String[] arg) {
        System.out.print(freqWord("nozie nozzie nozie noozie nozie noozie nozie"));

    }
}
