package OnlineProblemsAndLeetcode;

import java.util.*;

public class TopKElements {
    public static Collection<Integer> topKElements(List<String> words, int k){


       Map<String,Integer> frequencies = new HashMap<>();
       if(words == null || words.size() == 0) return null;
       for(String word : words){
           frequencies.put(word,frequencies.getOrDefault(word,0)+1);
       }
        Comparator<String> stringComparator = (firstWord,secondWord)-> {
           int firstWordLength =  frequencies.get(firstWord);
           int secondWordLength = frequencies.get(secondWord);
           if(firstWordLength == secondWordLength) return secondWord.compareTo(firstWord);
           return firstWordLength - secondWordLength;
        };
        PriorityQueue<String> wordsThatMeetCriteria =  new PriorityQueue<>(stringComparator);
       for(String word : frequencies.keySet()){
           wordsThatMeetCriteria.add(word);
           if(wordsThatMeetCriteria.size()> k) wordsThatMeetCriteria.poll();
       }
        System.out.println(wordsThatMeetCriteria);

        return null;

    }

    public static void main(String[] args) {
        topKElements(List.of("i","love","leetcode","i","love","coding","love"),2);
    }
}
