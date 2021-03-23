package Miscellenous;

public class BinarySearchE {

    public static boolean exists(int[] ints, int start, int end, int k) {
        if (start > end) {
            return false;
        } else {
            int m = (start+end) / 2 ;
            if (ints[m] == k) {
                return true;
            } else if (ints[m] > k) {
                return exists(ints, start, m - 1, k);
            } else {
                return exists(ints, m + 1, end, k);
            }
        }
    }
    public static void main(String [] args){
        int[] ints={-9,3,4,5,102,115};
        System.out.println(exists(ints,0,ints.length-1,115));
        System.out.println(exists(ints,0,ints.length-1,117));
    }

}
