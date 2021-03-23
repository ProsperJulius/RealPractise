package Data_Structure;

import java.util.*;

public class DataStructures {

    public static void main(String[] args){
        Collection list= Arrays.asList("red","blue","orange","indigo");
        Iterator list_iterator= list.iterator();
        LinkedList linkedList=new LinkedList();
        Stack stack=new Stack();
        for (int i = 0; i <10 ; i++) {
            stack.push(i);


        }
        while(!stack.empty()){
            System.out.print(stack.pop());
            System.out.print(",");
        }
        System.out.println("Lift-Off");
        Queue queue=new LinkedList();
        for (int i = 1; i < 11; i++) {
            queue.add(i);
        }
        int removedItem= (int) queue.poll();
        int next_item=(int)queue.peek();
        System.out.println("the remove item is: "+ removedItem);
        System.out.println("the next item is: "+next_item);
        System.out.println(queue);



}}
