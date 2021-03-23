package DesignPatterns;

import java.util.Iterator;
import java.util.List;

public class CustomIterator implements Iterator<Product> {

    private List<Product> productList;
    private int index=0;
    public CustomIterator(List<Product> productList){
        this.productList=productList;
    }
    @Override
    public boolean hasNext() {
        return index<productList.size();
    }

    @Override
    public Product next() {
        if(hasNext()){
            return productList.get(index++);
        }
        return null;
    }

}
