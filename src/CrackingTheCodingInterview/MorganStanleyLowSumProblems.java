package CrackingTheCodingInterview;

import java.util.*;

public class MorganStanleyLowSumProblems {
    public static int getMinimumCost(List<Integer> numbers){
        if(numbers == null || numbers.size() == 0) return -1;
        Map<Integer,Integer> numbersAndTheirOccurencies =  new LinkedHashMap<>();
        for(Integer num : numbers){
            numbersAndTheirOccurencies.put(num, numbersAndTheirOccurencies.getOrDefault(num,0)+1);
        }
        Comparator<Integer> comparatorByOccurency = (number1, number2)->{
            if(numbersAndTheirOccurencies.get(number1)>numbersAndTheirOccurencies.get(number2)){
                return -1;
            }else if(numbersAndTheirOccurencies.get(number2)>numbersAndTheirOccurencies.get(number1)){
                return 1;
            }else{
                return number2.compareTo(number1);
            }
        };
        numbers.sort(comparatorByOccurency);
        int secondPointer = 1;
        int sum = 0;
        for(int i = 0;i<numbers.size();i++){
            sum+=numberOfDistinctItems(numbers.subList(0,secondPointer));
            secondPointer++;
        }
        return sum;
    }
   public static int numberOfDistinctItems(List<Integer> numbers){
        Map<Integer,Integer> numberOfOccurences = new HashMap<>();

        for(Integer num : numbers){
            numberOfOccurences.put(num,numberOfOccurences.getOrDefault(num,0)+1);
        }
        return numberOfOccurences.keySet().size();
   }
    public static void main(String[] args) {
        List<Integer> numbers =  new ArrayList<>();
        numbers.addAll(List.of(1,2,3,4,44,4,4,4,5,5,53,2,2,5));
        System.out.println(getMinimumCost(numbers));
    }

    public static class OneAway {
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
}
