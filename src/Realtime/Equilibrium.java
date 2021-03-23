package Realtime;

public class Equilibrium {

    public static int equilibriumPoint(int[] ints){
        int sum_array=0;
        for(int i=0;i<ints.length;i++){
            sum_array+=ints[i];
        }
        int [] pre_sums=new int[ints.length];
        pre_sums[0]=ints[0];
        for(int i=1;i<ints.length;i++){
            pre_sums[i]=ints[i]+pre_sums[i-1];
        }
        for(int i=1;i<ints.length-1;i++){
            if((pre_sums[i]-ints[i])==(sum_array-pre_sums[i])){
                return ints[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] ints={2,2,4,3,1,6,5};
        System.out.println(equilibriumPoint(ints));
    }
}
