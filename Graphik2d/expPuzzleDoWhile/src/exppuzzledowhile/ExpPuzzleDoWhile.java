package exppuzzledowhile;

import java.util.Scanner;

public class ExpPuzzleDoWhile {

    public static void main(String[] args) {
        int n, i;
        n = 0;
        i = 0; // sonst hätte i keinen Wert
        // Summe aller Zahlen von 1-10: 55
        do{
            n = n + i;
            i++; // Notwendig da i sonst immer 0 wäre
        }while (i < 11);
        
        System.out.println(n);
        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        do {
            System.out.print("Bitte Wort eingeben: ");
            String word = scanner.next();
            if(word.equals("Ende")) break;
            tries++;
            System.out.println(tries);
        } while(scanner.hasNext() && tries < 10);
        System.out.println("ENDE");
    }
}
