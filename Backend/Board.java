package Backend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @author: Ketaki Tilak
 */
public class Board {
    private int dim;
    private HashMap<Coordinate,Die> DiceMap;
    private static String[] faceList={"RIFOBX","IFEHEY","DENOWS","UTOKND","HMSRAO","LUPETS",
                                      "ACITOA","YLGKUE","QBMJOA","EHISPN","VETIGN","BALITY",
                                      "EZAVND","RALESC","UWILRG","PACEMD"};
//TODO: Q is supposed to be Qu
    int[] randArray=new Random().ints(16,0,16).toArray();
    //returns an intStream which has to be converted to an Array

    public Board(int dim) {
        this.dim=dim;
        DiceMap=new HashMap<>();

        //ArrayList faces = chooseFaces(i+j);
        for(int i=0;i<dim;i++) {
            for(int j=0;j<dim;j++) {
               Coordinate coords=new Coordinate(i,j);
               ArrayList adjs=getAdjacencyList(coords);
              // Die die=new Die(faceList[randArray[  ]],coords,adjs);
            }
        }

    }

    /**
     * gets all existing die directly adjacent to current die on board
     * @param coords : coords of current die on board
     * @return ArrayList of adjacent dice
     */
    public ArrayList<Die> getAdjacencyList(Coordinate coords) {
       ArrayList<Die> adjs=new ArrayList<>();
       for(int i=coords.getX()-1;i<=coords.getX()+1;i++) {
           for(int j=coords.getY()-1;j<=coords.getY()+1;j++) {
               if(i==coords.getX() && j==coords.getY())
                   continue;
               Coordinate c=new Coordinate(i,j);
               if(DiceMap.containsKey(c))
                   adjs.add(DiceMap.get(c));
           }
       }
       return adjs;
    }

    /**
     * chooses faces for each
     * @return
     */
    public ArrayList<String> chooseFaces(int ch) {
        switch(ch){
            case 0:
        }
        return  null;
    }

    /**
     * starts a round by:
     * -> shuffling the dice
     * -> setting the timer
     */
    public void startRound() {
        //faces on Die to be chosen accd to game
        //dice shuffled accd to frequency

        //for i in DieList
        //A face is selected

    }


}
