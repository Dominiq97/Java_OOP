/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaCinema;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominic
 */
public class Sala {

    private int[][] sala = null; //atributul sala
    private int nrLocuri = 0; //atributul numar locuri
    private int nrLiniiColoane; //numarul de linii si coloane ale matricei sala
    private int nrLocuriOcupate = 0;//numarul de locuri ocupate(1 in matrice)
    private int nrLocuriIndisponibile = 0;//numarul de locuri indisponibile(-1 in matrice)
    private int nrLocuriLibere = 0;//numarul de locuri libere(0 in matrice)
    private String numeSala;
    private String caleFisier;

    public Sala(int nrLocuri, String numeSala) {   // constructorul obiectului Sala ( parametri: numarul de locuri si numele salii )
        this.nrLocuri = nrLocuri;
        nrLiniiColoane = (int) Math.sqrt(nrLocuri);
        if ((nrLiniiColoane * nrLiniiColoane) != nrLocuri) {
            nrLiniiColoane = nrLiniiColoane + 1;
        }
        sala = new int[nrLiniiColoane][nrLiniiColoane]; // in chestia asta ai calculat numarul de linii si de coloane pe care ar trebui sa le aibe
        // sala astfel incat sa fie o matrice patratica.. (sala de forma patrat)
        
        for(int i=0;i<nrLiniiColoane;i++){
            for(int j=0;j<nrLiniiColoane;j++){
                sala[i][j]=-1;
            }
        }
        this.numeSala = numeSala;

    }

    public Sala(String numeSala, String caleFisier) { // constructor Sala cu parametrii: numeSala si caleFisier iin care o sa salvezi configuratia salii
        try {
            this.sala = SalaService.getConfiguratieSalaDinFisier(caleFisier);
            this.nrLocuri = this.sala.length * this.sala.length;
            nrLiniiColoane = (int) Math.sqrt(nrLocuri);
            this.numeSala = numeSala;
            this.caleFisier = caleFisier;
        } catch (IOException ex) {
            Logger.getLogger(Sala.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Sala.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public String getNumeSala() {
        return numeSala;
    }

    public int getNumarLocuriLibere() { // cu  metoda asta ai calculat numarul de locuri libere(sau notate cu 0) din sala
        nrLocuriLibere = 0;
        for (int i = 0; i < nrLiniiColoane; i++) {
            for (int j = 0; j < nrLiniiColoane; j++) {
                if (sala[i][j] == 0) {
                    nrLocuriLibere++;
                }
            }
        }
        return nrLocuriLibere;
    }

    public int getNumarLocuriOcupate() {  // cu metoda asta ai calculat numarul de locuri ocupata(sau notate cu 1) din sala
        nrLocuriOcupate = 0;
        for (int i = 0; i < nrLiniiColoane; i++) {
            for (int j = 0; j < nrLiniiColoane; j++) {
                if (sala[i][j] == 1) {
                    nrLocuriOcupate++;
                }
            }
        }
        return nrLocuriOcupate;
    }

    public int getNumarLocuriIndisponibile() {  // cu metoda asta ai calculat numarul de locuri indisponibile(sau notate cu -1) din sala
        nrLocuriIndisponibile = 0;
        for (int i = 0; i < nrLiniiColoane; i++) {
            for (int j = 0; j < nrLiniiColoane; j++) {
                if (sala[i][j] == -1) {
                    nrLocuriIndisponibile++;
                }
            }
        }
        return nrLocuriIndisponibile;
    }

    public void ocupaLocInSala(int rand, int coloana) {  // este o metoda void cu parametrii de tip i si j care schimba o valoare
        if (isLocDisponibil(rand, coloana)) {   // cu metoda isLocDisponibil(de tip boolean) compilatorul verifica daca locul (rand,coloana)
            //disponibil(adica are valoare 0) in matrice(sala)
            sala[rand][coloana] = 1;  // daca locul respectiv are valoarea 0 adica este liber.. atunci locul se va ocupa si va avea valoare 1
        }
    }

    public void marcheazaLocIndisponibil(int rand, int coloana) { // este o metoda care schimba valoarea unui loc in matrice/sala in -1
        sala[rand][coloana] = -1;
    }

    public void afisareSala() {  //afisam datele salii si matricea/ sala propriu zisa
        System.out.println("---------------------------------------------------------------------");
        System.out.println(numeSala + " locuri disponibile " + getNumarLocuriLibere() + " si locuri ocupate " + getNumarLocuriOcupate());
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < nrLiniiColoane; i++) {
            for (int j = 0; j < nrLiniiColoane; j++) {
                System.out.print(sala[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------");
    }

    public boolean isLocDisponibil(int rand, int coloana) {  // metoda in care verificam daca un loc este liber(are valoarea 0)
        // sau este ocupat sau indisponibil(are valorile 1 si -1 cu ajutorul tipului boolean
        boolean disponibil = true;
        if (sala[rand][coloana] == -1 || sala[rand][coloana] == 1) {
            disponibil = false;
        }
        return disponibil;
    }

    public boolean isSalaOcupata() {   // metoda in care verificam daca sala este ocupata sau nu
        boolean ocupata = true;
        for (int i = 0; i < nrLiniiColoane; i++) {
            for (int j = 0; j < nrLiniiColoane; j++) {
                if (sala[i][j] == 0) {
                    ocupata = false;
                    break;
                }
            }
        }

        return ocupata;
    }

    public int getNrLiniiColoane() {
        return nrLiniiColoane;
    }

    
    public int getTotalIncasari(int n) {

        int incasari = 0;
        for (int i = 0; i < nrLiniiColoane; i++) {
            for (int j = 0; j < nrLiniiColoane; j++) {
                if (sala[i][j] == 1) {
                    incasari = incasari + n;
                }
            }
        }
        return incasari;     // calculeaza totalul incasarilor daca un loc ar fi 12 lei la un film de exemplu si sunt 3 locuri ocupate
        // metoda va returna valoarea 36
    }

    public static void main(String args[]) throws IOException, ParseException {

        //  for(int i = 0;i<listaFilmeFisier.size();i++){
        //      System.out.println(listaFilmeFisier.get(i).getDescriere());
        //  }
        String caleFis = "C:\\Users\\Dominic\\Desktop\\Date Sala A1.txt";
        Sala s = new Sala("Sala mea", caleFis);
        s.afisareSala();
        System.out.println(s.nrLocuri);

    }

    public void salveazaDateFisier() throws IOException {
        PrintWriter pw1 = new PrintWriter(new FileWriter(caleFisier));
        pw1.println(nrLiniiColoane);
        for (int i = 0; i < nrLiniiColoane; i++) {
            for (int j = 0; j < nrLiniiColoane; j++) {
                pw1.print(sala[i][j] + "|");
            }
            pw1.println();
        }
        pw1.close();

    }

    public int[][] getSala() {
        return sala;
    }
    
    
}
