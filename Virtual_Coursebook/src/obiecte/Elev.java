/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obiecte;

import java.util.Objects;

/**
 *
 * @author Dominic
 */
public class Elev {

    private String nume;
    private String prenume;
    private String adresa;
    private String clasa;
    private String CNP;
    private int id;
    private String nrClasa;
    private String litClasa;
    

    public Elev() {
    }

    public Elev(String CNP) {
        this.CNP = CNP;
    }

    public Elev(String nume, String prenume, String adresa,String clasa, String CNP) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
        this.clasa = clasa;
        this.CNP = CNP;
        
    }

    public Elev(int id, String nume, String prenume, String adresa,String clasa, String CNP) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
        this.CNP = CNP;
        this.clasa = clasa;
        this.id = id;
    }

     
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getClasa() {
        return clasa;
    }
    
    

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getDescriere() {
        return nume + " " + prenume;
    }

    public String getDescriereCompleta() {
        String descriere = "Nume : " + nume + " " + prenume + "\nAdresa : " + adresa + "\nCNP : " + CNP;
        return descriere;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Elev other = (Elev) obj;
        if(this.id == other.id){
            return true;
        }
        if (!Objects.equals(this.CNP, other.CNP)) {
            return false;
        }
        return true;
    }

    public String getDescriereTip() {
        String des = id + "|" + nume + "|" + prenume + "|" + CNP + "|" + adresa + "|" + clasa;
        return des;
    }

    public static Elev getElevFromString(String reprezentare) {
        String[] atribute = reprezentare.split("\\|");
        int id = Integer.parseInt(atribute[0]);
        String nume = atribute[1];
        String prenume = atribute[2];
        String cnp = atribute[3];
        String adresa = atribute[4];
        String clasa = atribute[5];
        String numarClasa = clasa.split("-")[0].trim();
        String literaClasa = clasa.split("-")[1].trim();
        Elev e = new Elev(nume, prenume, adresa, clasa, cnp);
        e.setLiteraClasa(literaClasa);
        e.setNumarClasa(numarClasa);
        e.setId(id);
        return e;
    }

    @Override
    public String toString() {
        
    return nume+ " " +prenume+ " "+clasa;
        }

    public void setLiteraClasa(String litClasa) {
        this.litClasa = litClasa;
    }

    public void setNumarClasa(String nrClasa) {
        this.nrClasa = nrClasa;
   }

    public String getLitClasa() {
        return litClasa;
    }

    public String getNrClasa() {
        return nrClasa;
    }

    public String getNumeComplet() {
        return nume + " " + prenume;
    }
    
    
   
    

}
