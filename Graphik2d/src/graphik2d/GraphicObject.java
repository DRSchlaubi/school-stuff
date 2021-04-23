/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphik2d;

import java.awt.Color;

/**
 * Base glass for any 2D object.
 * @author MiRi217740
 */
public abstract class GraphicObject {
    
    /**
     * The x0 coordinate for this object. (One edge for polygons and center for circles)
     */
    protected int x0;
    
    /**
    * The x0 coordinate for this object. (One edge for polygons and center for circles)
    */
    protected int y0;
    
    /**
     * The {@link java.awt.Color} of the object
     */
    protected Color color;

    /**
     * Constructor for implementing classes.
     * @param x0 the x0 coordinate
     * @param y0 the y0 coordinate
     * @param color the {@link java.awt.Color} of the object
     * See the implementing classes constructor for more info
     */
    protected GraphicObject(int x0, int y0, Color color) {
        this.x0 = x0;
        this.y0 = y0;
        this.color = color;
    }
    
    /**
     * Calculates the scope of this object.
     * @return the scope in the measurement of x0, x1
     */
    public abstract double calculateScope();
    
     /**
     * Calculates the area of this object.
     * @return the scope in the measurement of x0, x1
     */
    public abstract double calculateArea();
    
    @Override
    public abstract String toString();

    public int getX0() {
        return x0;
    }

    public int getY0() {
        return y0;
    }

    public Color getColor() {
        return color;
    }
}
