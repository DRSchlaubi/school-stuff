/*
 * Programm zum Berechnen der Mehrwertsteuer
 * Zur Bearbeitung im Unterricht markierten Teil entfernen.
 */
package mwst;

import java.util.Scanner;   // Einbinden zum Verwenden des Scanners

public class Mwst {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double mwstSatz = 0.16;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Bitte Nettobetrag eingeben:");
        double nettoBetrag = myScanner.nextDouble();
        double bruttoBetrag = nettoBetrag * (1.0 + mwstSatz);
        
        System.out.printf("Der Bruttobetrag ist %.2f€", bruttoBetrag);
    }
}
