/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author Dominic
 */
public class Raft {
    
    private ArrayList<Carte> listaCarti;
    private int nrRaft;

    public Raft(int nrRaft) {
        this.nrRaft = nrRaft;
        listaCarti = new ArrayList<Carte>();
    }

    public ArrayList<Carte> getListaCarti() {
        return listaCarti;
    }

    public int getNrRaft() {
        return nrRaft;
    }

    public void setListaCarti(ArrayList<Carte> listaCarti) {
        this.listaCarti = listaCarti;
    }
    
    public void adaugaCartePeRaft(Carte c){
        listaCarti.add(c);
    }
    
    public void scoateCarteDePeRaft(Carte c){
        listaCarti.remove(c);
    }
    
    public void scoateCarteSpeciala(int pozitieCarte){
        listaCarti.remove(pozitieCarte);
    }
    
    public int getNumarCartiDePeRaft(){
        return listaCarti.size();
    }
    
    public String getDescriereRaft(){
        String descriere = "Raft "+nrRaft+"\n";
        descriere =descriere+"-------------------------\n";
        for(int i = 0; i<listaCarti.size();i++){
            descriere = descriere+(i+1)+". "+getCarteDinRaft(i).getDescriereCarte()+"\n";
        }
        descriere= descriere+"-------------------------\n";
        
        
        return descriere;
    }
    
    public Carte getCarteDinRaft(int numarCarte){
        return listaCarti.get(numarCarte);
    }
    
    
}
