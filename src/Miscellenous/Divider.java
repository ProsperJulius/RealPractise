package Miscellenous;

public class Divider {

    public int biggestDivider(int arr[]){
        int result=0;



        return result;

    }

  public static int peekFinder(int arr[]){
    return   peekFinder(arr,0,arr.length-1,arr.length);
  }
  public static int peekFinder(int arr[],int low,int high,int n){

        int mid=low +(high-low)/2;
        if((mid==0||arr[mid]>=arr[mid-1]) && (arr[mid]>=arr[mid+1]||(mid==n-1))){
            return arr[mid];
        }else if(mid>0 &&(arr[mid]>=arr[mid-1])){
            return peekFinder(arr,mid+1,high,n);
        }else{
            return peekFinder(arr,low,mid-1,n);
        }


  }
  public static void main(String[] args){
        int []input={1,2,16,35,78,56,76,98};
        System.out.println(peekFinder(input));
  }
}
