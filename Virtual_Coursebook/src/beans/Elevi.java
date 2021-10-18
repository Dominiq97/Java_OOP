package beans;
// Generated Oct 13, 2015 7:57:49 PM by Hibernate Tools 3.6.0



/**
 * Elevi generated by hbm2java
 */
public class Elevi  implements java.io.Serializable {


     private int id;
     private String nume;
     private String prenume;
     private String cnp;
     private String adresa;

    public Elevi() {
    }

	
    public Elevi(int id) {
        this.id = id;
    }
    public Elevi(int id, String nume, String prenume, String cnp, String adresa) {
       this.id = id;
       this.nume = nume;
       this.prenume = prenume;
       this.cnp = cnp;
       this.adresa = adresa;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNume() {
        return this.nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getPrenume() {
        return this.prenume;
    }
    
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public String getCnp() {
        return this.cnp;
    }
    
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
    public String getAdresa() {
        return this.adresa;
    }
    
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    public String getNumeComplet(){
        return nume+" "+prenume;
    }

    @Override
    public String toString() {
        return getNumeComplet();
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
        final Elevi other = (Elevi) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}

