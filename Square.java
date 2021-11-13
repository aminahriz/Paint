/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compsci12.shapes;

/**
 *
 * @author amina
 */
public class Square extends Rectangle {

    /**
     * Constructs a square from 2 lines If they aren't parallel or side lengths
     * aren't equal, an error will occur
     *
     * @param a a line
     * @param ab a line
     */
    public Square(Line a, Line ab) {
        super(a, ab); //calls constructor from superclass
        
    }

    /**
     * Constructs a square from a rectangle If the rectangle's side lengths
     * arent equal, an error will be thrown
     *
     * @param r is the rectangle
     */
    public Square(Rectangle r) {
        super(r); //calls constructor from superclass
        
    }

    /**
     * Constructs a square from 4 points Must be in this order: top left, top
     * right, bottom left, bottom right
     *
     * @param m top left point
     * @param b top right point
     * @param c bottom left point
     * @param d bottom right point
     */
    public Square(Point m, Point b, Point c, Point d) {
        super(m, b, c, d); //calls constructor from superclass
        

    }

}
