package Miscellenous;

public class BiggestDivider {

   public static void main(String[] args){
      // System.out.println("the result is: "+GCD(19,16));
       int input[]={2,26,4,28,12};
      System.out.println(GCD(input));
   }
    public static int GCD(int n, int m){

       while(n!=m){
           if(n>m){
               n=n-m;
           }else{
               m=m-n;
           }
       }
       return n;
    }


public static int GCD(int arr[]){
    return GCD(arr,arr.length);
}
public static int GCD(int arr[],int length){

  int result=arr[0];
  for(int i=0;i<length;i++){
      result=GCD(arr[i],result);
  }
  return result;
}
}