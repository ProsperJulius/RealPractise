package JavaLessons;

public class Animal {
    String name ="animal";
    String color = "black";
    public Animal(){

    }
    public Animal(String name,String color){
        this.name =name;
        this.color=color;
    }

    public void eat(){
        System.out.println("I am animal and I eat anything");

    }
    public void drink(){}
}
interface RunningObjects{
    void running();

}
 class Cow extends Animal implements RunningObjects  {
    String breed="";
    public Cow(String breed){
     }
     public Cow(String breed, String color){
        super(breed,color);

     }
     public void eat(){
         super.eat();
         System.out.println("I am a cow and I eat");
     }
     public static Cow valueOf(String breed, String color){
        return new Cow(breed,color);
     }

     @Override
     public void running() {
         System.out.println("I can run super fast");
     }
 }
class ExecuteMain{
    public static void main(String[] args) {
        Cow cow = new Cow("zebu");
        cow.eat();
        Animal cows= new Cow("braman");
        RunningObjects runningObjects= new Cow("blabla");

    }
}
