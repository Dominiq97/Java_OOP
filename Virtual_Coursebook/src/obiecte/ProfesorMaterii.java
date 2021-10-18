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
public class ProfesorMaterii {

    
    private int id = 0;
    private int profesorId;
    private int materieId;
    
    public ProfesorMaterii(int id, int profesorId, int materieId) {
        this.id = id;
        this.profesorId = profesorId;
        this.materieId = materieId;
    }

    public ProfesorMaterii(int profesorId, int materieId) {
        this.profesorId = profesorId;
        this.materieId = materieId;
    }
    
    

    public int getId() {
        return id;
    }

    public int getMaterieId() {
        return materieId;
    }

    public int getProfesorId() {
        return profesorId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMaterieId(int materieId) {
        this.materieId = materieId;
    }

    public void setProfesorId(int profesorId) {
        this.profesorId = profesorId;
    }

    public String getDescrierePM() {
        return id + "|" + profesorId + "|" + materieId;
    }
 
    
    public static ProfesorMaterii getObiectFromString(String linie) {
        String atribute[] = linie.split("\\|");
        int id = Integer.parseInt(atribute[0]);
        int profesorID = Integer.parseInt(atribute[1]);
        int materieID = Integer.parseInt(atribute[2]);
        ProfesorMaterii obiect = new ProfesorMaterii(id, profesorID, materieID);
        return obiect;
    }
    
}
