package Realtime;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TheLargestKElement {

    int k;
    PriorityQueue<Integer> queue;
    public TheLargestKElement(int k,int[] nums){
        queue=new PriorityQueue<>();
         this.k=k;
        for(int number : nums){
            queue.add(number);
        }

    }
    public int add(int val){
        queue.add(val);
        if(queue.size()>k)queue.remove();
        return queue.peek();


    }

}
