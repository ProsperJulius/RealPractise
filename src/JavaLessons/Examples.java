package JavaLessons;

public class Examples {
    public static class Sommet {
        public String name;
        public Sommet(String name){
            this.name =name;
        }
        @Override
        public String toString() {
            return "Sommet{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        String myString = "nozie";
        String another ="nozie";
        myString= "prosper";

    }
    public static void printMe(Sommet mySommet){
   mySommet.name="grenoble";

    }
}