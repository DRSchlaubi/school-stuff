/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifverzweigung;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author MiRi217740
 */
public class IfVerzweigung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int random = ThreadLocalRandom.current().nextInt(0, 100);
        
        System.out.println("Bitte gebe einen Wert ein.");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        int a,b;
        if(random > input) {
            a = random;
            b = input;
        } else {
            b = random;
            a = input;
        }
        
        System.out.println("Random: " + random);
        System.out.println("Qoutient: " + a / b);
        System.out.println("Modulo: " + a % b);
    }
}
