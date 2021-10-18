/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obiecte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dominic
 */
public class ExempleFisier {

    public static void main(String args[]) throws IOException {

        File dir = new File(Constante.FOLDER_DATA);
        //if (!dir.exists()) {
        //    dir.mkdir();
        //}
        File[] fisiere = new File[]{new File(dir, Constante.FISIER_ELEVI),
            new File(dir, Constante.FISIER_PROFESORI),
            new File(dir, Constante.FISIER_MATERIE),
            new File(dir, Constante.FISIER_NOTE),
            new File(dir, Constante.FISIER_ABSENTE)};

        for (File fisier : fisiere) {
            if (!fisier.exists()) {
                fisier.createNewFile();
            }
        }

        BufferedReader buff = new BufferedReader(new FileReader(fisiere[0]));
       // System.out.println(buff.readLine());
        //System.out.println(e.getDescriere());

        List<Elev> listaElevi = new ArrayList<Elev>();
        String linie = null;
        while ((linie = buff.readLine()) != null) {
            Elev e = Elev.getElevFromString(linie);
            listaElevi.add(e);
        }
        System.out.println(listaElevi.size());
        buff.close();
        
        PrintWriter out = new PrintWriter(new FileWriter(fisiere[0], true));
        Elev e3 = new Elev("Gheorge", "Vasile", "str. Lujer, nr 4 Calarasi", "III-B", "1980221293456");
        e3.setId(3);
        out.println(e3.getDescriereTip());
        out.close();
        

    }
}
