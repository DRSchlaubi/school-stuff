/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abwesenheitserfassung;

import java.util.Date;

/**
 *
 * @author gei
 */
public class Beurlaubung extends Fehlzeit {

    String grund;
    Lehrkraft genehmigung;

    Beurlaubung(Date beginn, Date ende, boolean reg, String grund, Lehrkraft l) // Konstruktor
    {
        super(beginn, ende, reg); // Konstruktor der Oberklasse
        this.grund = grund;
        genehmigung = l;
    }
    
    @Override
    public String toString(){
        return ("Beginn "+beginn+" Ende "+ende+" Grund: "+grund+" Lehrkraft: "+genehmigung);
    }
}
