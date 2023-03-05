package OnlineProblemsAndLeetcode;

import java.util.Arrays;

public class ProductSmallestPair {

    public static int productSmallestPair(int sum,int [] ints){

        if(ints==null) return -1;
        if(ints.length <2) return -1;
        Arrays.sort(ints);
        int sumOfLeastTwoElements=ints[0]+ints[1];
        int productOfLeastTwoElements=ints[0]*ints[1];
        return  sumOfLeastTwoElements<9?productOfLeastTwoElements:0;
    }

    public static void main(String[] args) {
        int [] ints={9,8,3,-7,3,9};
        System.out.println(productSmallestPair(4,ints));
    }
}
