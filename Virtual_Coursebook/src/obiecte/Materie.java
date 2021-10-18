/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package obiecte;

/**
 *
 * @author Dominic
 */
public class Materie {
    
    private String numeMaterie;
    private int id;

    public Materie(String numeMaterie) {
        this.numeMaterie = numeMaterie;
    }

    public Materie(int id, String numeMaterie) {
        this.numeMaterie = numeMaterie;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getNumeMaterie() {
        return numeMaterie;
    }

    public void setNumeMaterie(String numeMaterie) {
        this.numeMaterie = numeMaterie;
    }
    
    public String getDescriereMaterie(){
        return (id + "|" + numeMaterie);
    }
    
    public static Materie getMaterieFromString(String reprezentare){
        String[] atribute = reprezentare.split("\\|");
        int id = Integer.parseInt(atribute[0]);
        String numeMaterie = atribute[1];
        Materie mat = new Materie(id, numeMaterie);
        mat.setId(id);
        return mat;
        
    }

    @Override
    public String toString() {
        return numeMaterie; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Materie other = (Materie) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
   
    

    
}
