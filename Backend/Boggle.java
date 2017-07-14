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

        while(ch.equals("Y")) {
            System.out.println("Game begins.");

            Board board=new Board(4);
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
