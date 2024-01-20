package onlineproblems;

import java.util.Arrays;

public class SecondLargest {

    public static int sum(int[] ints) {
        if (ints == null) return 0;
        if (ints.length == 0 || ints.length <= 3) return 0;
        int length=ints.length;
        int n =(length%2==0?length/2:(length+1)/2);
        int [] even= new int[n];
        int evenCounter=1;
        int oddCounter=0;
        int [] odd=new int[length/2];
        even[0]=ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (i % 2 == 0 ) {
                even[evenCounter]= ints[i];
                evenCounter++;

            } else {
                odd[oddCounter]=ints[i];
                oddCounter++;
            }

        }

        Arrays.sort(even);
        Arrays.sort(odd);
        return even[evenCounter-2]+odd[oddCounter-2];
    }
    public static void printArr(int [] ints){
        Arrays.stream(ints).forEach(System.out::print);
        System.out.println("");
    }

    public static void main(String[] args) {
        int [] ints={3,2,1,7,5,4};
        System.out.println(sum(ints));
    }
}
