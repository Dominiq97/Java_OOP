
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
public class Main {
    
    public static void main(String[] args) {
        
        University u = new University();
        u.setName("Universitatea Politehnica");
        u.setLocation("Bucarest");
        
        Author a1 = new Author();
        a1.setName("Nea Ion");
        Author a2 = new Author();
        a2.setName("Tanti Jana");
        
        Journal j1 = new Journal();
        j1.setImpactFactor(2.1);
        Journal j2 = new Journal();
        j2.setImpactFactor(3);
        Journal j3 = new Journal();
        j3.setImpactFactor(4.1);
        Journal j4 = new Journal();
        j4.setImpactFactor(2.9);
        
        ConferenceProceeding c1 = new ConferenceProceeding();
        c1.setVolumeName("Ingineria toaletelor");
        ConferenceProceeding c2 = new ConferenceProceeding();
        c1.setVolumeName("Cum sa scapi de nevasta");
        ConferenceProceeding c3 = new ConferenceProceeding();
        c1.setVolumeName("Preferatu la muste");
        ConferenceProceeding c4 = new ConferenceProceeding();
        c1.setVolumeName("Eu cand vreau sa mananc, mananc");
        
        
        a1.addPublication(j1);
        j1.setNumbersOfAuthors(1);
        a1.addPublication(j2);
        j2.setNumbersOfAuthors(1);
        a1.addPublication(c1);
        c1.setNumbersOfAuthors(1);
        a1.addPublication(c4);
        c4.setNumbersOfAuthors(1);
        a2.addPublication(j3);
        j3.setNumbersOfAuthors(1);
        a2.addPublication(j4);
        j4.setNumbersOfAuthors(1);
        a2.addPublication(c2);
        c2.setNumbersOfAuthors(1);
        a2.addPublication(c3);
        c3.setNumbersOfAuthors(1);
        
        u.addAuthor(a2);
        u.addAuthor(a1);
        
        
        System.out.println("The score of the "+u.getName()+" is "+u.computeScore()/1000);
        
        
        
        
        
        
        
        
        
    }
    
}
