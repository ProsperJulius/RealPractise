package Realtime;

public class BinaryTree {

    public Node root;
    public BinaryTree(){
        this.root=null;
    }
    public void addValue(int value){
        root= addValue(root,value);
    }
    public Node addValue(Node current,int value){
        if(current==null){

            return new Node(value);
        }else if(current.value==value){
            return current;
        }
        else if(current.value<value){

            current.right=addValue(current.right,value);
        } else{
            current.left=addValue(current.left,value);
        }return current;
    }
    public boolean containsValue(int value){
        return containsRecursive(root,value);
    }
    private boolean containsRecursive(Node current, int value){
        if(current==null){
            return false;
        }else if(current.value==value){
            return true;
        }
        return current.value<value?containsRecursive(current.right,value):containsRecursive(current.left,value);
    }

    public void delete(int value){
        root= recursiveDeletion(root,value);
    }
    private Node recursiveDeletion(Node current, int value){
        if(current==null) return null;
        if(current.value!=value){
            return current.value>value?recursiveDeletion(current.left,value):recursiveDeletion(current.right,value);
        }else{

            if(current.left==null & current.right==null){
                return null;
            }else if (current.left==null){
                return current.right;
            } else if(current.right==null){
                return current.left;

            }else{
                int smallestValue =smallestValue(current.right);
                current.value=smallestValue;
                current.right =recursiveDeletion(current.right, smallestValue);
                return current;

            }
        }
    }
    private int smallestValue(Node current){
        return current.left==null?current.value:smallestValue(current.right);
    }

    private class Node{
        int  value;
        Node left;
        Node right;
        public Node(int value){
            this.value =value;
            this.left=null;
            this.right=null;
        }
    }
    public void traverseInOrder(Node current){
        if(current!=null){
            traverseInOrder(current.left);
            System.out.println(current.value);
            traverseInOrder(current.right);
        }
    }
    public static void main(String [] args){
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.addValue(8);
        binaryTree.addValue(9);
        binaryTree.addValue(25);
        //System.out.println(binaryTree.containsValue(25));
      //  binaryTree.delete(25);
       // System.out.println(binaryTree.containsValue(25));
        //binaryTree.traverseInOrder(binaryTree.root);
        int [] arra={1,2,3,4,5};
        System.out.println(arra[-2]);


    }
}
