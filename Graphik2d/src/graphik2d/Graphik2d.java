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
public class Graphik2d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, Color.GREEN, 4);
        printCircle(circle1, 1);
        
        Circle circle2 = new Circle(1, -3, Color.GREEN, -3, 1);
        printCircle(circle2, 2);
        
        Rectangle rectangle1 = new Rectangle(0,0, Color.GREEN, 5, 5);
        printRectangle(rectangle1, 1);
        
        Rectangle rectangle2 = new Rectangle(5,6, Color.GREEN, 5, 5);
        printRectangle(rectangle2, 2);
        
        Rectangle half2 = rectangle2.growDiag(0.5);
        printRectangle(half2, 3);
    }
    
    private static void printCircle(Circle circle, int counter) {   
        System.out.println("Circle " + counter + ": " + circle);
        System.out.println("Circle " + counter + " radius: " + circle.getRadius());
        System.out.println("Circle " + counter + " area: " + circle.calculateArea());
        System.out.println("Circle " + counter + " scope: " + circle.calculateScope());
        System.out.println("DPI thing: " + GraphicObject.pixelToMm(circle.getRadius()) + "mm");
    }
    
    private static void printRectangle(Rectangle rectangle, int counter) {   
        System.out.println("Rectangle " + counter + ": " + rectangle);
        System.out.println("Rectangle " + counter + " height: " + rectangle.getHeight());
        System.out.println("Rectangle " + counter + " height: " + rectangle.getWidth());
        System.out.println("Rectangle " + counter + " area: " + rectangle.calculateArea());
        System.out.println("Rectangle " + counter + " scope: " + rectangle.calculateScope());
        System.out.println("Rectangle " + counter + " edges: " + rectangle.calculateEdges());
    }
}
