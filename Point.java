package compsci12.shapes;

/**
 * A point consisting of an x and y coordinate. Implements Shapes
 *
 * @author aminah
 */
public class Point implements Shapes {

    //the x coordinate of the point
    public double x;
    //the y coordinate of the point
    public double y;
    public int getY;

    /**
     * Constructs a default point (0,0)
     */
    public Point() {
        x = 0;
        y = 0;
    }

    /**
     * constructs a point with the specified x and y coordinates from the
     * parameter
     *
     * @param ax x coordinate of the point
     * @param ay y coordinate of the point
     *
     */
    public Point(double ax, double ay) {
        x = ax;
        y = ay;
    }
    
    /**
     * Constructs a point from a pre-existing point
     * @param p the point being duplicated
     */
    public Point(Point p){
        x = p.x;
        y = p.y;
    }

    /**
     * Sets the value of x
     *
     * @param setx the double value of x
     */
    public void setX(double setx) {
        x = setx;
    }

    /**
     * Sets the value of y
     *
     * @param sety the double value of y
     */
    public void setY(double sety) {
        y = sety;
    }

    /**
     * Gets x
     *
     * @return the value of x
     */
    public double getX() {
        return x;
    }

    /**
     * Gets Y
     *
     * @return the value of y
     */
    public double getY() {
        return y;
    }

    /**
     * Scales the point by a specified factor
     *
     * @param s the scale factor
     */
    @Override
    public void scale(double s) {
        x = x*s; //multiplpying the x coordinate by the scale factor
        y = y*s; //multiplying the y coordinate by the scale factor

    }

    /**
     * Translating the point by the specified amount
     *
     * @param dx by how much you want to move the x coordinate
     * @param dy by how much you want to move the y coordinate
     */
    @Override
    public void translate(double dx, double dy) {
        x = x+dx; //translating the x coordinate
        y = y+dy; //translating the y coordinate
    }

    /**
     * Rotate the point by a specified degree
     *
     * @param degrees the degree the point will rotated by
     */
    @Override
    public void rotate(double degrees) {
        double radians = Math.toRadians(degrees);//converting the degrees to radians
        double holdx = x; //creating a variable to hold the original value of x
        x = x*Math.cos(degrees) - y*Math.sin(degrees); //rotating the x coordinate
        y = holdx*Math.sin(degrees) + y*Math.cos(degrees); //rotating the y coordinate
    }

    /**
     * calculates the area
     *
     * @return 0 as points have no area
     */
    @Override
    public double area() {
        return 0; //returns 0
    }

    /**
     * checks if the point is equal to another point
     *
     * @param o is the point to compare
     * @return boolean indicating if they are equal
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) { //if object is not a point
            return false; //return false
        }
        Point otherPoint = (Point) o; //casts the object as a point
        if (x == otherPoint.x && y == otherPoint.y) { //comparing coordinates of each point
            return true; //return true if they are equal
        } else {
            return false; //false if they are not
        }

    }

    /**
     * Returns the coordinates of the point as a string, formatted
     *
     * @return formatted coordinates of the point as a string
     */
    @Override
    public String toString() {
        String p = "(" + x + ", " + y + ")"; //formatting the coordinates of the point
        return p; //return p
    }

    /**
     * Calculates the distance between the origin and the point
     *
     * @return the distance between the origin and the point
     */
    public double length() {
        Point p = new Point(); //creating a new point (0,0)
        double length = distance(p); //calculating distance from origin to point
        return length; //returing the length
    }

    /**
     * adds a point to the point
     *
     * @param a is the point being added
     */
    public void add(Point a) {
        x = x + a.x; //adding together the x coordinates of both points
        y = y + a.y; //adding together the y coordinates of both points
    }

    /**
     * calculates the distance between the point and another
     *
     * @param p the other point
     * @return the distance between the two points
     */
    public double distance(Point p) {
        double disx = Math.pow((p.x - x), 2); //calculating a^2 in pythagorean theorum
        double disy = Math.pow((p.y - y), 2); //calculating b^2 in pythagorean theorum
        double distance = Math.sqrt((disx + disy)); //calculating c in pythagorean theorum
        return distance; //returing the distance
    }

}
