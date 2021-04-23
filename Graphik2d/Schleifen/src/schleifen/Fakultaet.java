
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
public class Fakultaet {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte gege eine Zahl ein: ");
        double number = scanner.nextDouble();
        
        double res = number;
        for(int i = ((int) number - 1); i > 0; i--) {
            res *= number - i;
        }
        System.out.println("Ergebniss: " + res);
    }
    
}
