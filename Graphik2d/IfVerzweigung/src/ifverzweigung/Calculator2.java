/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifverzweigung;

import java.util.Scanner;
import javax.script.ScriptException;

/**
 *
 * @author MiRi217740
 */
public class Calculator2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gebe die erste Zahl an");
        double first = scanner.nextDouble();
        System.out.println("Bitte gebe die zweite Zahl an");
        double second = scanner.nextDouble();

        System.out.println("Bitte geben den Operator an");
        String operator = scanner.next();
        
        double result;
        switch(operator) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Man kann nicht durch 0 dividieren");
                    return;
                }
                result = first / second;
                break;
            default:
                System.out.println("Der operator" + operator + "ist nicht bekannt!");
                return;
        }
        
        System.out.println("Das Ergebniss lautet " + result);
    }
}
