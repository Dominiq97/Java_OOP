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
public class Biblioteca {

    private String nume;
    private ArrayList<Raft> listaRafturi;
    private int dimensiune;
    private ArrayList<PerioadaImprumut> listaImprumuturi;

    public Biblioteca(String nume, int dimensiune) {
        this.nume = nume;
        // this.listaRafturi = listaRafturi;
        listaRafturi = new ArrayList<Raft>();
        this.listaImprumuturi=new ArrayList<PerioadaImprumut>();
        this.dimensiune = dimensiune;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getDImensiune() {
        return dimensiune;
    }

    public ArrayList<Raft> getListaRafturi() {
        return listaRafturi;
    }

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    public void setListaRafturi(ArrayList<Raft> listaRafturi) {
        this.listaRafturi = listaRafturi;
    }

    public void adaugaRaftInBiblioteca(Raft r) {
        listaRafturi.add(r);
    }

    public int getNumarTotalCartiInBiblioteca() {
        int nrTotal = 0;
        for (int i = 0; i < listaRafturi.size(); i++) {
            nrTotal = nrTotal + listaRafturi.get(i).getNumarCartiDePeRaft();
        }
        return nrTotal;
    }

    public String getDescriereBiblioteca() {
        String descriere = "---------- " + nume + " -----------";
        descriere = descriere + "\n";
        for (int i = 0; i < listaRafturi.size(); i++) {
            descriere = descriere + listaRafturi.get(i).getDescriereRaft() + "\n";
        }
        descriere = descriere + "Total carti : " + getNumarTotalCartiInBiblioteca();
        return descriere;
    }

    public void adaugaImprumutInIstoric(PerioadaImprumut p) {
        listaImprumuturi.add(p);
    }

    public PerioadaImprumut cautaCarte(Carte c) {
        for (int i = 0; i < listaImprumuturi.size(); i++) {
            PerioadaImprumut pi = listaImprumuturi.get(i);
            if (c.getTitlu().equals(pi.getCarte().getTitlu()) && pi.getDataInapoiere() == null) {
                return pi;
            }      

        }
        return null;
    }

}
