/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compsci12.shapes;

/**
 * Interface for any shape
 * @author aminah
 */
public interface Shapes {
    /**
     * This method scales the shape by a factor of s
     * @param s the factor by which the shape will be scaled
     */
    public void scale(double s);
    /**
     * Translates an object
     * @param dx is how much you want to horizontally move the shape
     * @param dy is how much you want to vertically move the shape
     */
    public void translate(double dx, double dy);
    /**
     * rotates the shape 
     * @param degrees what degree to rotate shape by
     */
    public void rotate(double degrees); 
    /**
     * Calculates the area of the shape
     */
    public double area();
    /**
     * Checks if two shapes (of the same class) are equal
     * @param a is the shape that is being compared
     * @return if they are equal
     */
    @Override
    public boolean equals (Object a);
    /**
     * Returns the coordinates of the shape in proper format
     * @return the coordinates of points of the shape
     */
    @Override
    public String toString ();
}

