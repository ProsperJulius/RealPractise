package Realtime;

public class ListCycle {
    public MyHashSet.ListNode detectCycle(MyHashSet.ListNode head) {
        if(head==null || head.next==null) return null;

        MyHashSet.ListNode slowhead=head;
        MyHashSet.ListNode fasthead=head;
        while(fasthead!=null & fasthead.next!=null){
            slowhead=slowhead.next;
            fasthead=fasthead.next.next;
            if(slowhead==fasthead){
                slowhead=head;
                while(slowhead!=fasthead){
                    slowhead=slowhead.next;
                    fasthead=fasthead.next;
                }
                return slowhead;

            }

        }

        return null;

    }
}
