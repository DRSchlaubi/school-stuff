/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author MiRi217740
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl an um den Betrag dieser zu erhalten: ");
        
        int input = scanner.nextInt();
        
        int abs = Math.abs(input);
        
        System.out.printf("Der Betrag von %s ist %s\n", input, abs);
    }
}
