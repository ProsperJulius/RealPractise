package AdvancedJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AnimalClient {

    public static void printAnimal(List<Animal> animals){
        animals.parallelStream().map(Animal::getName).forEach(System.out::println);
    }
    public static <T extends Animal> void printAnyAnimal(List<T> allAnimals){
       // List<String> strings=allAnimals.stream().collect(Colle);
    }
    public static void printAllFiltered(List<? extends Animal> animals, Predicate<? super Animal> predicate){
        animals.stream().filter(predicate).map(Animal::getName).forEach(System.out::println);
    }

    public static void main(String[] args) {
      List<String> numbers =Arrays.asList("tiger","wolf","brave","smart","tiger","brave");
      List<Animal>  animals= numbers.stream().map(Dog::new).collect(Collectors.toList());


      //  System.out.println(name_dog_list.toString());
    }
}
