/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package obiecte;

import java.util.ArrayList;

/**
 *
 * @author Dominic
 */
public class Parinte {
    private String nume;
    private String prenume;
    private String nrTel;
    private ArrayList<Elev> listaElevi = new ArrayList<Elev>();
    
   

    public Parinte(String nume, String prenume, String nrTel) {
        this.nume = nume;
        this.prenume = prenume;
        this.nrTel = nrTel;
    }
    
    

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNrTel() {
        return nrTel;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }

    public ArrayList<Elev> getListaElevi() {
        return listaElevi;
    }
    
    
    
}
