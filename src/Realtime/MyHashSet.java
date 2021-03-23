package Realtime;

import java.util.HashSet;

public class MyHashSet {
    boolean [] hashSet;

      public MyHashSet(){
        hashSet=new boolean[1000000];
      }
      public void add(int key){
          hashSet[key]=true;
      }
      public void remove(int key){
          hashSet[key]=false;
      }
      public boolean contains(int key){
          return hashSet[key];
      }
      public boolean canPlace(int [] num, int n){
          int count=0;
          for(int i=0;i<num.length;i++){


              if(num[i]==0){
                  int prev= (i==0?0:num[i-1]);
                  int next=(i==num.length-1?0:num[i+1]);
                  if(prev==0 &  next==0){
                      count++;
                      if(count==n) return true;
                  }
              }
          }
          return false;
      }
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hashSet=new HashSet<>();
        if(head==null)return null;

        while(head!=null){
            if(!hashSet.contains(head)){
            hashSet.add(head);}else{
                return head;
            }
            head=head.next;

        }
        return null;



    }

    class ListNode {
      int val;
     ListNode next;
      ListNode(int x) {
         val = x;
          next = null;
     }
  }
}
