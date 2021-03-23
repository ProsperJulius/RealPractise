package Miscellenous;

public class LinkedListSorter {
   public Node listSorter(Node l1, Node l2){
       Node head =null;
       Node tail;
       Node result;

       if(l1==null || l2==null){
           return l1==null?l2:l1;
       }

     if(l1.value <=l2.value){
         head = l1;
         l1=l1.next;
     } else{
         head = l2;
         l2=l2.next;

     }
     result=head;
     tail=head;
     while(l1!=null && l2 !=null){
         if(l1.value <=l2.value){
             tail.next=l1;
             l1=l1.next;
         }else{
           tail.next =l2;
            l2=l2.next;
         }
    if(l1==null){
        tail.next=l2;
    }else{
        tail.next=l1;
    }
     }
     return result;
   }

    private class Node {
        int value;
        Node next;
        public Node(int value){
            this.value=value;
            next=null;
        }
    }
}
