
package compsci12.shapes;

/**
 * A rectangle class - implements Shapes
 *
 * @author aminah
 */
public class Rectangle implements Shapes {

    //variable for one line in a pair of parallel lines
    public Line parallel;
    //variable for the other line in the pair of parallel lines
    public Line parallel2;
   

    /**
     * Setter for parallel
     *
     * @param a the value of parallel
     */
    public void setParallel(Line a) {
        parallel = a;
    }

    /**
     * Setter for parallel2
     *
     * @param a the value of parallel2
     */
    public void setParallel2(Line a) {
        parallel2 = a;
    }

    /**
     * Getter for parallel
     *
     * @return parallel
     */
    public Line getParallel() {
        return parallel; //return parallel
    }

    /**
     * Getter for parallel2
     *
     * @return parallel2
     */
    public Line getParallel2() {
        return parallel2; //return parallel2
    }

    /**
     * Constructs a rectangle from a pair of lines
     *
     * @param a a line
     * @param ab a line
     */
    public Rectangle(Line a, Line ab) {
        if (a.isParallel(ab) && !(a.equals(ab))) { //if the lines are parallel and the same length
            parallel = a; //parallel is a
            parallel2 = ab; //parallel2 is ab
        } else {
            throw new IllegalArgumentException("NOT PARALLEL");
        }
    }

    /**
     * COnstructs a rectangle from a pre-existing rectangle
     *
     * @param r a pre-existing rectangle
     */
    public Rectangle(Rectangle r) {
        parallel = r.parallel; //parallel is the parallel line from r
        parallel2 = r.parallel2; //parallel is the parallel line form r
    }

    /**
     * Constructs a rectangle from 4 points The points must be written in the
     * following order: TopLeft, TopRight, BottomLeft, BottomRight
     *
     * @param a the top left point
     * @param b the top right point
     * @param c the bottom left point
     * @param d the bottom right point
     */
    
   
    public Rectangle(Point a, Point b, Point c, Point d) {
        
        Line l1 = new Line(a, b);
        Line l2 = new Line(c, d);
        parallel = l1;
        parallel2=l2;
        
    }

    /**
     * Scale the rectangle by the scale factor
     *
     * @param s the scale factor
     */
    @Override
    public void scale(double s) {
        parallel.scale(s); //scaling one line of the rectangle
        parallel2.scale(s); //scaling the other line of the rectangle
        
    }

    /**
     * Translate the rectangle
     *
     * @param dx by how much the rectangle is being translated horizontally
     * @param dy by how much the rectangle is being translated vertically
     */
    @Override
    public void translate(double dx, double dy) {
        parallel.translate(dx, dy); //translating one line of the rectangle
        parallel2.translate(dx, dy); //translating the other line of the rectangle
    }

    /**
     * rotate the rectangle by a specified degree
     *
     * @param degrees the degree by which the rectangle is being rotated
     */
    @Override
    public void rotate(double degrees) {
        parallel.rotate(degrees); //rotate one line of teh rectangle
        parallel2.rotate(degrees); //rotate the other line of the rectangle
    }

    /**
     * Calculate the area of the rectangle
     *
     * @return the area of the rectangle
     */
    @Override
    public double area() {
        double area = length() * width(); //multiplying the width by the length
        return area; //return the area
    }

    /**
     * find the length of the rectangle
     *
     * @return
     */
    public double length() {
        return parallel.getStart().distance(parallel.getEnd()); //calculate the length of the parallel line
    }
    
    public double width() {
        double w1 = parallel.getStart().distance(parallel2.getStart()); //distance between a parallel endpoint and a parallel2 endpoint
        double w2 = parallel.getStart().distance(parallel2.getEnd());//distance between a parallel endpoint and another parallel2 endpoint
        if (w1 < w2) { //if w1 is amaller
            return w1; //return w1
        } else { //else
            return w2; //return w2
        }
    }

    /**
     * Check if two rectangles are equal
     *
     * @param o the rectangle being compared with
     * @return boolean indicating if the two rectangles are equal
     */
    @Override
    public boolean equals(Object o) {
        
        if (!(o instanceof Rectangle)) { //if the object isn't a rectangle
            return false; //return false
        }
        Rectangle otherRectangle = (Rectangle) o; //This casts o into a Rectangle object
        boolean m = parallel.equals(otherRectangle.parallel) && parallel2.equals(otherRectangle.parallel2); //boolean m checks if points are equal
        boolean n = parallel.equals(otherRectangle.parallel2) && parallel2.equals(otherRectangle.parallel); //boolean n checks if points are equal
        if (m || n) { //if the points are equal
            return true; //return true
        } else { //else
            return false; //return false

        }
    }

    /**
     * Returns the coordinates of each corner of the rectangle as a string,
     * formatted
     *
     * @return formatted coordinates of corners of the rectangle as a string
     */
    public String toString() {
        String stringOut = parallel.toString() + " " + parallel2.toString(); //formatting the coordinates into a string
        return stringOut; //returning string
    }
    
}
