package OnlineProblems;

import java.util.*;
import java.util.stream.Collectors;

public class MapReduceStreams {
    public static void main(String[] args) {
        List<Product> productList=
                List.of(new Product("Ricae",2250),new Product("Meat",200),new Product("Vaeg",250));

    List<Product> sortedProducts=
            productList.stream().
                    filter(product -> product.getName().contains("t")).
                    sorted((a,b)-> a.getPrice().compareTo(b.getPrice())).collect(Collectors.toList());
        System.out.println(sortedProducts);

      Optional<Product> maxProduct= productList.stream().reduce((firstProduct, secondProduct)->
                firstProduct.getPrice()>secondProduct.getPrice()?firstProduct:secondProduct
                );
        System.out.println(maxProduct);
    }
    public static class Product{

        private final String name;
        private final Integer price;

        public Product(String name, Integer price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return price == product.price && name.equals(product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price);
        }

        public String getName() {
            return name;
        }

        public Integer getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
