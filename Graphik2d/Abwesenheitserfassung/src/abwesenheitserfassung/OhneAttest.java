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
public class OhneAttest extends Fehlzeit {

    private final String grund;
    private final Lehrkraft freigabe;

    public OhneAttest(Date beginn, Date ende, boolean reg, String grund, Lehrkraft freigabe) {
        super(beginn, ende, reg);
        this.grund = grund;
        this.freigabe = freigabe;
    }

    public void entlassen(Lehrkraft lehrkraft) {

    }

    public String getGrund() {
        return grund;
    }

    public Lehrkraft getFreigabe() {
        return freigabe;
    }

    @Override
    public String toString() {
        return "OhneAttest{" + "grund=" + grund + ", freigabe=" + freigabe + ", beginn=" + beginn + ", ende=" + ende + ",reg=" + registriert + '}';
    }
}
