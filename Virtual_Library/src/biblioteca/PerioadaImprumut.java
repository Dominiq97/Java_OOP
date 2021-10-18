/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dominic
 */
public class PerioadaImprumut {

    private Persoana persoana;
    private Carte carte;
    private Date dataStart;
    private Date dataEnd;
    private Date dataInapoiere;

    public Date getDataEnd() {
        return dataEnd;
    }

    public Date getDataInapoiere() {
        return dataInapoiere;
    }

    public Date getDataStart() {
        return dataStart;
    }

    public Persoana getPersoana() {
        return persoana;
    }

    public Carte getCarte() {
        return carte;
    }

   
   

    public PerioadaImprumut(Persoana persoana, Carte carte, Date dataStart) {
        this.persoana = persoana;
        this.carte=carte;
        this.dataStart = dataStart;
        Calendar c = Calendar.getInstance();
        c.setTime(dataStart);
        c.add(Calendar.DAY_OF_MONTH, 31);
        this.dataEnd = c.getTime();
    }

    public void setDataInapoiere(Date dataInapoiere) {
        this.dataInapoiere = dataInapoiere;
    }

}
