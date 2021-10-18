/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca;

/**
 *
 * @author Dominic
 */
public class Persoana {
    
    private String nume;
    private String prenume;
    private boolean sex;
    private String adresa;

    public Persoana(String nume, String prenume, boolean sex, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.sex = sex;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public boolean isSex() {
        return sex;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    
    public String getNumeComplet(){
        return nume+" "+prenume;
    }
    
    public String getDescrierePersoana(){
        String descriere = getNumeComplet()+", "+(sex?"baiat":"fata")+", "+adresa;
        return descriere;
    } 
    
}
