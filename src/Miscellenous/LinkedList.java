package Miscellenous;

public class LinkedList {

    public ListNode addNumbers(ListNode l1, ListNode l2){
        return addNumbers(l1,l2,0);
    }
    public ListNode addNumbers(ListNode l1, ListNode l2, int curry ){
        if(l1==null && l2==null && curry==0){
            return null;
        }
        if(l1==null && l2==null && curry!=0){
            return new ListNode(curry);
        }
        int temp= (l1==null?0:l1.value)+(l2==null?0:l2.value)+curry;
        ListNode results=new ListNode(temp%10);
        results.next= addNumbers(l1.next,l2.next,temp/10);
        return results;
    }

    public class ListNode{
        int value;
        ListNode next;
        public  ListNode(int n){
            this.value=n;
            this.next=null;
        }
    }
}
