package Backend;

import java.util.Scanner;

/**
 * @author: Ketaki Tilak
 */
public class Boggle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Start Game? Y/N");
        String ch=sc.nextLine();
        Board board=new Board(4);
        while(ch.equals("Y")) {
            System.out.println("Game begins.");

            //enter words into trie
            Trie trie=new Trie();


            board.startRound();
            System.out.println("Current board set-up:"+board.toString());

            System.out.println("Press R to reveal all possible words.");
            String reveal=sc.nextLine();
            if(reveal.equals("R")) {

            }

            System.out.println("Continue playing? Y/N");
            ch=sc.nextLine();
        }

    }
}
