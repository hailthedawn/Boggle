package Backend;


import java.util.*;


/**
 * @author: Ketaki Tilak
 */
public class Board {
    private int dim;
    private HashMap<Coordinate,Die> DiceMap;
    private static ArrayList<String> faceList=new ArrayList<String>(
            Arrays.asList("RIFOBX","IFEHEY","DENOWS","UTOKND","HMSRAO",
                          "LUPETS","ACITOA","YLGKUE","QBMJOA","EHISPN",
                          "VETIGN","BALITY","EZAVND","RALESC","UWILRG","PACEMD"));
//TODO: Q is supposed to be Qu

    public Board(int dim) {
        this.dim=dim;
        DiceMap=new HashMap<>();
        Collections.shuffle(faceList);
        for(int i=0,ctr=-1;i<dim;i++) {
            for(int j=0;j<dim;j++,ctr++) {
               Coordinate coords=new Coordinate(i,j);
               ArrayList adjs=getAdjacencyList(coords);
               Die die=new Die(faceList.get(ctr),coords);
               DiceMap.put(coords,die);
            }
        }
        for(Coordinate c:DiceMap.keySet()) {
            DiceMap.get(c).setAdjacencyList(getAdjacencyList(c));
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
     * starts a round by:
     * -> shuffling the dice
     * -> setting the timer
     */
    public void startRound() {
        Random rand=new Random();

        for(Coordinate c:DiceMap.keySet()) {
            Die d=DiceMap.get(c);
            d.setTop(d.getFaces().charAt(rand.nextInt()));
        }
        //start bfs

    }

    /**
     * Returns a string representation of the object.
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        String s="";
        for(int i=0;i<dim;i++) {
            for(int j=0;j<dim;j++) {
                s+=DiceMap.get(new Coordinate(i,j)).getTop();
            }
           s+="/n";
        }
        return s;
    }
}