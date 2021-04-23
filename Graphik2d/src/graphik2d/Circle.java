/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphik2d;

import java.awt.Color;

/**
 *
 * @author MiRi217740
 */
public class Circle extends GraphicObject {
    
    private int radius;

    public Circle(int x0, int y0, Color color, int radius) {
        super(x0, y0, color);
        this.radius = radius;
    }
    
    public Circle(int x0, int y0, Color color, int x1, int y1) {
        this(x0, y0, color, calculateRadius(x0, y0, x1, y1));
    }

    @Override
    public double calculateScope() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    private static int calculateRadius(int x0, int y0, int x1, int y1) {
        return (int) Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2));
    }

    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return String.format("Circle(x0=%s, y0=%s, color=%s, radius=%s", x0, y0, color, radius);
    }
}
