package Miscellenous;

import java.util.ArrayList;
import java.util.HashSet;

public class MiniStack {

    ArrayList<Integer> stack;
    public MiniStack() {
        this.stack=new ArrayList<Integer>();

    }

    public void push(int x) {
        stack.add(x);

    }

    public void pop() {
        stack.remove(stack.size()-1);

    }

    public int top() {
    return stack.get(stack.size()-1);
    }

    public int getMin() {
      int min=stack.get(0);
      for(int i=0;i<stack.size();i++){
          if(min>stack.get(i)) min=stack.get(i);
      }
      return min;
    }
    public int majorityElement(int[] nums) {
        HashSet<Integer> elementSeen=new HashSet<>();
        int counter=0;
        int max=0;
        int realIndex=0;
        int index;
        for(int i=0;i<nums.length;i++){
            index=i;
            if(!elementSeen.contains(nums[i])){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]) counter++;
                }
                if(max<counter){
                    max=counter;
                    realIndex=index;
                }
                counter=0;
            }
        }
        return nums[realIndex];

    }
}
