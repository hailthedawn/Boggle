package Backend;

import java.util.HashMap;

/**
 * A single node in a trie data structure.
 * Consists of a hash-map of Trie-Nodes (indexed according to the alphabet).
 * @author Ketaki Tilak
 */
public class TrieNode {

    private String letters;
    //letters (Word) associated with current node
    private HashMap<Integer,TrieNode> nodeMap;
    //a Hashmap representing the current node's children
    private boolean isWord;
    //whether current tree traversal forms a complete word

    /**
     * constructor to create a new TrieNode
     * @param letters the letters to be initialized with
     */
    public TrieNode(String letters){
        this.letters=letters;
        nodeMap=new HashMap<>();
    }

    public HashMap<Integer, TrieNode> getNodeMap() {
        return nodeMap;
    }

    /**
     * getter for letter
     * @return letter of current TrieNode
     */
    public String getLetters() {
        return letters;
    }

    /**
     * getter for isWord
     * @returns if it's a word
     */
    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    /**
     * creates a new TrieNode at appropriate position
     * @param index of letter (0-25)
     * @param letters to be initialized with
     */
    public void put(int index, String letters) {
        nodeMap.put(index,new TrieNode(letters));
    }


}
