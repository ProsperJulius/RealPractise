package DesignPatterns;

public class ApplicationMain {
    public static void main(String[] args) {

        //Products products = new Products();
        GenericLinkedList<Product> products=new GenericLinkedList<>();
        products.add(new Product("banane",34));
        products.add(new Product("apples",43));
        products.add(new Product("pechees",23));
        for(Product product : products){
            System.out.println(product);
        }
    }
}