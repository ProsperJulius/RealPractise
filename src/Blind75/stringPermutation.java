package Blind75;

import java.util.ArrayList;
import java.util.List;

public class stringPermutation {
    public static List<String> permutate(String word) {

        List<String> results = new ArrayList<>();
        permutateHelper(results,"", word);
        return results;

    }

    private static void permutateHelper(List<String> results,String choice, String rest){

        if(rest.isEmpty()){
            results.add(choice);
        }else{
            for( int i =0; i < rest.length();i++){
                permutateHelper(results,choice+rest.charAt(i),rest.substring(0,i));
                choice = choice.substring(choice.length()-1);


            }
        }
    }

    public static void main(String[] args) {
        System.out.println(permutate("abc"));
    }
}
