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
public abstract class Fehlzeit {

    protected Date beginn, ende;
    protected boolean registriert;

    Fehlzeit(Date beginn, Date ende, boolean reg) { // Konstruktor
        this.beginn = beginn;
        this.ende = ende;
        registriert = reg;
    }
    
    public void registrieren(Lehrkraft lehrkraft) {
        registriert = true;
    }
}
