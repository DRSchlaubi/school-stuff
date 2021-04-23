/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ausgabe;

import java.util.Scanner;

/**
 *
 * @author MiRi217740
 */
public class ScannerTest {
    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        String s1 = "Das neue Gebäude";
        System.out.println("s1 besitzt " + s1.length() + " Zeichen");

    
        System.out.println("Gib ne zahl ein!");
        int input = scanner.nextInt();
        
        System.out.println(String.format("Ich weiß deine Zahl! Sie ist %s boah wie geil", input));
        
        System.out.println(String.format("Jetzt gib mal ne Zahl an die man durch %s teilen kann", input));
        int possibleDivisor = scanner.nextInt();
        
        if(possibleDivisor % input == 0) {
            System.out.println("Yeyy du kannst rechnen!");
        } else {
            System.out.println("Nö");
        }
        
        System.out.println("Text bidde:");
        System.out.println(scanner.next());
        
          System.out.println("kOMMAZAHL bidde:");
        System.out.println(scanner.nextDouble());
        
    }
}
