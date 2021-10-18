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

/**
 *
 * @author Dominic
 */
public class MateriiManager {
    
    private List<Materie> listaMaterii = new ArrayList<Materie>();
    public static int ID_MATERIE = 0;
    private File data = new File(Constante.FOLDER_DATA);
    
    
    
    public MateriiManager(){
        loadMaterii();
    }
    
    public Materie getMaterieById(int id){
        if(listaMaterii.isEmpty()){
            loadMaterii();
        }
        int index=listaMaterii.indexOf(new Materie(id, null));
        if(index!=-1){
            return listaMaterii.get(index);
        }
        return null;
    }
    
    public int getMaterieIndexById(int idMaterie){
        return listaMaterii.indexOf(new Materie(idMaterie, null));
    }
    
    public void saveMaterie(Materie m){
        PrintWriter pw = null;
        try {
            if(m.getId()<=0){
                ID_MATERIE++;
                m.setId(ID_MATERIE);
            }   
            pw = new PrintWriter(new FileWriter(new File(data, Constante.FISIER_MATERIE), true));
            pw.println(m.getDescriereMaterie());
            pw.flush();
            pw.close();
            listaMaterii.add(m);
        } catch (IOException ex) {
            Logger.getLogger(MateriiManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
        
        
        
    }
    
    private void loadMaterii() {
        try {
            File f = new File(data, Constante.FISIER_MATERIE);
            BufferedReader br = new BufferedReader(new FileReader(f));
            String linie = null;
            while((linie = br.readLine()) != null){
                Materie m = Materie.getMaterieFromString(linie);
                listaMaterii.add(m);
            }
            if(!listaMaterii.isEmpty()){
                ID_MATERIE = listaMaterii.get(listaMaterii.size() - 1).getId();
            }
        } catch (IOException ex) {
            Logger.getLogger(MateriiManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Materie> getListaMaterii(){
        return listaMaterii;
    }
    
    public boolean MaterieExistsByName(String numeMaterie){
        for(int i = 0; i < listaMaterii.size(); i++){
            if(numeMaterie.equalsIgnoreCase(listaMaterii.get(i).getNumeMaterie())){
                return true;
            }
        }
        return false;
    }
    
     public void removeMaterie(Materie mat){
        listaMaterii.remove(mat);
    }

    public void saveListaMaterii(){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(new File(data, Constante.FISIER_MATERIE)));
            
            for(int i = 0; i<listaMaterii.size();i++){
            Materie mat = listaMaterii.get(i);
            pw.println(mat.getDescriereMaterie());
            }
            pw.flush();
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(MateriiManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
        
    }

    public void removeMaterie(int index){
        listaMaterii.remove(index);
    }
    
    
    
}
