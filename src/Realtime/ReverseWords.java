package Realtime;

public class ReverseWords {
    public static String reverseWords(String word){
        String [] input_words=word.split(" ");
        StringBuilder stringBuilder=new StringBuilder();

        for(int i=0;i<input_words.length;i++){
            StringBuilder builder=new StringBuilder(input_words[i]);
            stringBuilder.append(builder.reverse());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String [] args){
      System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
