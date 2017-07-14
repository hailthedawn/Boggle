package Backend;

import java.util.ArrayList;

/**
 * @author: Ketaki Tilak
 */
public class Die {

    private String faces; //the strings on the 6 faces of current die
    private Coordinate cds; //coordinates of current die on board
    private ArrayList<Die> adjacencyList; //a list of dice immediately adjacent to current die
    private char top; //letter at top

    /**
     * const for Die
     * @param faces: the strings on the 6 faces of current die
     * @param cds: coordinates of current die on board
     */
    public Die(String faces, Coordinate cds) {
        this.faces = faces; this.cds=cds;
        //this.adjacencyList = adjacencyList; can't make this global bc all the dice haven't been added yet.
    }

    /**
     * gets char at top face
     * @return top - char
     */
    public char getTop() {
        return top;
    }

    /**
     * to set char at top face
     * @param top - char
     */
    public void setTop(char top) {
        this.top = top;
    }

    /**
     * sets adjacency list for current Die
     * @param adjacencyList passed in
     */
    public void setAdjacencyList(ArrayList<Die> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    /**
     * Getter for facelisr
     * @return facelist
     */
    public String getFaces() {
        return faces;
    }

}