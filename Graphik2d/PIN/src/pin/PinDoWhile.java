/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pin;

import java.util.Scanner;

/**
 *
 * @author MiRi217740
 */
public class PinDoWhile {

    private static final int PIN = 1234;
    private static final int MAX_FAILS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gebe deine PIN ein");
        int tries = 0;
        do {
            int input = scanner.nextInt();
            if (input == PIN) {
                System.out.println("PIN-Eingabe rfolgreich!");
                return;
            }
            
            tries++;
            int remainingTries = MAX_FAILS - tries;
            if(tries < MAX_FAILS) {
                System.out.println("Das war nicht richtig! Du hast noch " + (remainingTries == 1 ? "einen Versuch" : remainingTries + " Versuche"));
            }
        } while (tries < MAX_FAILS);
        System.out.println("Du hast zuviele Versuche bennötigt!");
    }
}
