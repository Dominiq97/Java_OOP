/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dominic
 */
public class PanelulMeu extends JPanel implements KeyListener {

    public static int PATRAT_SIZE = 20;
    private int xLocation;
    private int yLocation;
    public boolean distrus;
    public static final int VITEZA_MICA = 1000;
    public static final int VITEZA_MICA2 = 750;
    public static final int VITEZA_MEDIE = 500;
    public static final int VITEZA_MEDIE_MARE = 250;
    public static final int VITEZA_MARE = 150;
    public static final int VITEZA_FMARE = 50;
    private int viteza = VITEZA_MICA;
    public static final int DIRECTIE_UP = 1;
    public static final int DIRECTIE_DOWN = 2;
    public static final int DIRECTIE_LEFT = 3;
    public static final int DIRECTIE_RIGHT = 4;
    private int maxX;
    private final boolean apasaG = true;
    private int maxY;
    private int directie = DIRECTIE_RIGHT;
    private PanelulMeu catchMe;
    private int[][] tabla = new int[18][25];
    private int nrAtins = 0;
    private int nrNivelViteza = 5;
    private ArrayList<PanelulMeu> listaCorp = new ArrayList<PanelulMeu>();
    private JPanel scena;
    private int nrPuncte = 0;
    public int nrVieti = 3;

    private int lastDirectie;

