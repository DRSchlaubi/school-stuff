/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphik2d;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author MiRi217740
 */
public class Rectangle extends GraphicObject {

    private int width;
    private int height;
    
    public Rectangle(int x0, int y0, Color color, int width, int height) {
        super(x0, y0, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateScope() {
        return 2 * width + 2* height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
    
    public List<Coordinate> calculateEdges() {
        List<Coordinate> edges = new ArrayList<>(4);
        edges.add(0, new Coordinate("A", x0, y0 + height));        
        edges.add(1, new Coordinate("B", x0 + width, y0 + height));
        edges.add(2, new Coordinate("C", x0 + width, y0));
        edges.add(3, new Coordinate("D", x0, y0));
        return Collections.unmodifiableList(edges);
    }
    
    public Rectangle growDiag(double scale) {
        return new Rectangle(x0, y0, color, (int) (width * scale), (int) (height * scale));
    }    

    public int getWidth() {
        return width;
    }

    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    public String toString() {
        return String.format("Rectange(x0=%s, y0=%s, color=%s, width=%s, height=%s", x0, y0, color, width, height);
    }
}
