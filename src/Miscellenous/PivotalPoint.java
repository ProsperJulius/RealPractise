package Miscellenous;
public class PivotalPoint {
   public static int findPivotalPoint(int [] ints){
       if(ints==null || ints.length==0) return -1;
       int totalSum=0;
       int arrayLength=ints.length;
       for(int i=0;i<arrayLength;i++){
           totalSum+=ints[i];
       }
       int leftsum=0;
       for(int i=0;i<ints.length;i++){
           if(totalSum-leftsum-leftsum==ints[i]){
               return ints[i];
           }else{
               leftsum+=ints[i];
           }
       }
       return -1;
    }
    public static void main(String[] args) {
       int [] ints ={5,8,1,5,21,5,1,4,9};
        System.out.println(findPivotalPoint(ints));
    }
}
