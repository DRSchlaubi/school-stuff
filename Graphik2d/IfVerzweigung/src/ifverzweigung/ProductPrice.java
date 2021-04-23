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
public class ProductPrice {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Stückzahl eingeben: ");
        int count = scanner.nextInt();
        System.out.println("Bitte Einzelpreis eingeben: ");
        double price = scanner.nextDouble();
        
        double total;
        
        if(count >= 50) {
            total = price * 0.9 * count;
        } else if(count >= 10) {
            total = price * 0.95 * count;
        } else {
            total = price * count;
        }
        
        System.out.printf("Total preis: %.2f", total);
        System.out.println();
    }
    
}
