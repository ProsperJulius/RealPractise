package Miscellenous;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.*;

public class theMain {
    public static void main(String args[]){
        int input[] ={1,9,3,6,5,6,4,9};
        /*   // System.out.println(reserveString("jusa"));
        Tree tree=new Tree();
        tree.addValue(4);
        tree.addValue(5);
        tree.addValue(19);
        tree.addValue(10);
        tree.addValue(1);
        ReserveInteger reverse=new ReserveInteger();
        System.out.print("reverse is : "+reverse.anotherReverse(1534236469));*/

      //  System.out.println(2/10);

       // traverseInOrder(tree.root);
      //  traversePreOrder(tree.root);
      //  traversePost(tree.root);
       // traverseOrder(tree.root);
        int [] numbers={2,4,1,7,8,5};
        ArraySort sorter=new ArraySort();
        String inpt="baabccd";
       // System.out.print(Arrays.toString(sorter.arraySort(numbers)));
        System.out.println(inpt.substring(0,7));


    }
    public static void traverseOrder(Node root){
        Queue<Node> nodes=new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            Node node=nodes.remove();
            System.out.println(node.value);
            if(node.left!=null){
                nodes.add(node.left);
            }
            if(node.right!=null){
                nodes.add(node.right);
            }
        }
    }
    public static void traversePost(Node node){
        if(node !=null){
            traversePost(node.left);
            traversePost(node.right);
            System.out.println(node.value);
        }
    }
    public static void traversePreOrder(Node node){
        if(node !=null){
            System.out.println(node.value);
            traversePreOrder(node.right);
            traversePreOrder(node.left);
        }
    }
    public static void traverseInOrder(Node node){
        if(node !=null){
            traverseInOrder(node.left);
            System.out.println(node.value);
            traverseInOrder(node.right);
        }
    }

    public static int[] twoSum(int[] nums, int target){
        int results[]=new int[2];
        int arrayLength=nums.length;

        for(int i=0;i< arrayLength;i++){
          for(int j=i+1;j<arrayLength;j++){
              if(nums[i]+nums[j]== target){
                  results[0]=i;
                  results[1]=j;
                  return results;

              }
          }
        }
        return results;
    }
    public static String subString(String s){
        int stringLength=s.length();
        ArrayList<Character> charList=new ArrayList<>();
        String string="";
        for(int i=0;i<s.length();i++){
          charList.add(s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
           // string+=s.charAt()
        }
        return null;
    }
    public static String reserveString(String s){
        int stringLength =s.length();
        String result="";
        for(int i=stringLength-1;i>-1;i--){
            result=result+s.charAt(i);
        }
        return result;
    }

    public static String optimalReverse(String string){
        return optimalReverse(string,string.length());
    }
    public static String optimalReverse(String string, int length){
        if(length==0){
            return "";
        }else{
            return string.charAt(length-1)+optimalReverse(string,length-1);
        }
    }

}
