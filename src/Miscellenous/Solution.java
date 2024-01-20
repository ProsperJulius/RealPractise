package Miscellenous;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
public class Solution {
    public static boolean isAnagram(String s, String t) {
       if(s.length()!=t.length() || s==null || t==null)return false;

       HashSet<Character> arrayOfCharactersOne=new HashSet<>();
       HashSet<Character> arrayOfCharactersTwo=new HashSet<>();


        char[] arrayOfChar=s.toCharArray();
        char[] arrayOfChar2=t.toCharArray();
        for(Character c : arrayOfChar){
            arrayOfCharactersOne.add(c);

        }
        for(Character c : arrayOfChar2){
                     arrayOfCharactersTwo.add(c);
        }
        if(arrayOfCharactersOne.size()!=arrayOfCharactersTwo.size()) return false;

        for(Character c : arrayOfCharactersOne){
            arrayOfCharactersTwo.remove(c);
        }

      return arrayOfCharactersTwo.size()==0?true:false;

    }



    public static void main(String[] args)
    {
       HashMap<Integer,String> hashMap=new HashMap<>();
       hashMap.put(11,"yourjusa");
       hashMap.put(12,"yourprosper");
       Set hashtest = hashMap.entrySet();
       Iterator iterator= hashtest.iterator();
       while(iterator.hasNext()){
           Map.Entry me = (Map.Entry)iterator.next();
           System.out.println(me.getKey()+" "+me.getValue());
       }
        //System.out.print(isAnagram("aa","a"));
    }
}
