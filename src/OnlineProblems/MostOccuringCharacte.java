package OnlineProblems;

import java.util.HashMap;
import java.util.Map;

public class MostOccuringCharacte {


   public static String mostOccuringCharacter(String string){
       Map<Character,Integer> characterMap=new HashMap();
       for(int i=0;i<string.length();i++){
           if (!characterMap.containsKey(string.charAt(i))){
               characterMap.put(string.charAt(i),1);
           }else{
               characterMap.put(string.charAt(i),characterMap.get(string.charAt(i))+1);
           }
       }
       int max=0;
       int possibleMax;
       char possibleCaracter = 'p';

       for(Character character : characterMap.keySet()){
           possibleMax=characterMap.get(character);
           if(possibleMax>max){
               max=possibleMax;
               possibleCaracter=character;
           }
       }

       return new StringBuffer().append(max).
               append(possibleCaracter).toString();

   }

    public static void main(String[] args) {

       System.out.println(mostOccuringCharacter("prpprosoppper"));
       String paragraph = "noxi noxi xoxo hey";
       String []  arrayString = paragraph.split(" ");
    }
}
