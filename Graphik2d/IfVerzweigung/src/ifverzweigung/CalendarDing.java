/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifverzweigung;

import java.time.Month;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author MiRi217740
 */
public class CalendarDing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bitte gebe den Monat an");
        int month = scanner.nextInt();
        System.out.println("Bitte gebe den Jahr an");
        int year = scanner.nextInt();
        GregorianCalendar calendar = (GregorianCalendar) GregorianCalendar.getInstance();
        boolean isLeapYear = calendar.isLeapYear(year);
        
        Month jMonth = Month.of(month);
        int length = jMonth.length(isLeapYear);
        
        
        System.out.println("Die Länge des Monats: " + length);
    }
    
    private int getMonthLength(int id, boolean leapYear) {
        int res;
        switch(id) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
            case 10:
                res = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                res = 30;
                break;
            
            case 2:
                res = leapYear ? 29 : 28;
                break;
                
            default:
                throw new IllegalArgumentException("ungültiger Monat" + id);
        }
        
        return res;
    }
}
