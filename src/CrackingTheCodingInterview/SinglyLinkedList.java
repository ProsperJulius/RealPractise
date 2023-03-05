package CrackingTheCodingInterview;

import java.util.HashSet;
import java.util.Set;

public class SinglyLinkedList {
    Node head;
    Node tail;
    public SinglyLinkedList(){
        this.head=null;
    }
    public SinglyLinkedList(int data){
        this.head= new Node(data);
    }

    public void add(int data){
        if(head==null){
            head=new Node(data);
            tail=head;
        }else{
            tail.next=new Node(data);
            tail=tail.next;
        }
    }
    private String printMe(){
        Node temp=head;
        StringBuilder builder=new StringBuilder();
        builder.append("[");
        while(temp!=null){
            builder.append(" "+temp.data);
            temp=temp.next;
        }
        builder.append("]");
        return builder.toString();
    }

    @Override
    public String toString() {
        return  printMe();
    }

    public void reverse(){
        Node temp=head;
        Node prev=null;
        Node walker=null;
        while(temp!=null){
            walker=temp.next;
            temp.next=prev;
            prev=temp;
            temp=walker;
        }
        head= prev;
    }
    public void removeDuplicates(){
        Set<Integer> lookUp= new HashSet<>();
        Node temp=head;
        Node prev=null;
        while(temp!=null){

            if(lookUp.contains(temp.data)){
                prev.next=temp.next;
            }else{
                lookUp.add(temp.data);
                prev=temp;
            }

            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.add(5);
        myList.add(5);
        myList.add(5);
        myList.add(52);
        myList.add(67);
        myList.add(67);
        myList.add(52);
        System.out.println(myList);
        myList.removeDuplicates();
        System.out.println(myList);
    }
}
