/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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
import obiecte.ProfesorMaterii;

/**
 *
 * @author Dominic
 */
public class ProfesorMateriiManager {
    
     
    private List<ProfesorMaterii> listaObiecte = new ArrayList<ProfesorMaterii>();
    public static int ID_PROFESORMATERIE = 0;
    private File data = new File(Constante.FOLDER_DATA);
    private MateriiManager mm=new MateriiManager();
    
    
    public ProfesorMateriiManager(){
        loadData();
    }
    
    public void saveObject(ProfesorMaterii pm){
        PrintWriter pw = null;
        try {
            if(pm.getId()<=0){
                ID_PROFESORMATERIE++;
                pm.setId(ID_PROFESORMATERIE);
            }   
            pw = new PrintWriter(new FileWriter(new File(data, Constante.FISIER_PROFESORMATERII), true));
            pw.println(pm.getDescrierePM());
            pw.flush();
            pw.close();
            listaObiecte.add(pm);
        } catch (IOException ex) {
            Logger.getLogger(MateriiManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
        
        
        
    }
    
    private void loadData() {
        try {
            File f = new File(data, Constante.FISIER_PROFESORMATERII);
            if(!f.exists()){
                f.createNewFile();
            }
            BufferedReader br = new BufferedReader(new FileReader(f));
            String linie = null;
            while((linie = br.readLine()) != null){
                ProfesorMaterii pm = ProfesorMaterii.getObiectFromString(linie);
                listaObiecte.add(pm);
            }
            if(!listaObiecte.isEmpty()){
                ID_PROFESORMATERIE = listaObiecte.get(listaObiecte.size() - 1).getId();
            }
        } catch (IOException ex) {
            Logger.getLogger(MateriiManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ProfesorMaterii> getListaObiecte()throws FileNotFoundException, IOException{
        return listaObiecte;
    }
    
    public int[] getListaMateriiByProfesorID(int idProfesor){
        if(listaObiecte.isEmpty()){
            loadData();
        }
        int countedIndexes=0;
        for(ProfesorMaterii pm:listaObiecte){
            if(pm.getProfesorId()==idProfesor){
               countedIndexes++;
            }
        }
        int indices[]=new int[countedIndexes];
        int i=0;
        for(ProfesorMaterii pm:listaObiecte){
            if(pm.getProfesorId()==idProfesor){
               indices[i]=mm.getMaterieIndexById(pm.getMaterieId());
               i++;
            }
        }
        return indices;
    }
    
    
     public void removeObiect(ProfesorMaterii pm){
        listaObiecte.remove(pm);
    }

    public void saveListaObiecte(){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(new File(data, Constante.FISIER_PROFESORMATERII)));
            
            for(int i = 0; i<listaObiecte.size();i++){
            ProfesorMaterii mat = listaObiecte.get(i);
            pw.println(mat.getDescrierePM());
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
        listaObiecte.remove(index);
    }
    
    
    
}
