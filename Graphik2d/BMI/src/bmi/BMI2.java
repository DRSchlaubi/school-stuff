/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author MiRi217740
 */
public class BMI2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bitte gebe das Gewicht ein.");
        double weight = scanner.nextDouble();
        System.out.println("Bitte gebe die Körpergröße ein.");
        double size = scanner.nextDouble();
        
        double bmi = weight / Math.pow(size, 2);
        
        String result;
        if(bmi > 40) {
            result = "Extremes Übergewicht";
        } else if (bmi < 39.99 && bmi > 30) {
            result = "Starkes Übergewicht";
        } else if (bmi < 29.99 && bmi > 25) {
            result = "Übergewicht";
        } else if (bmi < 24.99 && bmi > 20) {
            result = "Normalgewicht";
        } else {
            result = "Untergewicht";
        }
        
        System.out.printf("Dein BMI ist %.2f (%s).\n", bmi, result);
        
        double idealBmi = 22 * Math.pow(size, 2);
        
        System.out.printf("Dein Idealgewicht für einen BMI von 22 wäre: %.2f\n", idealBmi);
    }
}
