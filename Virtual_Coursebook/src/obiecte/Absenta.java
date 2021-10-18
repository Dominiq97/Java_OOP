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
class Animal {

}

public class Absenta {

    private int id;
    private Date data;
    private Elev elev;
    private Materie materie;
    private boolean motivata;
    private Profesor profesor;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static MateriiManager materiiManager = new MateriiManager();
    private static ProfManager profManager = new ProfManager();
    private static EleviManager eleviManager = new EleviManager();

    public Absenta(Date data, Elev elev, Materie materie, boolean motivata, Profesor profesor) {
        this.data = data;
        this.elev = elev;
        this.materie = materie;

        this.motivata = motivata;
        this.profesor = profesor;
    }

    public Absenta(int id, Date data, Elev elev, Materie materie, boolean motivata, Profesor profesor) {
        this.id = id;
        this.data = data;
        this.elev = elev;
        this.materie = materie;
        this.motivata = motivata;
        this.profesor = profesor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public Elev getElev() {
        return elev;
    }

    public Materie getMaterie() {
        return materie;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public boolean isMotivata() {
        return motivata;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setElev(Elev elev) {
        this.elev = elev;
    }

    public void setMotivata(boolean motivata) {
        this.motivata = motivata;
    }

    public void setMaterie(Materie materie) {
        this.materie = materie;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    public String linieFisier() {
        
        return id + "|" + elev.getId() + "|" + (motivata?1:0) + "|" + materie.getId() + "|" + profesor.getId() + "|" + sdf.format(data);
    }

    public String getDescriereNota() {
        return elev + " " + motivata + " " + materie + " " + profesor + " " + sdf.format(data);
    }

    public static Absenta getAbsentaFromString(String linie) {
        String[] atribute = linie.split("\\|");
        int id = Integer.parseInt(atribute[0]);
        int idElev = Integer.parseInt(atribute[1]);
        Elev e = eleviManager.getElevById(idElev);
        int absenta = Integer.parseInt(atribute[2]);
        int idMaterie = Integer.parseInt(atribute[3]); //idul materiei
        Materie m = materiiManager.getMaterieById(idMaterie);
        int idProfesor = Integer.parseInt(atribute[4]); //idul profesorului
        Profesor p = profManager.getProfesorById(idProfesor);
        Date dataNota = null;
        try {
            dataNota = sdf.parse(atribute[5]);
        } catch (ParseException ex) {
            Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
        }

        Absenta a = new Absenta(id, dataNota, e, m, (absenta==1)?true:false, p);

        a.setId(id);
        return a;

    }

    public String getDescriereAbsenta() {
        return elev + " " + motivata + " " + materie + " " + profesor + " " + sdf.format(data);
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
        final Absenta other = (Absenta) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    

}
