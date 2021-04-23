package funktion;

import java.util.Scanner;

/**
 *
 * @author MiRi217740
 */
public class Funktion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bitte gebe einen x-Wert für die funktion f(x) an");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        
        double y = f(x);
        System.out.printf("f(%.2f) = %.2f", x, y);
        System.out.println();
    }
    
    private static double f(double x) {
        return 2 * Math.pow(x, 3) - 3 * x + 4;
    }
}
