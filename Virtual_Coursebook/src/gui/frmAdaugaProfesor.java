/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import beans.Profesori;
import dao.ProfesoriDAO;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import obiecte.Materie;
import obiecte.Profesor;
import obiecte.ProfesorMaterii;
import utils.MateriiManager;
import utils.ProfManager;
import utils.ProfesorMateriiManager;

/**
 *
 * @author Dominic
 */
public class frmAdaugaProfesor extends javax.swing.JDialog {

    
    private Profesori profesorSelectat;
    private DefaultListModel model;
    private DefaultListModel modelListaMaterii;
    private ProfesoriDAO pm = new ProfesoriDAO();
    private ProfesorMateriiManager profesorMateriiManager=new ProfesorMateriiManager();
    private MateriiManager materiiManager=new MateriiManager();
    /**
     * Creates new form frmAdaugaProfesor
     */
    public frmAdaugaProfesor(JDialog parent, boolean modal, Profesori p, ProfesoriDAO prof) {
        super(parent, modal);
        initComponents();
        this.profesorSelectat = p;
        modelListaMaterii=new DefaultListModel();
        List<Materie> listaObiecte=materiiManager.getListaMaterii();
        for(Materie m:listaObiecte){
            modelListaMaterii.addElement(m);
        }
        listaMaterii.setModel(modelListaMaterii);
        if (profesorSelectat != null) {
            initalizareControaleGraficeCuDateleProfesorului(profesorSelectat);
        }
        
        setLocationRelativeTo(parent);
    }

    public void setDf(DefaultListModel df) {
        this.model = df;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumeProfesor = new javax.swing.JTextField();
        txtPrenumeProfesor = new javax.swing.JTextField();
        txtCNP = new javax.swing.JTextField();
        btnAdaugaProfesor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMaterii = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adauga profesori");

        jLabel1.setText("Nume :");

        jLabel2.setText("Prenume :");

        jLabel3.setText("CNP :");

        jLabel4.setText("Materie/Materii :");

        btnAdaugaProfesor.setText("Adauga profesor");
        btnAdaugaProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdaugaProfesorActionPerformed(evt);
            }
        });

        listaMaterii.setToolTipText("Pentru selectie multipla va rugam tineti CTRL apasat");
        jScrollPane1.setViewportView(listaMaterii);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrenumeProfesor)
                            .addComponent(txtNumeProfesor)
                            .addComponent(txtCNP)
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 208, Short.MAX_VALUE)
                        .addComponent(btnAdaugaProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrenumeProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdaugaProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdaugaProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdaugaProfesorActionPerformed
        // TODO add your handling code here:

        if (!valid()) {
            return;
        }
        String nume = txtNumeProfesor.getText().trim().toUpperCase();
        String prenume = txtPrenumeProfesor.getText().trim().toUpperCase();
        String cnp = txtCNP.getText();

        String des = "Profesorul a fost salvat";
        JOptionPane.showMessageDialog(this, des, "Salvare profesor", JOptionPane.INFORMATION_MESSAGE);
      
        Profesori p = new Profesori();
        p.setNume(nume);
        p.setPrenume(prenume);
        p.setCnp(cnp);
                
        if(profesorSelectat!=null){
            p.setId(profesorSelectat.getId());
        }
        //int index = pm.saveProfesor(p);
        List obiectDinListaDeMaterii = listaMaterii.getSelectedValuesList();
        for(Object om:obiectDinListaDeMaterii){
            Materie m = (Materie) om;
            ProfesorMaterii pm=new ProfesorMaterii(p.getId(), m.getId());
            profesorMateriiManager.saveObject(pm);
        }
        
        pm.saveProfesor(p);
        dispose();
        /*if(index!=-1){
            model.set(index, p);
        }else{
            model.addElement(p);
        }*/
        
        
        
    }//GEN-LAST:event_btnAdaugaProfesorActionPerformed

    private boolean valid() {
        String nume = txtNumeProfesor.getText().trim();
        String prenume = txtPrenumeProfesor.getText().trim();

        if (nume.length() < 3) {
            JOptionPane.showMessageDialog(this, "Numele trebuie sa aiba minim 3 litere!", "Eroare nume!", JOptionPane.ERROR_MESSAGE);
            txtNumeProfesor.requestFocusInWindow();
            txtNumeProfesor.selectAll();
            return false;
        }
        if (prenume.length() < 3) {
            JOptionPane.showMessageDialog(this, "Prenumele trebuie sa aiba minim 3 litere!", "Eroare prenume!", JOptionPane.ERROR_MESSAGE);
            txtPrenumeProfesor.requestFocusInWindow();
            txtPrenumeProfesor.selectAll();
            return false;
        }
        String cnp = txtCNP.getText();
        if (!isCnpValid()) {
            JOptionPane.showMessageDialog(this, "Cnp-ul nu este valid!", "Eroare Cnp!", JOptionPane.ERROR_MESSAGE);
            txtCNP.requestFocusInWindow();
            txtCNP.selectAll();
            return false;
        }

        if (listaMaterii.getSelectedIndices().length == 0) {
            JOptionPane.showMessageDialog(this, "Selectati va rog macar o materie!", "Eroare materie predata", JOptionPane.ERROR_MESSAGE);
            listaMaterii.requestFocusInWindow();
            return false;
        }
        return true;
    }

    private boolean isCnpValid() {
        String cnp = txtCNP.getText().trim();
        if (cnp.length() != 13) {
            System.out.println("lungime incorecta");
            return false;
        }
        try {
            long l = Long.parseLong(cnp);
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

        char c = cnp.charAt(0);
        System.out.println(c);
        if (c != '1' && c != '2' && c != '5' && c != '6') {
            System.out.println("Cnp invalid dupa primul nr");
            return false;
        }

        return true;

    }

    public void initalizareControaleGraficeCuDateleProfesorului(Profesori p) {
        txtNumeProfesor.setText(p.getNume().trim());
        txtPrenumeProfesor.setText(p.getPrenume().trim());
        txtCNP.setText(p.getCnp());
        btnAdaugaProfesor.setText("Salveaza date profesor");
        int selectedIndices[]=profesorMateriiManager.getListaMateriiByProfesorID(p.getId());
        listaMaterii.setSelectedIndices(selectedIndices);
        
        
    //    listaMaterii.setSelectedIndex(WIDTH);

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdaugaProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaMaterii;
    private javax.swing.JTextField txtCNP;
    private javax.swing.JTextField txtNumeProfesor;
    private javax.swing.JTextField txtPrenumeProfesor;
    // End of variables declaration//GEN-END:variables
}
