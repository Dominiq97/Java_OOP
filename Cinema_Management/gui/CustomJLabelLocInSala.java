/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaCinema.gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Dominic
 */
public class CustomJLabelLocInSala extends JLabel implements MouseListener {

    private int configSala[][];
    private int i;
    private int j;
    private Color defaultColor = Color.BLUE;
    private JLabel detalii;

    public CustomJLabelLocInSala(int[][] configSala, int i, int j) {
        this.configSala = configSala;
        this.i = i;
        this.j = j;
    //    this.detalii = detalii;
        this.addMouseListener(this);
        setBackground(defaultColor);
       // detalii.setText("Locuri configurate " + getNumarLocuriDisponibile());
    }
    
   
    public int getNumarLocuriDisponibile() {
        int nrDisponibile = 0;
        for (int ii = 0; ii < configSala.length; ii++) {
            for (int jj = 0; jj < configSala.length; jj++) {
                if (configSala[ii][jj] == 0) {
                    nrDisponibile++;
                    System.out.print(nrDisponibile);
                }
            }
        }
        return nrDisponibile;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            setBackground(Color.WHITE);
            configSala[i][j] = 0;
        }
        if (SwingUtilities.isRightMouseButton(e)) {
            configSala[i][j] = -1;
            setBackground(defaultColor);
          
            
        }
//        detalii.setText("Locuri configurate " + getNumarLocuriDisponibile());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (configSala[i][j] == -1) {
            this.defaultColor = getBackground();

            setBackground(Color.ORANGE);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (configSala[i][j] == -1) {
            setBackground(defaultColor);
        }
    }

}
