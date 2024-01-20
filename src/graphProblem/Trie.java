package graphProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trie {
    public class Node {
        boolean isWord;
        Map<Character, Node> children;
        public Node(){
            children =  new HashMap<>();
        }
    }

    Node root, current;
    List<String> resultBuffer;

    public Trie() {
        root = new Node();
        resultBuffer = new ArrayList<>();
    }

    public void insert(String word) {
        current = root;
        for (Character currentChar : word.toCharArray()) {
            if (current.children.get(currentChar) == null) {
                current.children.put(currentChar, new Node());
            }
            current = current.children.get(currentChar);
        }
        current.isWord = true;
    }

    public List<String> productStartWith(String prefix) {
        current = root;

        for (Character character : prefix.toCharArray()) {

            if (current.children.get(character) == null) {
                return resultBuffer;
            }

            current = current.children.get(character);
        }

        dfs(current, prefix);

        return resultBuffer;
    }

    private void dfs(Node current, String word) {

        if (resultBuffer.size() == 3) {
            return;
        }

        if (current.isWord) {
            resultBuffer.add(word);
        }

        for (Character character : current.children.keySet()) {
            current = current.children.get(character);
            dfs(current, word + character);
        }
    }


}
