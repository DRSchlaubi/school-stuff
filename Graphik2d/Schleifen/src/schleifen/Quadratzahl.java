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
public class Quadratzahl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte gege eine Zahl ein: ");
        double number = scanner.nextDouble();
        double sqrt = checkNumber(number);
        if(sqrt > 0.0) {
            System.out.println("Ist quadratzahl von " + sqrt);
            return;
        }
        int resLower = (int) number;
        int resHigher = (int) number;
        while(checkNumber(resHigher) < 0.0) {
            resHigher++;
        }
        while(checkNumber(resLower) < 0) {
            if(resLower < 0) {
                resLower = -1;
                break;
            }
            resLower--;
        }
        
        System.out.println("Keine quadratzahl");
        System.out.println("Nächst größere: " + resHigher);
        System.out.println("Nächst kleinere: " + (resLower < 0 ? "Nicht gefunden" : resLower));
    }
    
    private static double checkNumber(double number) {
        double sqrt = Math.sqrt(number);
        if(number >= 0 && (sqrt / (int) sqrt) == 1.0) {
            return sqrt;
        } else {
            return -1;
        }
    }
    
}
