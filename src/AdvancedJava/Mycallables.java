package AdvancedJava;

import java.util.concurrent.Callable;

public class Mycallables implements Callable<String> {
    private int id;
    public Mycallables(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Mycallables{" +
                "id=" + id +
                '}'+" " +Thread.currentThread().getName();
    }
}
