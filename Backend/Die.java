package Backend;

import java.util.ArrayList;

/**
 * @author: Ketaki Tilak
 */
public class Die {

    private ArrayList<String> faces; //the strings on the 6 faces of current die
    private Coordinate cds; //coordinates of current die on board
    private ArrayList<Die> adjacencyList; //a list of dice immediately adjacent to current die

    /**
     * const for Die
     * @param faces: the strings on the 6 faces of current die
     * @param cds: coordinates of current die on board
     */
    public Die(ArrayList<String> faces, Coordinate cds, ArrayList<Die> adjacencyList) {
        this.faces = faces; this.cds=cds;
        this.adjacencyList = adjacencyList;
    }



}