package Blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Trie {
    public class Node {
        boolean isWord;
        Map<Character, Node> children;

        public Node() {
            this.isWord = false;
            this.children = new HashMap<>();
        }
    }

    Node root, current;
    boolean hasFoundWord = false;
    List<String> resultsBuffer;

    public Trie() {
        this.root = new Node();
    }

    public void insert(String word) {
        current = root;
        for (char character : word.toCharArray()) {

            if (current.children.get(character) == null) {
                current.children.put(character, new Node());
            }
            current = current.children.get(character);

        }
        current.isWord = true;

    }

    public boolean search(String word) {
        current = root;
        return dfsWordSearch(current,word, 0);

    }

    public boolean startsWith(String prefix) {
        current = root;
        resultsBuffer = new ArrayList<>();
        for (char character : prefix.toCharArray()) {
            if (current.children.get(character) == null) {
                return resultsBuffer.size() > 0;
            }
            current = current.children.get(character);
        }

        dfsPrefix(current);

        return resultsBuffer.size() > 0;
    }

    public void dfsPrefix(Node node) {

        if (node.isWord) {
            resultsBuffer.add("blalalba");
            return;
        }
        for (Node childNode : node.children.values()) {
            dfsPrefix(childNode);
        }

    }

    public boolean dfsWordSearch(Node current, String word, int wordlength) {

        if(word.length() == wordlength && current.isWord){
            return true;
        }

        if(wordlength >= word.length() || current.children.get(word.charAt(wordlength))==null){
            return false;
        }
        return dfsWordSearch(current.children.get(word.charAt(wordlength)),word,wordlength+1);

    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */