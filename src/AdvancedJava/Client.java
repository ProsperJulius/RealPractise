package AdvancedJava;

public class Client {
    public static void main(String[] args) {
        A a =new B();
        B b = (B) new A();
        System.out.println(b.hashCode());
    }
}
