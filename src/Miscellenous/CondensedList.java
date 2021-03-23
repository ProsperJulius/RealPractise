package Miscellenous;

import java.util.HashSet;


public class CondensedList {

    LinkedListNode head=null;
    LinkedListNode tail=null;


    public void addLast(int value){
        LinkedListNode linkedListNode=new LinkedListNode(value);
        if(head==null){
            head= linkedListNode;
            tail= linkedListNode;
        }else{
            tail.next= linkedListNode;
            tail= linkedListNode;
        }
    }
    public void printList(){
        LinkedListNode temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public  class LinkedListNode {
        int value;
        LinkedListNode next;
        public LinkedListNode(int value){
            this.value=value;
            this.next=null;
        }

    }
    public LinkedListNode mergeList(LinkedListNode list1, LinkedListNode list2){
        if(list1==null || list2==null){
            return list1==null?list2:list1;
        }
        LinkedListNode head=null;
        LinkedListNode tail=null;
        if(list1.value<list2.value){
            head=new LinkedListNode(list1.value);

            list1=list1.next;
        }else{
            head=new LinkedListNode(list2.value);
            list2=list2.next;
        }
        tail=head;
        while(list1!=null && list2!=null){
            if(list1.value<list2.value){
                tail.next=new LinkedListNode(list1.value);

                list1=list1.next;
            }else{
                tail.next=new LinkedListNode(list2.value);

                list2=list2.next;
            }
            tail=tail.next;
        }
        if(list1==null){
            tail.next=list2;
        }else{
            tail.next=list1;
        }
        return head;
    }
    public static void main(String [] args){
        CondensedList listone=new CondensedList();

        listone.addLast(1);
        listone.addLast(1);
        listone.addLast(1);
        listone.addLast(4);
        listone.addLast(4);
        listone.printList();
        //listone.printList();
        CondensedList listtwo=new CondensedList();
        listtwo.addLast(2);
        listtwo.addLast(3);
        listtwo.addLast(6);
        System.out.println("listtwo*********************");
        listtwo.printList();
        LinkedListNode theResult= new CondensedList().mergeList(listone.head,listtwo.head);
       
        while(theResult!=null){
            System.out.println(theResult.value);
            theResult=theResult.next;
        }
        HashSet<Integer> hashSet=new HashSet<>();

        LinkedListNode current=listone.head;
        LinkedListNode resulthead=null;

        hashSet.add(current.value);
       // System.out.println("head value is "+resulthead.value);
        current=current.next;
        LinkedListNode result=resulthead;
      //  System.out.println("Inside the update while loop");

       // System.out.println("*********************");



    }
}
