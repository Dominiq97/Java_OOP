/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import obiecte.Absenta;
import obiecte.Constante;

/**
 *
 * @author Dominic
 */
public class AbsenteTableModel extends AbstractTableModel{

    private List<Absenta> listaAbsente = new ArrayList<Absenta>();
    private String[] tableColumns = new String[]{"Profesor","Elev","Materie","Motivata","Data/ora"};
    
    public AbsenteTableModel() {
    }

    public void setListaAbsente(List<Absenta> listaAbsente) {
        this.listaAbsente = listaAbsente;
    }
    
    
    

    @Override
    public int getRowCount() {
        return listaAbsente.size();
    }

    @Override
    public int getColumnCount() {
        return tableColumns.length;
    }

    @Override
    public String getColumnName(int column) {
        return tableColumns[column];
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Absenta a = listaAbsente.get(rowIndex);
        switch(columnIndex){
            default:
                return null;
            case 0:
                return a.getProfesor().getNumeComplet();
            case 1:
                return a.getElev().getNumeComplet();
            case 2:
                return a.getMaterie().getNumeMaterie();
            case 3:
                return a.isMotivata()?"Da":"Nu";
            case 4:
                return Constante.DATA_ORA_FORMAT.format(a.getData());
        }
    }
    
    public Absenta getAbsenta(int rowIndex){
        return listaAbsente.get(rowIndex);
    }
    
    public void adaugaAbsenta(Absenta a){
        listaAbsente.add(a);
        fireTableDataChanged();
    }
    
    
    public void removeAbsenta(Absenta a){
        listaAbsente.remove(a);
        fireTableDataChanged();
    }
    
    
}
