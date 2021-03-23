package AdvancedJava;

import java.util.Collection;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CallablesDemo {
    public static void main(String[] args) {
        Collection<? extends Callable<String>> callables= Stream.iterate(0,n->n+1)
                .map(Mycallables::new).limit(10).collect(Collectors.toList());
        ExecutorService executor= Executors.newCachedThreadPool();
        try{
            Collection<Future<String>> futures=executor.invokeAll(callables);
            for (Future<String> future : futures) {
                String s = future.get();
                System.out.println(s);
            }

        }catch(InterruptedException | ExecutionException e){
            e.printStackTrace();
        }finally{
           executor.shutdown();
        }

    }

}
