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
import obiecte.Materie;
import obiecte.Nota;


/**
 *
 * @author Dominic
 */
public class NoteManager {
    
    public static int ID_NOTA = 0;
    private File data = new File(Constante.FOLDER_DATA);
    private List<Nota> listaNote = new ArrayList<Nota>();
    
    
    public NoteManager(){
        loadNote();
    }
    
    public Nota getNotaById(int id){
        if(listaNote.isEmpty()){
            loadNote();
        }
        int index=listaNote.indexOf(new Materie(id, null));
        if(index!=-1){
            return listaNote.get(index);
        }
        return null;
    }
    
    public int getMaterieIndexById(int idMaterie){
        return listaNote.indexOf(new Materie(idMaterie, null));
    }
    
    public void saveNota(Nota n){
        PrintWriter pw = null;
        try {
            if(n.getId()<=0){
                ID_NOTA++;
                n.setId(ID_NOTA);
            }   
            pw = new PrintWriter(new FileWriter(new File(data, Constante.FISIER_NOTE), true));
            pw.println(n.linieFisier());
            pw.flush();
            pw.close();
            listaNote.add(n);
        } catch (IOException ex) {
            Logger.getLogger(MateriiManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
        
        
        
    }
    
    private void loadNote() {
        try {
            File f = new File(data, Constante.FISIER_NOTE);
            BufferedReader br = new BufferedReader(new FileReader(f));
            String linie = null;
            while((linie = br.readLine()) != null){
                Nota n = Nota.getNotaFromString(linie);
                listaNote.add(n);
            }
            if(!listaNote.isEmpty()){
                ID_NOTA = listaNote.get(listaNote.size() - 1).getId();
            }
        } catch (IOException ex) {
            Logger.getLogger(MateriiManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Nota> getListaNote(){
        return listaNote;
    }
    
     public void removeNota(Nota n){
        listaNote.remove(n);
        saveListaNote();
    }

    public void saveListaNote(){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(new File(data, Constante.FISIER_NOTE)));
            
            for(int i = 0; i<listaNote.size();i++){
            Nota mat = listaNote.get(i);
            pw.println(mat.linieFisier());
            }
            pw.flush();
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(MateriiManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
        
    }

    public void removeNota(int index){
        listaNote.remove(index);
    }
    
    
    
}
