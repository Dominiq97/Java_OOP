/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obiecte;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dominic
 */
public class Resurse {

    public ArrayList<Elev> listaElevi = new ArrayList<Elev>();
    public ArrayList<Materie> listaMaterii = new ArrayList<Materie>();
    public ArrayList<Parinte> listaParinti = new ArrayList<Parinte>();
    public ArrayList<Profesor> listaProfesori = new ArrayList<Profesor>();
    public ArrayList<Nota> listaNote = new ArrayList<Nota>();
    public ArrayList<Absenta> listaAbsente = new ArrayList<Absenta>();
    
    

    public ArrayList<Absenta> getListaAbsente() {
        return listaAbsente;
    }

    public ArrayList<Elev> getListaElevi() {
        return listaElevi;
    }

    public ArrayList<Materie> getListaMaterii() {
        return listaMaterii;
    }

    public ArrayList<Nota> getListaNote() {
        return listaNote;
    }

    public ArrayList<Parinte> getListaParinti() {
        return listaParinti;
    }

    public ArrayList<Profesor> getListaProfesori() {
        return listaProfesori;
    }

    public Resurse() {
        Elev mihai = new Elev("Stoian", "Mihai", "str. Matei Basarab, nr. 12", "11 C", "1981212510032");
        Elev andrei = new Elev("Anghel", "Andrei", "str. Lujerului, nr. 90", "10 B", "1982202530050");
        Elev george = new Elev();
        george.setNume("gheorghe");
        george.setPrenume("george");
        george.setAdresa("str. Teiului, nr 56");
        george.setClasa("9 F");
        george.setCNP("1992312120032");

        listaElevi.add(george);
        listaElevi.add(andrei);
        listaElevi.add(mihai);

        Materie mate = new Materie("Matematica");
        Materie lbRomana = new Materie("lb. Romana");
        Materie info = new Materie("Informatica");
        Materie lbEng = new Materie("lb. Engleza");
        Materie economie = new Materie("Economie");

        listaMaterii.add(mate);
        listaMaterii.add(info);
        listaMaterii.add(lbRomana);
        listaMaterii.add(lbEng);
        listaMaterii.add(economie);

        Parinte anghel = new Parinte("Anghel", "Simion", "92943812");
        Parinte paraschiv = new Parinte("Paraschiv", "Mihailescu", "49204901");

        listaParinti.add(anghel);
        listaParinti.add(paraschiv);

        Profesor prof1 = new Profesor("Marcela", "Preda", "1230230430012");
        Profesor prof2 = new Profesor("Stefan", "Ciprian", "1930123120034");

        listaProfesori.add(prof2);
        listaProfesori.add(prof1);

        Nota nota1 = new Nota(8, mate, new Date(), george, prof2);
        Nota nota2 = new Nota(9, economie, new Date(), andrei, prof1);
        Nota nota3 = new Nota(10, info, new Date(), mihai, prof2);
        Nota nota4 = new Nota(4, economie, new Date(), andrei, prof2);
        Nota nota5 = new Nota(1, lbEng, new Date(), george, prof1);

        nota5.setDescriere("Copiat la test");
        nota4.setDescriere("Ascultat");
        nota3.setDescriere("lucrare de control");
        nota2.setDescriere("test");
        nota1.setDescriere("test");

        listaNote.add(nota5);
        listaNote.add(nota4);
        listaNote.add(nota3);
        listaNote.add(nota2);
        listaNote.add(nota1);

        Absenta abs1 = new Absenta(new Date(), george, lbEng, false, prof1);
        Absenta abs2 = new Absenta(new Date(), andrei, lbEng, false, prof1);
        Absenta abs3 = new Absenta(new Date(), mihai, mate, true, prof2);

        listaAbsente.add(abs3);
        listaAbsente.add(abs2);
        listaAbsente.add(abs1);

    }

    public void adaugaNota(Profesor p, Elev e, Materie m, int nota) {
        Nota n = new Nota(nota, m, new Date(), e, p);
        listaNote.add(n);
    }

    public void puneNota(String Cnprofesor, String CnpNume, Materie numeMaterie, int nota) {
        Profesor profCautat = new Profesor(Cnprofesor);
        Profesor profDinLista = listaProfesori.get(listaProfesori.indexOf(profCautat));
        Elev elevCautat = new Elev(CnpNume);
        Elev elevDinLista = listaElevi.get(listaElevi.indexOf(elevCautat));

        adaugaNota(profDinLista, elevDinLista, numeMaterie, nota);
        System.out.println(listaNote.size());
        
    }
    
         /*   public void vizualizateNoteElev(String CnpElev) {
        Elev elevCautat = new Elev(CnpElev);
        Elev elevDinLista = listaElevi.get(listaElevi.indexOf(elevCautat));
        System.out.println("Domnul "+ elevDinLista.getDescriere() + " are : " );
        for (int i = 0; i < listaNote.size(); i++) {    
                System.out.println(listaNote.get(i).getNota()+" la materia : "+listaMaterii.get(i).getNumeMaterie());
            
            }
            
            
        }*/
    
    
    //public int getNumarNoteDupaElev(String cnpElev){
       // return getListaNote().get;
    //}
    
  /*  public void adaugaAbsenta(Profesor p, Elev e, Materie m, boolean motivata) {
        Absenta a = new Absenta(new Date(), e, m, motivata, p);
        listaAbsente.add(a);
    }
    
    public void puneAbsenta(String Cnprofesor, String CnpNume, Materie numeMaterie, boolean motivata) {
        Profesor prC = new Profesor(Cnprofesor);
        Profesor profDinLista = listaProfesori.get(listaProfesori.indexOf(prC));
        System.out.println(profDinLista.getNume());
        Elev elevCautat = new Elev(CnpNume);
        Elev elevDinLista = listaElevi.get(listaElevi.indexOf(elevCautat));
        System.out.println(elevDinLista.getNume());
        
        adaugaAbsenta(profDinLista, elevDinLista, numeMaterie, motivata);
        
        
    }      
 */ 
    
    
}
