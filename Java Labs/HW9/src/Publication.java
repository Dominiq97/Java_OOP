
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
public abstract class Publication {
    
    private String name;
    private Calendar apparition;
    private int numbersOfAuthors;

    public Publication(String name, Calendar apparition) {
        this.name = name;
        this.apparition = apparition;
    }

    public Publication() {
    }

    public int getNumbersOfAuthors() {
        return numbersOfAuthors;
    }

    public void setNumbersOfAuthors(int numbersOfAuthors) {
        this.numbersOfAuthors = numbersOfAuthors;
    }
    
    

    public Calendar getApparition() {
        return apparition;
    }

    public String getName() {
        return name;
    }

    public void setApparition(Calendar apparition) {
        this.apparition = apparition;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract double computeScore();
    
}
