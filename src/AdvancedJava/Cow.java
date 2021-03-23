package AdvancedJava;

public class Cow extends Animal{
    public Cow(String name) {
        super(name);
    }


    @Override
    public String getName() {
        return "Cow";
    }

    @Override
    public String sound() {
        return "mou";
    }
}
