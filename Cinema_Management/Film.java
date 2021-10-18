/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salaCinema;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Dominic
 */
public class Film {    //Obiectul Film
    
    private String nume;  //atributul nume film ex:"The expandables"
    private int durata;  // atributul durata timp : 90 (min)
    private Date dataInceput;  //atributul dataInceput 
    private int pret; // atributul pret
    private int nrZileRulare; //atributul nr zile rulare
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");//formateaza formula in care este afisata/memorata o variabila de tip Date

    public Film(String nume, int durata, int pret) {    //Constructorul obiectului film(parametrii: numele filmului, durata filmului si pretul biletului
        
        this.nume = nume;
        this.durata = durata;
        this.pret = pret;
       
    }

    public int getDurata() {
        return durata;
    }

    public String getNume() {
        return nume;
    }

    public int getPret() {
        return pret;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrZileRulare() {
        return nrZileRulare;
    }

    public Date getDataInceput() {
        return dataInceput;
    }

    public void setDataInceput(Date dataInceput) {
        this.dataInceput = dataInceput;
    }

    public void setNrZileRulare(int nrZileRulare) {
        this.nrZileRulare = nrZileRulare;
    }
    
    public Date getDataSfarsit(){
        Calendar cal = Calendar.getInstance();//getInstance-functie a Calendar-ului care seteaza valoarea variabilei cal in valoare de timp inregistrata in momentul compilarii
        cal.setTime(dataInceput);  //seteaza variabila cal ca data de inceput a rularii filmului
        cal.add(Calendar.DAY_OF_MONTH, nrZileRulare); //functia add(cu parametrii: ziua lunii a datii lui cal si nr zilelor de rulare = cu cat adaugi(sau scazi) in plus la data ca sa-ti dea ziua de sfarsit a rularii
        return cal.getTime();  //getTime returneaza valoarea calendarului variabilei cal 
        
    }  
    
    public static void main (String args[]) throws FileNotFoundException, IOException{
        
        FilmService fs = new FilmService(); //cum am zis la commul de la FilmService.. am initializat un obiect de tip
        //FilmService 
        List<Film> listaFilmeFisier=fs.getListaFilmeDinFisier();//si am luat dupa o alta variabila de tip Lista.. (cu elemente de tip Film)
        // si am zis ca Lista asta ia obiectul creat mai sus si utilizeaza functia pentru ciordit lista de filme dintr-un fisier :)
  
        
       for(int i = 0;i<listaFilmeFisier.size();i++){  //luam un vector.. cu i incepand de la 0, 1< lungimea listei de filme ciordite din fisier si i creste pas cu pas
           System.out.println((i+1)+". "+listaFilmeFisier.get(i).getDescriere()); // afisez in output lista de filme din fisier pe rand cu 1. 2. 3... blabla.. si
           // le afisam si descrierea cu ajutorul metodei getDescriere din clasa Film
        }
        Film mq = new Film("jffdkjfd", 44, 12);
        System.out.println(mq.durata);
        System.out.println(mq.dataInceput);
       // SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
       
        
        
        
    }
    
        
    
    public String getDescriere(){ //cu aceasta metoda se creaza o modalitate de a afisa/a memora un film(cu toate atributiile lui
        
        String descriere = nume+" , "+durata+" , "+ dateFormat.format(dataInceput)+" - "+dateFormat.format(getDataSfarsit());
        return descriere;
    }
    
    public String getFormatFisier(){ //aici creezi o metoda cu ajutorul careia afisezi lista de filme in fisier in clasa FilmService
        
        String forma = nume+"|"+durata+"|"+pret+"|"+dateFormat.format(dataInceput)+"|"+nrZileRulare+"|";
        return forma; 
    
    }
    
    
}
