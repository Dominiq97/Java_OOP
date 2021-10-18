/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obiecte;

//import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dominic
 */
public class ManagerElevi {
    private Resurse r;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ManagerElevi(Resurse r) {
        this.r = r;
    }
    
    

    

    public void adaugaAbsenta(Profesor p, Elev e, Materie m, boolean motivata) {
        Absenta a = new Absenta(new Date(), e, m, motivata, p);
        r.getListaAbsente().add(a);
    }

    public void puneAbsenta(String Cnprofesor, String CnpNume, Materie numeMaterie, boolean motivata) {
        Profesor prC = new Profesor(Cnprofesor);
        Profesor profDinLista = r.getListaProfesori().get(r.getListaProfesori().indexOf(prC));
    //    System.out.println(profDinLista.getNume());
        Elev elevCautat = new Elev(CnpNume);
        Elev elevDinLista = r.getListaElevi().get(r.getListaElevi().indexOf(elevCautat));
    //    System.out.println(elevDinLista.getNume());
        
        adaugaAbsenta(profDinLista, elevDinLista, numeMaterie, true);
    //    System.out.println(r.getListaAbsente().size());

    }

    public void noteElevi() {

        System.out.println("------ NOTE ------");

        for (int i = 0; i < r.getListaNote().size(); i++) {
            Nota nota = r.getListaNote().get(i);
            String numeElev = nota.getNumeElev().getDescriere();
            System.out.println(" Nota " + nota.getNota() + " luata de domnul/ don'soara " + numeElev + " la "+nota.getMaterie().getNumeMaterie());
            System.out.println("Motiv : " + nota.getDescriere());
        }
    }

    public void absenteElevi() {

        System.out.println("------ ABSENTE ------");
        for (int i = 0; i < r.getListaAbsente().size(); i++) {
            Date absenta = r.getListaAbsente().get(i).getData();
            Absenta a = r.getListaAbsente().get(i);
            String numeElev = a.getElev().getDescriere();
            System.out.print((i + 1) + ". Absenta de pe data de " + sdf.format(absenta) + " luata de domnul/don'soara " + numeElev);
            if (a.isMotivata() == true) {
                System.out.print(" motivata");

            } else {
                System.out.print(" nemotivata");
            }
            System.out.println(" la ora de " + a.getMaterie().getNumeMaterie());
        }
    }
    
   

     public void vizualizateNoteElev(String CnpElev) {
        Elev elevCautat = new Elev(CnpElev);
        Elev elevDinLista = r.getListaElevi().get(r.getListaElevi().indexOf(elevCautat));
        System.out.println("Domnul "+ elevDinLista.getDescriere() + " are : " );
        List<Nota> listaNote=r.getListaNote();
        for (int i = 0; i < listaNote.size(); i++) {
            Nota nota=listaNote.get(i);
                System.out.println(nota.getNota()+" la materia : "+nota.getMaterie().getNumeMaterie());
            
            }
            
            
        }
        
    }


