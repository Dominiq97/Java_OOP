
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
public class ConferenceProceeding extends Publication{
    
    private String volumeName;
    private boolean indexed;

    public ConferenceProceeding(String volumeName, boolean indexed, String name, Calendar apparition) {
        super(name, apparition);
        this.volumeName = volumeName;
        this.indexed = indexed;
    }

    public ConferenceProceeding() {
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public void setIndexed(boolean indexed) {
        this.indexed = indexed;
    }
    
    

    public String getVolumeName() {
        return volumeName;
    }

    public boolean isIndexed() {
        return indexed;
    }

    @Override
    public double computeScore() {
        if (isIndexed()){
        return 0.25/getNumbersOfAuthors();
        }else{
            return 0.2/getNumbersOfAuthors();
        }
    }
    
    
    
}
