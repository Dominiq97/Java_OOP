package beans;
// Generated Oct 13, 2015 7:57:49 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Note generated by hbm2java
 */
public class Note  implements java.io.Serializable {


     private int id;
     private Date dataNota;
     private Integer nota;
     private Integer idProfesor;
     private Integer idElev;
     private Integer idMaterie;

    public Note() {
    }

	
    public Note(int id) {
        this.id = id;
    }
    public Note(int id, Date dataNota, Integer nota, Integer idProfesor, Integer idElev, Integer idMaterie) {
       this.id = id;
       this.dataNota = dataNota;
       this.nota = nota;
       this.idProfesor = idProfesor;
       this.idElev = idElev;
       this.idMaterie = idMaterie;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Date getDataNota() {
        return this.dataNota;
    }
    
    public void setDataNota(Date dataNota) {
        this.dataNota = dataNota;
    }
    public Integer getNota() {
        return this.nota;
    }
    
    public void setNota(Integer nota) {
        this.nota = nota;
    }
    public Integer getIdProfesor() {
        return this.idProfesor;
    }
    
    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }
    public Integer getIdElev() {
        return this.idElev;
    }
    
    public void setIdElev(Integer idElev) {
        this.idElev = idElev;
    }
    public Integer getIdMaterie() {
        return this.idMaterie;
    }
    
    public void setIdMaterie(Integer idMaterie) {
        this.idMaterie = idMaterie;
    }




}


