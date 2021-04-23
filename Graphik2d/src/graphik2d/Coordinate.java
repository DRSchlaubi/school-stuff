/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphik2d;

/**
 * Representation of 2D coordinates.
 * @author MiRi217740
 */
public class Coordinate {
    
    private final String name;
    private final int x;
    private final int y;

    /**
     * Creates a 2D coordinate
     * @param name the name
     * @param x the x
     * @param y the y
     */
    public Coordinate(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + '(' + x + '|' + y + ')';
    }
}
