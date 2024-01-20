package Blind75;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {
    public class Node {
        boolean isWord;
        Map<Character, Node> children;

        public Node() {
            this.isWord = false;
            this.children = new HashMap<>();
        }
    }

    public class Trie {
        Node current, root;

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

        public boolean wordCanBeBroken(String word) {
            return dfsWordBreak(current, word, 0);
        }

        public boolean dfsWordBreak(Node current, String word, int wordLength) {
            if (current.isWord && word.length() == wordLength) return true;

            if(current.isWord) {
                return dfsWordBreak(root,word,wordLength+1) || dfsWordBreak(current.children.get(word.charAt(wordLength)),word,wordLength+1);
            }

            if (wordLength >= word.length() || !current.children.containsKey(word.charAt(wordLength))) return false;

            return dfsWordBreak(current.children.get(word.charAt(wordLength)),word, wordLength+1 );

        }

    }


    public boolean wordBreak(String s, List<String> wordDict) {
        Trie trie = new Trie();
        for (String word : wordDict) {
            trie.insert(word);
        }

        return trie.wordCanBeBroken(s);

    }
}
