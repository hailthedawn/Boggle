package Backend;

/**
 * Data structure to search dictionary by prefixes.
 * @author Ketaki Tilak
 */
public class Trie {

    private TrieNode head; //head of trie, letter = @
    /**
     * constructor for Trie
     */
    public Trie() {
        head=new TrieNode("@");
        for(int i=0;i<10;i++) {//iter thru dict here
            String word=""; word=word.toUpperCase();
            put(word);
        }
    }

    /**
     * checks whether input word is present in Trie data structure.
     * If not, adds it.
     * @param word to be added
     */
    public void put(String word) {
        if(word.length() == 0)
            return;

        TrieNode lastMatchingNode = isPrefix(word);
        if(lastMatchingNode.getLetters().equals(word)) {
            return;
        }

        TrieNode curr; int i,lb,ub; //i, lower, and upper bounds
        ub = word.length();
        curr=lastMatchingNode;

        if(lastMatchingNode.equals(head)) { //no part of the word exists in Trie
            lb = 0;
        }
        else {
            lb=lastMatchingNode.getLetters().length();
        }

        String str="";
        for(i = lb ;i < ub ;i++) {
            char b=word.charAt(i);
            str=str+b;
            curr.put(b-65,str); //indexed as 0-25
            curr=curr.getNodeMap().get(b-65);
        }
        curr.setWord(true);

    }


//
//    /**
//     * searches trie to see if word is valid
//     * @param word string to be checked for
//     * @return whether string arg is a valid word     *
//     */
//    public boolean isWord(String word) {
//        TrieNode curr=head;
//        int j=0;
//        while (!curr.getLetters().equals(word)) {
//            curr=curr.getNodeMap().get(Integer.parseInt())
//        }
//        while(j<word.length() && curr!=null) {
//            curr=head.getNodeMap().get(Integer.parseInt(word.charAt(j)+""));
//            if(curr==null) {
//
//            }
//            //access TrieNode if it exists
//            j++;
//        }
//
//        return false;
//    }

    /**
     * searches trie to see if word is a valid prefix
     * @param word string to be checked for
     * @return the TrieNode that was matched with the last letter of word . returns head if not a prefix.
     */
    public TrieNode isPrefix(String word) {
        int level=1; //also corresponds to character's index+1
        TrieNode curr=head; //pointer that moves along

        while(level!=word.length()) {
            //goes as deep into the Trie as the length of the word
            char b=word.charAt(level-1);
            curr=curr.getNodeMap().get(b-65);
            if(curr==null)
                return head;
            level+=1;
        }

        if(curr.getLetters().equals(word)) {
            return curr;
        }
        return head;
    }

}