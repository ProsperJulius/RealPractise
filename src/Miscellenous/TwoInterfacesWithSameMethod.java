package Miscellenous;

import Realtime.LinkedList;

import java.util.*;

public class TwoInterfacesWithSameMethod implements One,Two{
    private final int x;
 static {
     System.out.println("hey I am running");
 }

    public TwoInterfacesWithSameMethod() {
     super();
        x=77;

    }
    public  TwoInterfacesWithSameMethod(String argument){
     this();
    }

    public void method(){

      One.super.method();
   }

    public static void main(String[] args) {

        try {
            LinkedList linkedList=null;
            linkedList.addTop(8);
        }catch(Exception e){
            System.out.println("this is null");
        } finally {
            System.out.println("D");
        }
    }

    public static void badMethod() throws Exception {
        throw new Exception();
    }
}
