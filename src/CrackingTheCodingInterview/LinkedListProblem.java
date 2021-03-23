package CrackingTheCodingInterview;

import java.util.HashSet;
import java.util.Set;

public class LinkedListProblem {

    public boolean isCorrupted(ListNode node){
        if(node==null)return false;
        Set<ListNode> listNodeSet =new HashSet<>();
        ListNode temp=node;
        while(temp!=null){
            if(listNodeSet.contains(temp)){
                return true;
            }else{
                listNodeSet.add(temp);
                temp=temp.next;
            }
        }
        return false;

    }
    public boolean palindrone(ListNode node){
        if(node==null) return false;
        ListNode reversed=reverse(node);
        while(reversed!=node && node!=null && reversed!=null ){
            if(node.value!=reversed.value){
                return false;
            }else{
                node=node.next;
                reversed=reversed.next;
            }
        }
        return true;

    }
    public ListNode reverse(ListNode node){
        if(node==null) return null;
        ListNode prev=null;
        ListNode temp=node;
        ListNode next;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;

        }
        return prev;

    }
}
