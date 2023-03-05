package Miscellenous;

import java.awt.color.ICC_ColorSpace;
import java.util.HashMap;
import java.util.Map;

public class MakeAnagram {
    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAABBB"));
    }
    public static int makeAnagram(String a, String b) {
        // Write your code here
        Map<Character,Integer> characterFrequencyOne= new HashMap<Character,Integer>();
        Map<Character,Integer> characterFrequencyTwo= new HashMap<Character,Integer>();
        for(Character c : a.toCharArray()){
          if(!characterFrequencyOne.containsKey(c)){
            characterFrequencyOne.put(c,1);
          }else{
              characterFrequencyOne.put(c,characterFrequencyOne.get(c)+1);
          }
        }
        for(Character c : b.toCharArray()){
            if(!characterFrequencyTwo.containsKey(c)){
                characterFrequencyTwo.put(c,1);
            }else{
                characterFrequencyTwo.put(c,characterFrequencyTwo.get(c)+1);
            }
        }
        int deletions=0;
        for(Character c : characterFrequencyOne.keySet()){
            if(!characterFrequencyTwo.containsKey(c)){
                deletions+=characterFrequencyOne.get(c);
            }else if(characterFrequencyOne.get(c)!=characterFrequencyTwo.get(c)){
               deletions+= Math.abs(characterFrequencyOne.get(c)-characterFrequencyTwo.get(c));
            }
        }
        for(Character c : characterFrequencyTwo.keySet()){
            if(!characterFrequencyOne.containsKey(c)){
                deletions+=characterFrequencyTwo.get(c);
            }
        }

        return deletions;
        }
    public static int alternatingCharacters(String s) {
        // Write your code here
        if (s==null) return 0;
        char [] dataCharacters = s.toCharArray();
        int deletions=0;
        for(int i=0;i<dataCharacters.length;i++){
            int next=i+1;
            if(next<dataCharacters.length && dataCharacters[i]==dataCharacters[next]){

                deletions++;

            }
        }

        return deletions;

    }

}
