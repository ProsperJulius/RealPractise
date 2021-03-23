package Miscellenous;

import java.util.HashSet;
import java.util.LinkedList;
public class OntheRun {

    public static  int possibleCombinations(LinkedList<Integer> lists, int target){
        HashSet<Integer> setOfIntegers=new HashSet<>();
        LinkedList<Integer> linkedListOfIntegers=new LinkedList<>();
        int current=0;
        int counter=0;
        for(Integer number : lists){
            setOfIntegers.add(number);
        }



        linkedListOfIntegers.addAll(setOfIntegers);

        for(int i=0;i<linkedListOfIntegers.size();i++){
            current=linkedListOfIntegers.get(i);
            for(int k=i+1;k<linkedListOfIntegers.size();k++){
                if(linkedListOfIntegers.get(k)+current==target){
                    counter+=1;
                }
            }
        }
   return counter;
    }
}
