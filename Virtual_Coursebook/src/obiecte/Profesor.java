/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package obiecte;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Dominic
 */
public class Profesor {
    
    private String nume;
    private String prenume;
    private ArrayList<Materie> listaMaterii = new ArrayList<Materie>();
    private String CNP;
    private int id;

    public Profesor(String nume, String prenume, String CNP) {
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
    }

    public Profesor(String nume, String prenume, String CNP, int id) {
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.id = id;
    }
    
    

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
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

    public String getPrenume() {
        return prenume;
    }

    public String getCNP() {
        return CNP;
    }
    
    

    public ArrayList<Materie> getListaMaterii() {
        return listaMaterii;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public String toString() {
        return nume.toUpperCase()+" "+prenume.toUpperCase(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static Profesor getProfesorFromString(String reprezentare){
       String[] atribute = reprezentare.split("\\|");
       int id = Integer.parseInt(atribute[0]);
       String nume = atribute[1];
       String prenume = atribute[2];
       String cnp = atribute[3];
       Profesor p = new Profesor(nume, prenume, cnp);
       p.setId(id);
    //   System.out.println(nume+" "+prenume);
       return p;
     }
    
   
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Profesor other = (Profesor) obj;
        if((this.id!=0) && this.id==other.id){
            return true;
        }
        if (!Objects.equals(this.CNP, other.CNP)) {
            return false;
        }
        return true;
    }

    public Profesor(String CNP){
         this.CNP = CNP;   
    }
    
    
    public String getDescriereTip(){
        return id+"|"+nume+"|"+prenume+"|"+CNP;
    }

    public String getNumeComplet() {
        return nume+" "+prenume;
    }
    
    
    
    
    
    
    
}
