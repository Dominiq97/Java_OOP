
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominic
 */
public class Journal extends Publication{
    
    private String journalName;
    private double impactFactor;

    public Journal(String journalName, double impactFactor, String name, Calendar apparition) {
        super(name, apparition);
        this.journalName = journalName;
        this.impactFactor = impactFactor;
    }

    public Journal() {
    }

    
    
    

    public double getImpactFactor() {
        return impactFactor;
    }

    public String getJournalName() {
        return journalName;
    }
    
    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public void setImpactFactor(double impactFactor) {
        this.impactFactor = impactFactor;
    }

    public double computeScore(){
        return impactFactor*0.5/getNumbersOfAuthors();
    }
    
    
    
}
