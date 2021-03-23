package Realtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Interview {

    private int temp;

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,36,6,5,6,8,9,20);
        Predicate<Integer> predicate= ( n) -> n > 4;
        list.parallelStream().filter(predicate).forEach(System.out::print);

    }
    public static int [][] transpose(int [][] original){
        int [][] cloneBle=new int [original[0].length][original.length];
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                cloneBle[i][j]=original[j][i];

            }

        }
        return  cloneBle;
    }
    public static void printMe(int [][] prosperM){
        for (int i = 0; i < prosperM.length; i++) {
            for (int j = 0; j < prosperM[i].length-1; j++) {
                System.out.print(prosperM[j][i]+", ");

            }
            System.out.println();

        }
    }
}

