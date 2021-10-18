/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package obiecte;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.EleviManager;
import utils.MateriiManager;
import utils.ProfManager;

/**
 *
 * @author Dominic
 */
public class Nota {
    
    private int nota;
    private Materie materie;
    private Date dataOra;
    private Elev numeElev;
    private Profesor numeProfesor;
    private String descriere;
    private int procent;
    private int id;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static MateriiManager materiiManager=new MateriiManager();
    private static ProfManager profManager=new ProfManager();
    private static EleviManager eleviManager=new EleviManager();
    
    

    public Nota(int nota, Materie materie, Date dataOra, Elev numeElev, Profesor numeProfesor) {
        this.nota = nota;
        this.procent = 100;
        this.materie = materie;
        this.dataOra = dataOra;
        this.numeElev = numeElev;
        this.numeProfesor = numeProfesor;
        this.descriere = "oral";
    }

    public Nota(int id, int nota, Materie materie, Date dataOra, Elev numeElev, Profesor numeProfesor, String descriere, int procent) {
        this.id = id;
        this.nota = nota;
        this.materie = materie;
        this.dataOra = dataOra;
        this.numeElev = numeElev;
        this.numeProfesor = numeProfesor;
        this.descriere = descriere;
        this.procent = procent;
        
    }

    public int getId() {
        return id;
    }

    public int getProcent() {
        return procent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProcent(int procent) {
        this.procent = procent;
    }
    
    public String getDescriereNota(){
        return numeElev+" "+nota+" "+materie+" "+numeProfesor+" "+sdf.format(dataOra);
    }
    
    public String linieFisier(){
        return id+"|"+numeElev.getId()+"|"+nota+"|"+materie.getId()+"|"+numeProfesor.getId()+"|"+sdf.format(dataOra);
    }
    
    
    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }
    
    public String getDescriere() {
        return descriere;
    }
    
    public Date getDataOra() {
        return dataOra;
    }

    public Elev getNumeElev() {
        return numeElev;
    }

    public int getNota() {
        return nota;
    }

    public Profesor getNumeProfesor() {
        return numeProfesor;
    }

    public void setDataOra(Date dataOra) {
        this.dataOra = dataOra;
    }

    public void setMaterie(Materie materie) {
        this.materie = materie;
    }
    
    

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setNumeElev(Elev numeElev) {
        this.numeElev = numeElev;
    }

    public void setNumeProfesor(Profesor numeProfesor) {
        this.numeProfesor = numeProfesor;
    }

    public Materie getMaterie() {
        return materie;
    }
    
    public static Nota getNotaFromString(String linie){
        String[] atribute = linie.split("\\|");
        int id = Integer.parseInt(atribute[0]);
        int idElev = Integer.parseInt(atribute[1]);
        Elev e=eleviManager.getElevById(idElev);
        int nota = Integer.parseInt(atribute[2]);
        int idMaterie = Integer.parseInt(atribute[3]); //idul materiei
        Materie m=materiiManager.getMaterieById(idMaterie);
        int idProfesor = Integer.parseInt(atribute[4]); //idul profesorului
        Profesor p=profManager.getProfesorById(idProfesor);
        Date dataNota=null;
        try {
            dataNota = sdf.parse(atribute[5]);
        } catch (ParseException ex) {
            Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Nota n = new Nota(nota, m, dataNota, e, p);
        
        n.setId(id);
        return n;
        
        
        
    }
    
    
    
}
