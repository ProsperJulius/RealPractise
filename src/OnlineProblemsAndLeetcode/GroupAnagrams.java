package OnlineProblemsAndLeetcode;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
         if(strs==null) return null;
         if(strs.length==0) return new LinkedList<>();
        Map<String,List<String>> lookUp= new LinkedHashMap<>();
       for(String word : strs){
           char [] chars = word.toCharArray();
           Arrays.sort(chars);
            String key=new StringBuilder().append(chars).toString();
            if(!lookUp.containsKey(key)){
                List<String> stringList= new LinkedList<>();
           lookUp.put(key,stringList);
            }
           lookUp.get(key).add(word);
       }

       return lookUp.values().stream().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String [] strings= {"ate","tea","hat","tah","bat"};
        groupAnagrams(strings);
    }
}
