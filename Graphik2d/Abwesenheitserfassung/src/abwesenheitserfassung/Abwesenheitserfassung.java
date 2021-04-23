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
public class Abwesenheitserfassung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lehrkraft l1 = new Lehrkraft("Der", "Lehrer");
        Beurlaubung b1 = new Beurlaubung(new Date(),new Date(),false,"Faulheit",l1);
        System.out.println(b1.toString());
        OhneAttest b2 = new OhneAttest(new Date(),new Date(),false,"Faulheit",l1);
        System.out.println(b2.toString());
        Attest b3 = new Attest(new Date(),new Date(),false,"Faulheit");
        b3.registrieren(l1);
        System.out.println(b3.toString());
    } 
}
