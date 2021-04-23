/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zufallszahll;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author MiRi217740
 */
public class Zufallszahll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int random = ThreadLocalRandom.current().nextInt();
        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        
        int input;
        do {
            System.out.println("Bitte gebe die Zahl ein: ");
            input = scanner.nextInt();
            tries++;
            if(input != random) {
                if(random < input) {
                    System.out.println("Deine Zahl ist größer");
                } else {
                    System.out.println("Deine Zahl ist kleiner");
                }
            }
        } while(input != random && tries <= 7);
        if(tries > 7) {
            System.out.println("Du hast zu viele versuche gebraucht");
        } else {
            System.out.println("Du hast die Zahl erraten");
        }
    }
    
}
