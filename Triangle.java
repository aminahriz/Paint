/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compsci12.shapes;

/**
 * A triangle - implements Shapes
 *
 * @author aminah
 */
public class Triangle implements Shapes {

    //variables for the points of the triangle
    private Point a ;
    private Point b;
    private Point c;
    public int[] xValues =  new int[3];
    public int[] yValues = new int[3];
    
    /**
     * Constructs a triangle from three points
     *
     * @param a1 a point on the triangle
     * @param b1 a point on the triangle
     * @param c1 a point on the triangle
     */
    public Triangle(Point a1, Point b1, Point c1) {
        a = a1;
        b = b1;
        c = c1;
        xValues[0] = (int) a.x;
        xValues[1] = (int) b.x;
        xValues[2] = (int) c.x;
        yValues[0] = (int) a.y;
        yValues[1] = (int) b.y;
        yValues[2] = (int) c.y;
    }
    
    /**
     * Constructs a triangle using coordinates
     * @param x1 x of first point
     * @param y1 y of second point
     * @param x2 x of second point
     * @param y2 y of second point
     * @param x3 x of third point
     * @param y3 y of third point
     */
    public Triangle(double x1,double y1,double x2, double y2,double x3,double y3){
        
        a = new Point (x1,y1);
        b= new Point (x2,y2);
        c = new Point(x3,y3);
        xValues[0] = (int) x1;
        xValues[1] = (int) x2;
        xValues[2] = (int) x3;
        yValues[0] = (int) y1;
        yValues[1] = (int) y2;
        yValues[2] = (int) y3;
        if (a.equals(b) || a.equals(c) || c.equals(b)){
            throw new IllegalArgumentException("Points cant be the same");
        } 
    }
    /**
     * Constructs a triangle from a pre-existing triangle
     *
     * @param t
     */
    public Triangle(Triangle t) {
        a = t.a;
        b = t.b;
        c = t.c;
        xValues[0] = (int) t.a.x;
        xValues[1] = (int) t.b.x;
        xValues[2] = (int) t.c.x;
        yValues[0] = (int) t.a.y;
        yValues[1] = (int) t.b.y;
        yValues[2] = (int) t.c.y;
    }

    /**
     * Setter for a
     *
     * @param p the value of a
     */
    public void setA(Point p) {
        a = p;
    }

    /**
     * Setter for b
     *
     * @param p the value of b
     */
    public void setB(Point p) {
        b = p;
    }

    /**
     * Setter for c
     *
     * @param p the value of c
     */
    public void setC(Point p) {
        c = p;
    }

    /**
     * Getter for a
     *
     * @return a
     */
    public Point getA() {
        return a;
    }

    /**
     * Getter for b
     *
     * @return b
     */
    public Point getB() {
        return b;
    }

    /**
     * Getter for c
     *
     * @return c
     */
    public Point getC() {
        return c;
    }

    /**
     * Scale triangle by a scale factor
     *
     * @param s the scale factor
     */
    @Override
    public void scale(double s) {
        a.scale(s);
        b.scale(s);
        c.scale(s);
        xValues[0] = (int) a.x;
        xValues[1] = (int) b.x;
        xValues[2] = (int) c.x;
        yValues[0] = (int) a.y;
        yValues[1] = (int) b.y;
        yValues[2] = (int) c.y;
    }

    /**
     * Translate triangle horizontally and vertically
     *
     * @param dx by how much the triangle is horizontally translated
     * @param dy by how much the triangle is vertically translated
     */
    @Override
    public void translate(double dx, double dy) {
        a.translate(dx, dy);
        b.translate(dx, dy);
        c.translate(dx, dy);
        xValues[0] = (int) a.x;
        xValues[1] = (int) b.x;
        xValues[2] = (int) c.x;
        yValues[0] = (int) a.y;
        yValues[1] = (int) b.y;
        yValues[2] = (int) c.y;
    }

    /**
     * Rotate the triangle by a specified degree
     *
     * @param degrees by how much the triangle will be rotated
     */
    @Override
    public void rotate(double degrees) {
        a.rotate(degrees);
        b.rotate(degrees);
        c.rotate(degrees);
        xValues[0] = (int) a.x;
        xValues[1] = (int) b.x;
        xValues[2] = (int) c.x;
        yValues[0] = (int) a.y;
        yValues[1] = (int) b.y;
        yValues[2] = (int) c.y;
    }

    /**
     * Calculates the area of the triangle
     *
     * @return the area of the triangle
     */
    @Override
    public double area() {
        double area = Math.abs(0.5 * (a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY())));
        return area;

    }

    /**
     * Checks to see if two triangles are equal
     *
     * @param o the other triangle being compared
     * @return boolean indicating if the triangles are equal
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Triangle)) {
            return false; //this will ensure we only ever compare Triangles
        }
        Triangle otherTri = (Triangle) o; //This casts it into a Point object
        boolean case1 = a.equals(otherTri.a) && b.equals(otherTri.b) && c.equals(otherTri.c);
        boolean case2 = a.equals(otherTri.a) && b.equals(otherTri.c) && c.equals(otherTri.b);
        boolean case3 = a.equals(otherTri.b) && b.equals(otherTri.c) && c.equals(otherTri.a);
        boolean case4 = a.equals(otherTri.b) && b.equals(otherTri.a) && c.equals(otherTri.c);
        boolean case5 = a.equals(otherTri.c) && b.equals(otherTri.a) && c.equals(otherTri.b);
        boolean case6 = a.equals(otherTri.c) && b.equals(otherTri.b) && c.equals(otherTri.a);
        if (case1 || case2 || case3 || case4 || case5 || case6) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Returns the coordinates of each corner of the rectangle as a string,
     * formatted
     *
     * @return formatted coordinates of corners of the rectangle as a string
     */
    @Override
    public String toString() {
        return  a.toString() + " " + b.toString() + " " + c.toString();
    }

}
