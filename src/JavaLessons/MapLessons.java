package JavaLessons;

import java.util.*;

public class MapLessons {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(6);
        integerList.add(10);

        for(int i=0; i < integerList.size();i++){
            System.out.println(integerList.get(i));
        }
        for(Integer integer : integerList){
            System.out.println(integer);
        }
        Iterator<Integer> integerIterator = integerList.listIterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

    }

}
