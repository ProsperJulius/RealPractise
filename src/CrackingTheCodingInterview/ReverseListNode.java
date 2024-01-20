package CrackingTheCodingInterview;

public class ReverseListNode {

    public Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node temp=head;
        Node prev=null;
        Node walker=null;
        while(temp!=null){
            walker=temp.next;
            temp.next=prev;
            prev=temp;
            temp=walker;
        }
        return prev;
    }
}
