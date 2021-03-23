package AdvancedJava;

public abstract class Animal {
    private String name;
    public Animal(String name){
        this.name=name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String sound(){
      return "anysound";
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
