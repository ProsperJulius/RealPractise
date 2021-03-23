package Miscellenous;

public class ArraySort {



    public static int[] arraySort(int[] array){
        int length=array.length;// length of the array
        int permuntationVariable=0;
        for(int i=0;i<length;i++){

            for(int j=i+1;j<length;j++){
                if(array[i]>array[j]){
                    permuntationVariable=array[i];
                    array[i]=array[j];
                    array[j]=permuntationVariable;
                }
            }
        }
        return array;
    }

    public static void mergeSort(int[] array,int[] left_array,int[] right_array,int left_length,int right_length){
     int l=0;int i=0;int r=0;
     while(l<left_length && r< right_length){

         if(left_array[l] <= right_array[r]){
             array[i++]=left_array[l++];
         }else{
             array[i++]=right_array[r++];
         }
     }
     while(l<left_length){
         array[i++]=left_array[l++];
     }
     while(r<right_length){
         array[i++]=right_array[r++];
     }

    }

        public static void divideArray(int[] array,int arrayLength){

        if(arrayLength<2){
            return;
        }else{
            int mid=arrayLength/2;
            int [] left_array=new int[mid];
            int [] right_array=new int[arrayLength-mid];
            int k=0;
            for(int i=0;i<arrayLength;i++){
                if(i<mid){
                    left_array[i]=array[i];
                }else{
                    right_array[k++]=array[i];
                }
            }
            divideArray(left_array,mid);
            divideArray(right_array,arrayLength-mid);
            mergeSort(array,left_array,right_array,mid, arrayLength-mid);
        }


        }
    }

