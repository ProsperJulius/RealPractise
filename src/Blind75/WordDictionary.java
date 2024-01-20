package Blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class WordDictionary {

    public class Node {

        boolean isWord;
        Map<Character, Node> children;

        public Node() {
            isWord = false;
            children = new HashMap<>();
        }
    }

    Node root, current;
    List<String> results;

    public WordDictionary() {
        root = new Node();
        results = new ArrayList<>();
    }

    public void addWord(String word) {
        current = root;
        for (char character : word.toCharArray()) {
            if (!current.children.containsKey(character)) {
                current.children.put(character, new Node());
            }
            current = current.children.get(character);
        }

        current.isWord = true;



    }

    public boolean search(String word) {

       return search(word,0, root);
    }
    public boolean search(String word, int index, Node current){

        if(word.length() == index){
            return current.isWord;
        } else if (word.charAt(index) != '.') {
            Node currentNode = current.children.get(word.charAt(index));
            if(current == null){
                return false;
            }
            return search(word,index+1,currentNode);
        }else {
            for(Node node : current.children.values()){
                return search(word,index+1,node);
            }
        }

        return false;

    }
}
