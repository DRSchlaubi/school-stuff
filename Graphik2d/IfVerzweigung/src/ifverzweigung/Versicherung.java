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
public class Versicherung {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bitte gebe den Schadensbetrag ein: ");
        double cost = scanner.nextDouble();
        
        double selfPayed = cost * 0.15;
        if(selfPayed < 300) {
            selfPayed = 300;
        }
        
        double insurrancePayed = cost - selfPayed;
        if(insurrancePayed < 0) {
            insurrancePayed = 0;
        }
        
        System.out.printf("Du musst selber %.2f bezahlen. \n Die Versicherrung bezahlt %.2f", selfPayed, insurrancePayed);
    }
    
}
