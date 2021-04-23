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
public class Oddnum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine zahl eingeben: ");
        int number = scanner.nextInt();
        
        if(number % 2 == 0) {
            System.out.println("Gerade");
        } else {
            System.out.println("Ungerade");
        }
    }
}
