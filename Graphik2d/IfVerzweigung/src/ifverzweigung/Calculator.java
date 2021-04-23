/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifverzweigung;

import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author MiRi217740
 */
public class Calculator {
    
    public static void main(String[] args) throws ScriptException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte rechnung angeben:");
        String eval = scanner.nextLine();
        
        ScriptEngine javaScript = new ScriptEngineManager().getEngineByName("Nashorn");
        
        System.out.println("Das Ergebnis lautet: " + javaScript.eval(eval));
    }
    
}
