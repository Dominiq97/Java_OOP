/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import obiecte.Constante;
import obiecte.Nota;

/**
 *
 * @author Dominic
 */
public class NoteTableModel extends AbstractTableModel{
    
    private List<Nota> listaNote=new ArrayList<Nota>();
    private final String[] tableColumns=new String[]{"Profesor","Elev","Materie","Nota","Data/Ora"};
    
    public NoteTableModel(){
      }

    public void setListaNote(List<Nota> listaNote) {
        this.listaNote = listaNote;
    }

    @Override
    public int getRowCount() {
        return listaNote.size();
    }

    @Override
    public int getColumnCount() {
        return tableColumns.length;
    }

    @Override
    public String getColumnName(int column) {
        return tableColumns[column];
    }
    
    public Nota getNota(int rowIndex){
        return listaNote.get(rowIndex);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Nota nota=listaNote.get(rowIndex);
        switch(columnIndex){
            case 0:
                return nota.getNumeProfesor().getNumeComplet();
            case 1:
                return nota.getNumeElev().getNumeComplet();
            case 2:
                return nota.getMaterie().getNumeMaterie();
            case 3:
                return nota.getNota();
            case 4:
                return Constante.DATA_ORA_FORMAT.format(nota.getDataOra());
            default:
                return null;
        }
    }
    
    public void adaugaNota(Nota n){
        listaNote.add(n);
        fireTableDataChanged();
    }
    
    public void removeNota(Nota n){
        listaNote.remove(n);
        fireTableDataChanged();
    }
    
}
