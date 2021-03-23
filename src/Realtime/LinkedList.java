package Realtime;

import java.util.HashSet;

public class LinkedList
{
Node root;
Node tail;
 public LinkedList(){
     Node root=null;

 }
 public void addValue(int value){
     if(root==null){
         root=new Node(value);
         tail=root;

     }else{
         tail.next=new Node(value);
         tail=tail.next;

     }
 }
 public void addTop(int value){
     Node head=new Node(value);
     head.next=root;
     root=head;
 }
 public void deleteItem(int value){
     Node temp=root;
     while(temp!=null &&temp.value!=value){
     temp=temp.next;}
     if(temp.value==value){
         temp.value=  temp.next.value;
         temp.next=temp.next.next;
     }


 }
 public void removeLoops(){
     Node temp=root;
     Node head;
     Node tail_;
     HashSet<Integer> elementsOfTheList=new HashSet<Integer>();
     head=new Node(temp.value);
     tail_=head;
     elementsOfTheList.add(temp.value);
     temp=temp.next;

     while(temp!=null){
         if(!elementsOfTheList.contains(temp.value)){

             tail_.next=new Node(temp.value);
             tail_=tail_.next;
             elementsOfTheList.add(temp.value);
         }
         temp=temp.next;
     }
     root=head;
 }
 public void displayList(){
     Node temp=root;
     while(temp!=null){
         System.out.println(temp.value);
         temp=temp.next;
     }
 }
 public void reverseList(){
     Node temp=this.root;
     Node prev=null;
     Node next=temp.next;
     while(temp!=null && next!=null){
         temp.next=prev;
         prev=temp;
         temp=next;
         next=next.next;
         //System.out.println("temp is "+temp.value);

     }
     temp.next=prev;
     root=temp;

 }
 public static Node reverseList(Node current, Node stop){
     if(current==null)return null;
     Node prev=null;
     Node next=current.next;
     while(current!=null && next!=stop){
         current.next=prev;
         prev=current;
         current=next;
         //System.out.println(current.value);
         next=next.next;

     }
     current.next=prev;
     return current;

 }
 public static int sizeList(Node head){
     int length=0;
     while(head!=null){
         length++;
         head=head.next;
     }
     return length;
 }
 public static Node reverseListByK(Node root,int k){
     if(root==null)return null;
     Node stop=null;
     Node temp=root;
     Node result=null;
     int i=0;
     int length=sizeList(root);
     if(k>length) k=k%length;
     if(k==0)return root;
     Node first=reverseList(root,null);
     temp=first;
     while(i<k){
         temp=temp.next;
         i++;
     }

     stop=temp;
     Node first_part=reverseList(first,stop);


     Node second_part=reverseList(stop,null);
    result=first_part;
     while(first_part.next!=null){

         first_part=first_part.next;
     }

     first_part.next=second_part;
     return result;
 }
 public static boolean palendrone(Node root){
     if(root==null)return false;
     Node fast=root;
     Node slow=root;
     while(fast!=null && fast.next!=null){
         fast=fast.next.next;
         slow=slow.next;
     }
     Node prev=null;
     Node current=slow;
     Node next=slow.next;
     while(current!=null && next!=null){

         current.next=prev;
         prev=current;
         current =next;
         next=next.next;


     }
     current.next=prev;
     while(current!=null && root!=null){
         if(root.value!=current.value)return false;
         current=current.next;
         root=root.next;

     }
     return true;
 }
public static void main(String[] args){
     LinkedList list=new LinkedList();
     list.addValue(1);
     list.addValue(2);
     list.addValue(3);
     list.addValue(2);
     list.addValue(1);

System.out.println(palendrone(list.root));



}
}
