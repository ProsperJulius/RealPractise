package JavaLessons;

import java.util.Arrays;

public class reverseString {
    public static String reverse(String toreverse){
        if(toreverse==null) return null;
        int j = toreverse.length() -1;
        StringBuilder stringBuilder= new StringBuilder();
        while(j >=0 ){
            stringBuilder.append(toreverse.charAt(j));
            j--;
        }
       return stringBuilder.toString();
    }
   public char[] reverse(char [] toreverse){
       if(toreverse== null ) return null;
       if(toreverse.length==0) return  toreverse;
        int begin = 0;
        char swap =' ';
        int end = toreverse.length -1;
        while(begin <= end){
            swap = toreverse[end];
             toreverse[end] = toreverse[begin];
             toreverse[begin] = swap;
             begin++;
             end--;
        }
      return toreverse;
   }
    public static void main(String[] args) {
        System.out.println(reverse("Prosper"));
        int a=8;
        int b=9;
        int inter = a;
        a = b;
        b = inter;
        char [] nozie=null;
        char[] nelly= new char[0];
        System.out.println(nelly);
    }
    public static boolean isTwin(String firstString,String secondString){
        if(firstString==null || secondString== null) return false;
        if(firstString.length()!= secondString.length()) return false;
        char [] firstArrayChar = firstString.toCharArray();
        char [] secondArrayChar = secondString.toCharArray();
        Arrays.sort(firstArrayChar);
        Arrays.sort(secondArrayChar);
        return Arrays.compare(firstArrayChar,secondArrayChar)>0;
        /*
        int firstIdx = 0;
        while (firstIdx <= firstArrayChar.length -1 ){
           if(firstArrayChar[firstIdx] != secondArrayChar[firstIdx]){
               return false;
           }
           firstIdx++;
        }
        return true;*/
    }
}

