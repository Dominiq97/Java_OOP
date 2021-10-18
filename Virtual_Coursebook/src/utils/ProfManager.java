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
import obiecte.Profesor;

/**
 *
 * @author Dominic
 */
public class ProfManager {

    private List<Profesor> listaProfesori = new ArrayList<Profesor>();
    private File data = new File(Constante.FOLDER_DATA);
    private static int ID_PROFESOR = 0;

    public ProfManager() {
        loadProfesori();
    }

    public int saveProfesor(Profesor p) throws IOException {
        int index = -1;
        if (p.getId() <= 0) {
            ID_PROFESOR++;
            p.setId(ID_PROFESOR);
            listaProfesori.add(p);
            PrintWriter pw = new PrintWriter(new FileWriter(new File(data, Constante.FISIER_PROFESORI), true));
            pw.println(p.getDescriereTip());
            pw.flush();
            pw.close();
        } else {
            for (int i = 0; i < listaProfesori.size(); i++) {
                Profesor pr = listaProfesori.get(i);
                if (p.getId() == pr.getId()) {
                    index = i;
                    break;
                }
            }

            listaProfesori.set(index, p);
            saveListaProfesori();
        }

        return index;
    }

    public List<Profesor> getListaProfesori() {
        return listaProfesori;
    }

    
    
    
    public void loadProfesori() {

        try {
            File f = new File(data, Constante.FISIER_PROFESORI);
            if(!f.exists()){
                f.createNewFile();
            }
            BufferedReader buff = new BufferedReader(new FileReader(f));
            String linie = null;
            while ((linie = buff.readLine()) != null) {
                if (linie.trim().length() > 10) {
                    Profesor p = Profesor.getProfesorFromString(linie);
                    listaProfesori.add(p);
                    System.out.println(linie);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ProfManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(listaProfesori.size());
        if (!listaProfesori.isEmpty()) {
            ID_PROFESOR = listaProfesori.get(listaProfesori.size() - 1).getId();
        }
    }

    public void adaugaProfesori(Profesor p) {
        listaProfesori.add(p);
    }

    public void stergeProfesori(Profesor p) {
        listaProfesori.remove(p);
    }
    
    public void removeProfesor(int index){
        listaProfesori.remove(index);
    }
    
    

    public void saveListaProfesori() {
        try {
            PrintWriter pw = null;
            pw = new PrintWriter(new FileWriter(new File(data, Constante.FISIER_PROFESORI)));
            for (int i = 0; i < listaProfesori.size(); i++) {
                Profesor p = listaProfesori.get(i);
                pw.println(p.getDescriereTip());
            }
            pw.flush();
            pw.close();

        } catch (IOException ex) {
            Logger.getLogger(ProfManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public Profesor getProfesorById(int id){
        Profesor p=new Profesor("123");
        p.setId(id);
        int index=listaProfesori.indexOf(p);
        if(index!=-1){
            return listaProfesori.get(index);
        }
        return null;
    }

    public Profesor getProfesorByCNP(String cnp) {
        if (listaProfesori.isEmpty()) {
            // loadProfesori();
        }
        for (int i = 0; i < listaProfesori.size(); i++) {
            if (listaProfesori.get(i).getCNP().equals(cnp)) {
                return listaProfesori.get(i);
            }
        }
        return null;

    }

}
