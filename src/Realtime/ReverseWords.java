package Realtime;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWords {
    public static String reverseWords(String word){
        String [] splittedWords=word.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for(String element : splittedWords){
            StringBuilder builder=new StringBuilder(element);
            stringBuilder.append(builder.reverse());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String [] args){
      System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
