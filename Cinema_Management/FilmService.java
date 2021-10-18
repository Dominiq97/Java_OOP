 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaCinema;

import com.sun.jmx.snmp.BerDecoder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominic
 */
public class FilmService {    // creez un obiect de tip FilmService iar.. in alte Clase.. pot sa utilizez metodele pe care le am mai jos
    // doar cu obiecte pe care le-am initializat de tipul FilmService in clasa respectiva

    private final String caleListaFilmeFisier = "C:\\Users\\Dominic\\Desktop\\ListaFilme.txt"; // variabila in care este memorata calea Fisierului pe
                                                                                               //pe disc

    public void salveazaDateFilme(ArrayList<Film> listaFilme) throws FileNotFoundException {  // metoda salveazaDateFilme de tip void care SALVEAZA(void)
                                                                    // filmele intr-un vector
        PrintWriter prWr = new PrintWriter(caleListaFilmeFisier);// variabila prWr este numele fisierului nostru iar ca paramentru.. PrintWriter-ul
                                                            // ia calea fisierului unde vor fi salvate filmele
        for (int i = 0; i < listaFilme.size(); i++) { //de la o variabila i = 0, i mai mic decat lungimea listei de filme, i creste pas cu pas.
            prWr.println(listaFilme.get(i).getFormatFisier()); //iar fisierul(prWr) are functia println care afiseaza in fisier fiecare film din lista
            //iar lista filme are si ea functia de get(i) pentru a pune toate filmele in vector
        }
        prWr.close();//inchidem fisierul(ca in pascal)

    } 

    public ArrayList<Film> getListaFilmeDinFisier() throws IOException {  //metoda de tip ArrayList returneaza o variabila de tip ArrayList
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");// formateaza aspectul unei variabile Date
        ArrayList<Film> listaFilme = new ArrayList<Film>(); //variabila listaFilme initializata de tip ArrayList<Film> In lista respectiva
                                                                    // se afla OBIECTE DE TIP FILM (d-aia e chestia cu <Film>) 
        BufferedReader buff = new BufferedReader(new FileReader(caleListaFilmeFisier)); // citim elemente din calea Fisierului respectiv
        String linie = null; // linia este nula.. pana acum n-am citit nimic. spunem ca fisierul e gol
        while ((linie = buff.readLine()) != null) {  //in timp ce prima linie vedem ca nu este nula...
            String atribute[] = linie.split("\\|"); // atribute este un vector care pastreaza in el Stringuri
            //linie.split("\\|"); este o functie folosita pentru a returna in vectorul atribute
            // valoarea liniei pana in momentul in care intalneste un "|"
            
           // Shrek|90]30|09.10.2011|12|
            String numeFilm = atribute[0]; // variabila numeFilm care memoreaza primul atribut al filmului adica numele; atribute[0] = Shrek
            int durata = Integer.parseInt(atribute[1]);//variabila durata care memoreaza al doilea atribut al filmului atribute[1] = 90 
               // si care este transformata in integer cu ajutorul Integer.ParseInt datorita faptului ca vectorul atribute[] tre sa aibe valori
            // in String(asa a fost initializat: String atribute[] = linie.split("\\|");)
            int pret = Integer.parseInt(atribute[2]); // variabila pret care memoreaza al treilea atribut al filmului adica pretul;
                  //atribute[2] = 30; ea la fel fiind transformata in int din aceeasi cauza ca la durata
            Date dataInceput = new Date(); //variabila de tip Date dataInceput initializata 
            try {
                dataInceput = dateFormat.parse(atribute[3]);  // in try-ul asta e schimbat tipul Date in String deoarece atribute
                // e un vector care nu poate avea elemente de tip INT sau DATE si intra in vectorul atribute[] al patrulea
                //atribute[3] = 09.10.2011
            } catch (ParseException ex) {        //blabla
                Logger.getLogger(FilmService.class.getName()).log(Level.SEVERE, null, ex);   //blabla
              }
            int zileRulare = Integer.parseInt(atribute[4]); //variabila zileRulare care memoreaza ultimul atribut al filmului si care e transformata
            // in String
            Film f = new Film(numeFilm, durata, pret); // este creat un obiect f de tip Film
            f.setDataInceput(dataInceput); // ii setez data de inceput rulare obiectului f
            f.setNrZileRulare(zileRulare); // setare nr de zile rulare obiectului f
            listaFilme.add(f); // pun obiectul f in lista de filme initiala
        }

        return listaFilme; //returnez valoarea(valorile de tip Arraylist pe care le-a cerut-o metoda) lista de filme
    }

}