    public PanelulMeu() {
        setBackground(Color.blue);
        addKeyListener(this);
        setFocusable(true);
        setOpaque(true);
        setSize(PATRAT_SIZE, PATRAT_SIZE);

        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    public int getNrVieti() {
        return nrVieti;
    }

    public void setLastDirectie() {
        this.lastDirectie = directie;
    }

    public void distrugeCorp() {
        for (int i = 0; i < listaCorp.size(); i++) {
            scena.remove(listaCorp.get(i));
        }
        listaCorp.clear();

    }

    public void setScena(JPanel scena) {
        this.scena = scena;
    }

    private int[] pozitiePatrat() {
        int[] pozitie = new int[2];
        pozitie[0] = xLocation / PATRAT_SIZE;
        pozitie[1] = yLocation / PATRAT_SIZE;
        return pozitie;
    }

    public int getxLocation() {
        return xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    @Override
    public void setLocation(int x, int y) {
        this.xLocation = x;
        this.yLocation = y;
        super.setLocation(x, y);
    }

    public int getViteza() {
        return viteza;
    }

    public boolean isDistrus() {
        return distrus;
    }

    public void setCatchMe(PanelulMeu catchMe) {
        this.catchMe = catchMe;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }

    public void setViteza(int viteza) {
        this.viteza = viteza;
    }

    public void adaugarePatratel(PanelulMeu pn) {
        listaCorp.add(pn);
    }

    public void scoatePatratel(PanelulMeu pn) {
        listaCorp.remove(pn);
    }

    public void deseneaza() {
        PanelulMeu panelAnterior = this;
        if (!listaCorp.isEmpty()) {
            for (int i = 0; i < listaCorp.size(); i++) {
                PanelulMeu panelDinCorp = listaCorp.get(i);
                switch (panelAnterior.directie) {
                    case DIRECTIE_RIGHT:
                        panelDinCorp.setLocation(panelAnterior.getxLocation() - PATRAT_SIZE, panelAnterior.getyLocation());
                        break;
                    case DIRECTIE_UP:
                        panelDinCorp.setLocation(panelAnterior.getxLocation(), panelAnterior.getyLocation() - PATRAT_SIZE);
                        break;
                    case DIRECTIE_DOWN:
                        panelDinCorp.setLocation(panelAnterior.getxLocation(), panelAnterior.getyLocation() + PATRAT_SIZE);
                        break;
                    case DIRECTIE_LEFT:
                        panelDinCorp.setLocation(panelAnterior.getxLocation() + PATRAT_SIZE, panelAnterior.getyLocation());
                        break;
                }
                panelAnterior = panelDinCorp;
            }
        }
    }

    public String afisarePunctaj() {
        return "\nPunctaj :  " + nrPuncte;
    }

    public void explodeaza() {
        setLocation(20, 300);
        if (nrVieti > 0) {
            JOptionPane.showMessageDialog(scena, "Ne pare rau.. ai pierdut!" + afisarePunctaj(), "Asta-i viata!", JOptionPane.WARNING_MESSAGE);

            distrus = false;
            directie = DIRECTIE_RIGHT;
        } else {
            distrugeCorp();
            JOptionPane.showMessageDialog(scena, "Joc terminat " + afisarePunctaj(), "Game Over fraiere", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cresteNumar() {
        if (neAmCiocnit()) {
            nrPuncte = nrPuncte + 10;
        }
    }

    public void reseteazaNumarVieti() {
        this.nrVieti = 3;
    }

    public void reseteazaNumarPuncte() {
        this.nrPuncte = 0;
    }

    public int getNrPuncte() {
        return nrPuncte;
    }

    public void movePatrat() {
        if (neAmCiocnit()) {
            cresteNumar();
            final PanelulMeu patratDeAdaugatInCorp = catchMe;
            patratDeAdaugatInCorp.setBackground(Color.red);
            adaugarePatratel(patratDeAdaugatInCorp);
            catchMe = new PanelulMeu();
            catchMe.setBackground(Color.BLACK);
            scena.add(catchMe);
            //deseneaza();
            int i = (int) (Math.random() * (19 - 1) + 0);
            int j = (int) (Math.random() * (26 - 1) + 0);

            int irosu = pozitiePatrat()[0];
            int jrosu = pozitiePatrat()[1];
            if (irosu == i && jrosu == j) {
                if (i == 0) {
                    i = i + 2;
                } else if (i == 17) {
                    i = i - 2;
                }
            }

            catchMe.setLocation(j * PATRAT_SIZE, i * PATRAT_SIZE);
            this.setCatchMe(catchMe);
            vitezaCresc();

        }

        if (distrus == true) {
            return;
        }
        switch (directie) {
            case DIRECTIE_UP:
                if (yLocation == 0) {
                    distrus = true;
                }

                yLocation = yLocation - PATRAT_SIZE;
                break;
            case DIRECTIE_DOWN:
                if (yLocation == maxY) {
                    distrus = true;
                }
                yLocation = yLocation + PATRAT_SIZE;
                break;
            case DIRECTIE_LEFT:
                if (xLocation == 0) {
                    distrus = true;
                }
                xLocation = xLocation - PATRAT_SIZE;
                break;
            case DIRECTIE_RIGHT:
                if (xLocation == maxX) {
                    distrus = true;
                }
                xLocation = xLocation + PATRAT_SIZE;

                break;
        }
        setLocation(xLocation, yLocation);
        if (distrus) {
            nrVieti--;
            explodeaza();

            //System.out.println("Cooredonatele tabelei : " + xLocation + " si " + yLocation);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_G) {
            if (apasaG) {

                int i = (int) (Math.random() * (19 - 1) + 0);
                int j = (int) (Math.random() * (26 - 1) + 0);

                int irosu = pozitiePatrat()[0];
                int jrosu = pozitiePatrat()[1];
                if (irosu == i && jrosu == j) {
                    if (i == 0) {
                        i = i + 2;
                    } else if (i == 17) {
                        i = i - 2;
                    }
                }
                catchMe.setLocation(j * PATRAT_SIZE, i * PATRAT_SIZE);

            }
        }

        if (e.getKeyCode() == KeyEvent.VK_V) {
            viteza = viteza - 50;
            if (viteza < 50) {
                viteza = 50;
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            directie = DIRECTIE_RIGHT;
            if (xLocation == maxX) {
                return;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            directie = DIRECTIE_LEFT;
            if (xLocation == 0 || e.getKeyCode() == KeyEvent.VK_RIGHT) {
                return;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            directie = DIRECTIE_DOWN;
            if (yLocation == maxY || e.getKeyCode() == KeyEvent.VK_UP) {
                return;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            directie = DIRECTIE_UP;
            if (yLocation == 0 || e.getKeyCode() == KeyEvent.VK_DOWN) {
                return;
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int vitezaCresc() {
        if (neAmCiocnit() == true) {
            nrAtins++;

            if (nrAtins == 4) {
                viteza = VITEZA_MICA2;
            }
            if (nrAtins == 8) {
                viteza = VITEZA_MEDIE;
            }
            if (nrAtins == 10) {
                viteza = VITEZA_MEDIE_MARE;
            }
            if (nrAtins == 15) {
                viteza = VITEZA_MARE;
            }
            if (nrAtins == 25) {
                viteza = VITEZA_FMARE;
            }

        }
        return nrAtins;

    }

    private boolean neAmCiocnit() {
        if (catchMe != null) {

            return this.getBounds().intersects(catchMe.getBounds());

        } else {
            throw new RuntimeException("Seteaza bah cu cine vrei sa te ciocnesti!");
        }

    }

    private int getVietiRamase() {
        if (distrus == false) {
            return nrVieti;
        } else {
            return nrVieti = nrVieti - 1;
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void restartJoc() {

        reseteazaNumarPuncte();
        reseteazaNumarVieti();
        setLocation(20, 300);
        distrus = false;
        catchMe.setLocation(100, 100);
            //distrugeCorp();

        requestFocusInWindow();
        directie = DIRECTIE_RIGHT;
        viteza = VITEZA_MARE;

    }

}
