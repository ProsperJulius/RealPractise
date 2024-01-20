package onlineproblems;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesAndMaintainOrder {
    public static int [] removeDuplicates(int [] ints){
        LinkedHashSet<Integer> nonDuplicates= new LinkedHashSet<>();
        List<Integer> integerList=
                (List<Integer>) Arrays.stream(ints).boxed().collect(Collectors.toList());
        nonDuplicates.addAll(integerList);
        int [] duplicatesRemoved= new int[nonDuplicates.size()];
        int i=0;
        for(Integer integer : nonDuplicates){
            duplicatesRemoved[i]=integer;
            i++;
        }
        return duplicatesRemoved;
    }

    public static void main(String[] args) {
        int [] ints={1,2,2,2,2,5,6,9,3,3,35,2,0};
      removeDuplicates(ints);
        int i=0;
    }

    }

