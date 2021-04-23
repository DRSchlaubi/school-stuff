/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abwesenheitserfassung;

import java.util.Date;

/**
 *
 * @author MiRi217740
 */
public class Attest extends Fehlzeit {

    private final String artztPraxis;

    public Attest(Date beginn, Date ende, boolean reg, String artztPraxis) {
        super(beginn, ende, reg);
        this.artztPraxis = artztPraxis;
    }

    public String getArtztPraxis() {
        return artztPraxis;
    }

    @Override
    public String toString() {
        return "Attest{" + "artztPraxis=" + artztPraxis + ", beginn=" + beginn + ", ende=" + ende + ", reg=" + registriert + '}';
    }

}
