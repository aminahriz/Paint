package compsci12.shapes;

/**
 * A Line - implements the Shapes interface
 *
 * @author aminah
 */
public class Line implements Shapes {

    //the start point of the line
    public Point start = new Point();
    //teh ened point of the line
    public Point end = new Point();

    /**
     * Set start
     *
     * @param p the value of start
     */
    public void setStart(Point p) {
        start = p;
    }

    /**
     * Set end
     *
     * @param p the value for end
     */
    public void setEnd(Point p) {
        end = p;
    }

    /**
     * Get start
     *
     * @return start
     */
    public Point getStart() {
        return start; //returns start
    }

    /**
     * get end
     *
     * @return
     */
    public Point getEnd() {
        return end; //returns end
    }

    /**
     * Constructs a line from points
     *
     * @param x endpoint of the line
     * @param y endpoint on the line
     */
    public Line(Point x, Point y) {
        if (x.getX() < y.getX()) { //checks which point is the leftmost
            start = x; //start is x
            end = y;//end is y
        } else { //else
            start = y; //start is y
            end = x; //end is x
        }

    }

    /**
     * Constructs a line from coordinates
     *
     * @param x1 the x coordinate of the first point
     * @param y1 the y coordinate of the first point
     * @param x2 the x coordinate of the second point
     * @param y2 the y coordinate of the second point
     */
    public Line(double x1, double y1, double x2, double y2) {
        if (x1 < x2) {
            start = new Point(x1, y1);
            end = new Point(x2, y2);
        } else {
            start = new Point(x2, y2);
            end = new Point(x1, y1);
        }

    }

    /**
     * Constructs a line from a pre-existing line
     *
     * @param l pre-existing line
     */
    public Line(Line l) {
        start = l.start;
        end = l.end;
    }

    /**
     * Scales the line by the scale factor
     *
     * @param s the scale factor
     */
    @Override
    public void scale(double s) {
        start.scale(s); //scaling the start point
        end.scale(s); //scaling the end
    }

    /**
     * Translates a line by a specified horizontal and vertical amount
     *
     * @param dx how much the line will be moved horizontally
     * @param dy how much the line will be moved vertically
     */
    @Override
    public void translate(double dx, double dy) {
        start.translate(dx, dy); //translating the start point
        end.translate(dx, dy); //translating the end point
    }

    /**
     * rotates the line by a specified degree
     *
     * @param degrees the degree by which the line will be rotated
     */
    @Override
    public void rotate(double degrees) {
        start.rotate(degrees); //rotating the start point
        end.rotate(degrees); //rotating the end point
    }

    /**
     * Finds the area of the line returns 0 as lines don't have areas
     *
     * @return 0
     */
    @Override
    public double area() {
        return 0;
    }

    /**
     * compares two lines to see if they are equal
     *
     * @param o the line being compared with
     * @return boolean indicating if they are equal
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Line)) { //if the object is not a line
            return false; //return false
        }
        Line otherLine = (Line) o; //cast the object as a line
        boolean m = start.equals(otherLine.start) && end.equals(otherLine.end); //checks if the points of the line match
        boolean n = start.equals(otherLine.end) && end.equals(otherLine.start); //checks if the points of the line match
        if (m || n) { //if the points of the line match
            return true; //return true
        } else { //else
            return false; //return false

        }

    }

    /**
     * Returns the coordinates of the endpoints of the line as a string,
     * formatted
     *
     * @return formatted coordinates of the endpoints of the line as a string
     */
    @Override
    public String toString() {
        String stringOut = start.toString() + " " + end.toString(); //create a string with the formatted coordinates
        return stringOut; //return the string
    }

    /**
     * Checks to see if two lines are parallel
     *
     * @param b the other line being compared
     * @return boolean indicating if the lines are equal
     */
    public boolean isParallel(Line b) {
        double rise1 = end.getY() - start.getY(); //calculating the rise of teh first line
        double run1 = end.getX() - start.getY(); //calculating the run of the first line
        double rise2 = b.end.getY() - b.start.getY(); //calculating the rise of the second line
        double run2 = b.end.getX() - b.start.getY(); // calculating the run of the second line
        if (run1 == 0 || run2 == 0) { //if the slopes of both lines are undefined
            return true; //return true
        } else if (rise1 / run1 == rise2 / run2) { //if the slopes of both lines are equal
            return true;
        } else { //else
            return false; //return false
        }
    }
}
