package Backend;

/**
 * @author: Ketaki Tilak
 */
public class Coordinate {

    private int x,y;

    /**
     * const for Coordinate
     * @param x: x coordinate
     * @param y: y coordinate
     */
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * if two coord objects have the same x & y, returns true
     * @param o : object to be compared with
     * @return true is x and y of both objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinate that = (Coordinate) o;

        if (x != that.x) return false;
        return y == that.y;
    }


    /**
     * getter for x coordinate
     * @return x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * getter for y coordinate
     * @return x coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * primarily for testing purpose
     * @return string representation of coordinate
     */
    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}