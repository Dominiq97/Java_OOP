/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwwords;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominic
 */
public class Testttt {
    private ArrayList<String> getWordsFromFile(String textFile){
        ArrayList<String> words=new ArrayList<>();
        try {
            try (Scanner s = new Scanner(new File(textFile))) {
                while(s.hasNextLine()){
                    words.add(s.nextLine().trim());
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Testttt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return words;
    }
    
    private void writeWordsToFile(String textFile,ArrayList<String> words,int numberOfWords){
        try {
            int i=0;
            int poz;
            PrintWriter out=new PrintWriter(new File(textFile));
            while(i<numberOfWords){
                poz=(int)(Math.random() * (words.size()));
                out.print(words.get(poz));
                out.print(" ");
                i++;
                if(i%10==0)
                    out.println();
                
            }
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Testttt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args){
        Testttt t=new Testttt();
        String readFrom="basicWords.txt";
        String writeTo="Hamlet.txt";
        ArrayList<String> words=t.getWordsFromFile(readFrom);
        t.writeWordsToFile(writeTo, words, 1000);
    }
}
