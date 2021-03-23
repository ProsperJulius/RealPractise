package Miscellenous;

public class BinaryTrees {
     Node root;
    public void addNode(int value){
    root= recursiveAdd(root,value);

    }
    public boolean containsValue(int value){
        return containsRecursive(root,value);
    }

    private Node recursiveAdd(Node current, int value){

        if(current==null){
            // System.out.println("value added");
            return new Node(value);
        }else if(current.value>value){

            current.left=recursiveAdd(current.left,value);

        }else if(current.value<value){
           current.right= recursiveAdd(current.right,value);
        }else{
            //the value already present;
            return current;
        }
     return current;
    }
    public void deleteValue(int value){
        root = deleteRecursion(root,value);
    }
    private boolean containsRecursive(Node current, int value){

             if(current==null){
                 return false;
             }

             if(current.value==value){
                 return true;
             }
             return current.value>value? containsRecursive(current.left,value)
                     : containsRecursive(current.right,value);
    }
    private Node deleteRecursion(Node current,int value){
        if(current==null){
            return null;
        }
        if(current.value==value){
            if(current.left ==null &&  current.right == null){
                return null;
            }
            if(current.right==null){
                return current.left;
            }
            if(current.left==null){
                return current.right;
            }
            int  minimum = findMinimum(current.right);
            current.value=minimum;
             current.right=deleteRecursion(current.right,minimum);

        }
        return current.value>value? deleteRecursion(current.left,value)
                :deleteRecursion(current.right,value);

    }
    public int findMinimum(Node current){
        return current.left==null?current.value :
                findMinimum(current.left);
    }

}
