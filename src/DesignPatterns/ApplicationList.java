package DesignPatterns;


public class ApplicationList {

    public static void main(String[] args) {
        GenericList<String> stringGenericList = new GenericLinkedList<>();
        stringGenericList.add("prosper");
        stringGenericList.add("Mavunga");
        stringGenericList.add("is");
        stringGenericList.add("a");
        stringGenericList.add("genius");
        GenericList<Integer>  genericList= new GenericLinkedList<>();
        genericList.add(8);
        genericList.add(9);

     for(String word : stringGenericList){
         System.out.println(word);
     }
     for(Integer integer : genericList){
         System.out.println(integer);
     }
    }
}
