/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaCinema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

/**
 *
 * @author Dominic
 */
public class SalaService {  // am creat clasa SalaService pentru a face o metoda de a extrage o configuratie de sala dintr-un oarecare fisier 

       // am uitat ce inseamna static..
    public static int[][] getConfiguratieSalaDinFisier(String caleFisier) throws IOException, ParseException { //metoda de tip int[][] adica o sa
        // returneze o matrice cu parametrul: calefisier din care extragem configuratia respectiva/matricea

        int[][] configSala; // configSala este numele matricei
        BufferedReader buff = new BufferedReader(new FileReader(caleFisier));// asta ne ajuta sa precizam din ce fisier extragem configuratia/matricea
        String linie = buff.readLine(); // o linie.. nu inteleg foarte bine randul asta..
        int nrLC = Integer.parseInt(linie); // luam o variabila nrLC(nrLiniiColoane care sa reprezinte primul caracter citit din fisier
        configSala = new int[nrLC][nrLC]; // spunem ca matricea sala are ca numar de linii si coloane nrLC : [nrLC][nrLC]
        //System.out.println(nrLC);
        for (int i = 0; i < nrLC; i++) { // creem un for cu i = 0, i mai mic decar numarul de linii si coloane, i creste pas cu pas
            linie = buff.readLine(); // linie citeste fiecare rand
            String atribute[] = linie.split("\\|");
            
            for (int j = 0; j < atribute.length; j++) {
                configSala[i][j] = Integer.parseInt(atribute[j]);
            }
        }
        return configSala;
    } 

}
