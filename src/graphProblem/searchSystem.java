package graphProblem;
public class searchSystem {




    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("prosper");
        trie.insert("jusa");
        trie.insert("jusa the man");
        System.out.println(trie.productStartWith("jusa "));
    }


}
