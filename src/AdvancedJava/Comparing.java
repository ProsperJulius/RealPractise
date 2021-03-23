package AdvancedJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Comparing {
    public static void main(String[]args){

        List<String> list = Arrays.asList("your jusa","Wassup man","aba_rue");
        Predicate<String> predicate = n-> n.contains("man");
      //  list.f;
        list.forEach(System.out::println);
     int sumed=   list.parallelStream().filter(predicate).mapToInt(m->m.length()).sum();
        System.out.println(sumed);
      List<String> newList=  list.parallelStream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println("Old list");
      System.out.println(list);
        System.out.println("new list");
        System.out.println(newList);
    }
}
