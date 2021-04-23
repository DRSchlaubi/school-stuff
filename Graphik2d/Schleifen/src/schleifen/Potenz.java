/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schleifen;

import java.util.Scanner;

/**
 *
 * @author MiRi217740
 */
public class Potenz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe ein x für x^n an: ");
        double x = scanner.nextDouble();
        double res = x;
        System.out.println("Bitte gebe ein n für x^n an: ");
        int n = scanner.nextInt();
        
        for(int i = 1; i < n; i++) {
            res *= x;
        }
        
        System.out.println("Ergebniss " + res);
    }
}
