package DesignPatterns;

import Realtime.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Products implements Iterable<Product>{
    private List<Product> linkedList=null;
    public Products(){
        this.linkedList= new ArrayList<>();
    }

    public void add(Product product){
        linkedList.add(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return new CustomIterator(linkedList);
    }
}
