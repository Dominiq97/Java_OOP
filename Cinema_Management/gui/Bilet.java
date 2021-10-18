/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salaCinema.gui;

import java.util.Date;

/**
 *
 * @author Dominic
 */
public class Bilet {
    
    private String numeFilm;
    private Date oraFilm; // valabil doar pentru orele 17:00 si 20:00 se poate folosi boolean!!
//  private int durata;
    private String numeSala;
//  private boolean digitalSau3D;
    private int pret;
    private int rand;
    private int loc; 

    public Bilet(String numeFilm, Date oraFilm, String numeSala, int pret, int rand, int loc) {
        this.numeFilm = numeFilm;
        this.oraFilm = oraFilm;
        this.numeSala = numeSala;
        this.pret = pret;
        this.rand = rand;
        this.loc = loc;
    }

    public String getNumeFilm() {
        return numeFilm;
    }

    public void setNumeFilm(String numeFilm) {
        this.numeFilm = numeFilm;
    }

    public Date getOraFilm() {
        return oraFilm;
    }

    public void setOraFilm(Date oraFilm) {
        this.oraFilm = oraFilm;
    }

    public String getNumeSala() {
        return numeSala;
    }

    public void setNumeSala(String numeSala) {
        this.numeSala = numeSala;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getRand() {
        return rand;
    }

    public void setRand(int rand) {
        this.rand = rand;
    }

    public int getLoc() {
        return loc;
    }

    public void setLoc(int loc) {
        this.loc = loc;
    }
    
    

}
