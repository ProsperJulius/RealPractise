package Miscellenous;

public class Tree {


    Node root;
    public void addValue(int value){
        root= recursionAdd(root,value);
    }
    public boolean containsValue(int value){
        return recursionContains(root,value);
    }
    public void deleteValue(int value){
        root=recursionDelete(root,value);
    }


    private Node recursionDelete(Node current,int value){
        if(current==null){
            return null;
        }
        if(current.value==value){
        if((current.right ==null) && (current.left==null)){
            return null;
        }
        if(current.right==null){
            return current.left;
        }
        if(current.left==null){
            return current.right;
        }
        int minimumValue=minValue(current.right);
        current.value=minimumValue;
         current.right =recursionDelete(current.right,minimumValue);

        }
        return current.value>value?recursionDelete(current.left,value)
                :recursionDelete(current.right,value);
    }
    private int minValue(Node current){
        return current.left==null?current.value:minValue(current.left);
    }
    private boolean recursionContains(Node current, int value){

        if(current==null){
            return false;
        }else if(current.value==value){
            return true;
        }else {
            return current.value>value?recursionContains(current.left,value) :recursionContains(current.right,value);
        }
    }
    private Node recursionAdd(Node current, int value){

        if(current==null){
           // System.out.println("value added");
            return new Node(value);
        }else if(current.value >value){

            current.left=recursionAdd(current.left,value);
        }else if(current.value < value){
             current.right=recursionAdd(current.right,value);
        }else{
            //value already present
            return current;
        }
        return current;
    }


}


