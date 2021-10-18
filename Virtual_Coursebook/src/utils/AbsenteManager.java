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
import obiecte.Absenta;
import obiecte.Constante;
import obiecte.Materie;

/**
 *
 * @author Dominic
 */
public class AbsenteManager {
    
     public static int ID_ABSENTA = 0;
    private File data = new File(Constante.FOLDER_DATA);
    private List<Absenta> listaAbsente = new ArrayList<Absenta>();
    
    
    public AbsenteManager(){
        loadAbsente();
    }
    
    public Absenta getAbsentaById(int id){
        if(listaAbsente.isEmpty()){
            loadAbsente();
        }
        int index=listaAbsente.indexOf(new Materie(id, null));
        if(index!=-1){
            return listaAbsente.get(index);
        }
        return null;
    }
    
    public int getMaterieIndexById(int idMaterie){
        return listaAbsente.indexOf(new Materie(idMaterie, null));
    }
    
    public void saveAbsenta(Absenta a){
        PrintWriter pw = null;
        try {
            if(a.getId()<=0){
                ID_ABSENTA++;
                a.setId(ID_ABSENTA);
            }   
            pw = new PrintWriter(new FileWriter(new File(data, Constante.FISIER_ABSENTE), true));
            pw.println(a.linieFisier());
            pw.flush();
            pw.close();
            listaAbsente.add(a);
        } catch (IOException ex) {
            Logger.getLogger(MateriiManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
        
        
        
    }
    
    private void loadAbsente() {
        try {
            File f = new File(data, Constante.FISIER_ABSENTE);
            BufferedReader br = new BufferedReader(new FileReader(f));
            String linie = null;
            while((linie = br.readLine()) != null){
                Absenta a = Absenta.getAbsentaFromString(linie);
                listaAbsente.add(a);
            }
            if(!listaAbsente.isEmpty()){
                ID_ABSENTA = listaAbsente.get(listaAbsente.size() - 1).getId();
            }
        } catch (IOException ex) {
            Logger.getLogger(MateriiManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Absenta> getListaAbsente(){
        return listaAbsente;
    }
    
     public void removeAbsenta(Absenta a){
        listaAbsente.remove(a);
        saveListaAbsente();
    }

    public void saveListaAbsente(){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(new File(data, Constante.FISIER_ABSENTE)));
            
            for(int i = 0; i<listaAbsente.size();i++){
            Absenta abs = listaAbsente.get(i);
            pw.println(abs.linieFisier());
            }
            pw.flush();
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(MateriiManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
        
    }

    public void removeAbsenta(int index){
        listaAbsente.remove(index);
        saveListaAbsente();
    }
    
    
}
