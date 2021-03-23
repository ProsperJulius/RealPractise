package AdvancedJava;


import java.util.Comparator;

public class Dog extends Animal implements Comparable<Animal> {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "bark bark";
    }



    @Override
    public int compareTo( Animal o) {
        if(this instanceof Dog && o instanceof Cow){
        return 2;
        }else if (this instanceof Dog && o instanceof Dog){
            return 0;
        }else{
            return -1;
        }
    }

}
