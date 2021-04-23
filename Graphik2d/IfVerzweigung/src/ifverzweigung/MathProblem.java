/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifverzweigung;

import java.util.Scanner;

/**
 *
 * @author MiRi217740
 */
public class MathProblem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte a eingeben: ");
        double a = scanner.nextDouble();
        System.out.println("Bitte b eingeben: ");
        double b = scanner.nextDouble();
        System.out.println("Bitte c eingeben: ");
        double c = scanner.nextDouble();
        
        double x1 = solve(a, b, c, 1);
        double x2 = solve(a, b, c, -1);
        
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }
    
    
    private static double solve(double a, double b, double c, int factor) {
        double d = Math.sqrt(Math.pow(b, 2) - 4*a*c) * factor;
        return (-b + d) / (2 * a);
    }
}
