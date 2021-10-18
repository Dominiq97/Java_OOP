/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dominic
 */
public class Carte {

    private String titlu;
    private String editura;
    private ArrayList<String> autori;
    private int pret;
    private int nrPagini;

    public Carte(String titlu, String editura, ArrayList<String> autori, int pret, int nrPagini) {
        this.titlu = titlu;
        this.editura = editura;
        this.autori = autori;
        this.pret = pret;
        this.nrPagini = nrPagini;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public ArrayList<String> getAutori() {
        return autori;
    }

    public void setAutori(ArrayList<String> autori) {
        this.autori = autori;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public static void main(String args[]) {

        Persoana p1 = new Persoana("Iftimie", "David", true, "strada Nufarului, nr. 8, Calarasi");
        Persoana p2 = new Persoana("Roman", "Silviu", true, "Strada Matei Barbu, nr 29, Calarasi");
        Persoana p3 = new Persoana("Radu", "Matei", true, "Strada Stefan voda lalala");
        Persoana p4 = new Persoana("Sorin", "Stefania", false, "Strada Stirbei lalalalaaaaaa");
        Persoana p5 = new Persoana("Matei", "Diana", false, "Strada Alexandru lalalalaaaaaa");

        ArrayList<String> listaAutori1 = new ArrayList<String>();
        listaAutori1.add("Marin Fotache");
        listaAutori1.add("Ioana Brava");
        listaAutori1.add("Catalin Strambei");
        listaAutori1.add("Liviu Cretu");
        ArrayList<String> listaAutori2 = new ArrayList<String>();
        ArrayList<String> listaAutori3 = new ArrayList<String>();

        listaAutori2.add("James E. L.");
        listaAutori3.add("Ion Creanga");
        //  listaAutori.add("Ion Creanga");
        Raft rf1 = new Raft(1);
        Raft rf2 = new Raft(2);
        Raft rf3 = new Raft(3);
        Raft rf4 = new Raft(4);

        Carte carte1 = new Carte("Visual Fox Pro", "Polirom", listaAutori1, 45, 585);
        Carte carte2 = new Carte("50 shades of Gray", "Polirom", listaAutori2, 40, 420);
        Carte carte3 = new Carte("Amintiri din Copilarie", "Polirom", listaAutori3, 23, 131);
        
        rf1.adaugaCartePeRaft(carte3);
        rf2.adaugaCartePeRaft(carte2);
        rf3.adaugaCartePeRaft(carte1);

        System.out.println(carte1.getTitlu() + " " + carte1.getEditura());
        System.out.println(carte1.getDescriereCarte());

        rf1.adaugaCartePeRaft(carte1);
        System.out.println(rf1.getCarteDinRaft(0).getDescriereCarte());

        Biblioteca b1 = new Biblioteca("Biblioteca comunala Modelu", 100);
        b1.adaugaRaftInBiblioteca(rf2);
        b1.adaugaRaftInBiblioteca(rf1);
        b1.adaugaRaftInBiblioteca(rf3);

        System.out.println(b1.getDescriereBiblioteca());

        List<Carte> listaCarte1 = new ArrayList<Carte>();
        listaCarte1.add(carte2);
        listaCarte1.add(carte1);

       
        Date d1 = new Date();
        Calendar c = Calendar.getInstance();
        c.set(2014, 8, 25);

        for (Carte cl1 : listaCarte1) {
            PerioadaImprumut im = new PerioadaImprumut(p1, cl1, d1);
            b1.adaugaImprumutInIstoric(im);
        }

       
        
            PerioadaImprumut pi1=b1.cautaCarte(carte2);
            
            if(pi1!=null){
                System.out.println("Cartea "+pi1.getCarte().getTitlu()+" este imprumatata lui "+pi1.getPersoana().getNumeComplet());
            }
            
           
            if(pi1!=null){
              //  System.out.println(pi.getCarte().getTitlu()+" "+pi.getPersoana().getNumeComplet());
                pi1.setDataInapoiere(new Date());
            }
            
            PerioadaImprumut pi2=b1.cautaCarte(carte2);
            if(pi2!=null){
                System.out.println("Cartea "+pi2.getCarte().getTitlu()+" este imprumatata lui "+pi2.getPersoana().getNumeComplet());
            }
            else{
                System.out.println("Cartea "+carte2.getTitlu()+" este disponibila!");
            }
           
            

    }

    public String getDescriereCarte() {
        String aut = "(";
        for (int i = 0; i < autori.size(); i++) {
            aut = aut + autori.get(i) + ", ";
        }
        aut = aut.substring(0, aut.length() - 2) + ")";
        return titlu + " , " + editura + " " + aut;

    }

}
