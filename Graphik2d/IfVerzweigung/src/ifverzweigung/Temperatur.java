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
public class Temperatur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine temperatur eingeben: ");
        int temperature = scanner.nextInt();
        if(temperature <= 0)  {
            System.out.println("gefriert");
        } else if (temperature < 100) {
            System.out.println("Flüssig");
        } else {
            System.out.println("Verdampft");
        }
    }
}
