/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import obiecte.Constante;
import obiecte.Elev;



/**
 *
 * @author Dominic
 */
public class EleviManager {

    private List<Elev> listaElevi = new ArrayList<Elev>();
    public static int ID_ELEV = 0;
    private File data = new File(Constante.FOLDER_DATA);

    public EleviManager() {
        try {
            loadElevi();
        } catch (IOException ex) {
            Logger.getLogger(EleviManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Elev getElevById(int id){
        Elev e = new Elev();
        e.setId(id);
        int index = listaElevi.indexOf(e);
        if(index!=-1){
            return listaElevi.get(index);
        }
        return null;
                
    }

    public int saveElev(Elev e) throws IOException {
        int index=-1;
        if (e.getId() <= 0) {
            System.out.println("Adaug in fisier elev");
            ID_ELEV++;
            e.setId(ID_ELEV);
            listaElevi.add(e);
            PrintWriter out = new PrintWriter(new FileWriter(new File(data, Constante.FISIER_ELEVI), true));
            out.println(e.getDescriereTip());
            out.flush();
            out.close();
        } else {
            System.out.println("rescriu lista de elevi");
            for (int i = 0; i < listaElevi.size(); i++) {
                Elev elev = listaElevi.get(i);
                if (elev.getId() == e.getId()) {
                    index = i;
                    break;
                }
            }
            
            listaElevi.set(index, e);
            saveListaElevi();
            
        }
        return index;
    }

    private void loadElevi() throws IOException {
        File fe = new File(data, Constante.FISIER_ELEVI);
        BufferedReader buff = new BufferedReader(new FileReader(fe));
        String linie = null;
        while ((linie = buff.readLine()) != null) {
            Elev e = Elev.getElevFromString(linie);
            listaElevi.add(e);
        }
        if (!listaElevi.isEmpty()) {
            ID_ELEV = listaElevi.get(listaElevi.size() - 1).getId();
        }
    }

    public List<Elev> getListaElevi() {
        return listaElevi;
    }

    public boolean elevExistsByCnp(String cnp) {
        for (int i = 0; i < listaElevi.size(); i++) {
            if (cnp.equals(listaElevi.get(i).getCNP())) {
                return true;
            }
        }
        return false;
    }

    public void stergeElev(int index) {
        listaElevi.remove(index);
        saveListaElevi();
    }

    public void saveListaElevi() {
        try {
            PrintWriter pw = null;
            pw = new PrintWriter(new FileWriter(new File(data, Constante.FISIER_ELEVI)));
            for (int i = 0; i < listaElevi.size(); i++) {
                Elev e = listaElevi.get(i);
                pw.println(e.getDescriereTip());

            }
            pw.flush();
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(EleviManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
