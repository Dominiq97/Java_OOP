/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwwords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author Dominic
 */
public class Ex2 {

    private static FileWriter fw;
    private static PrintWriter pw;
    private static String[] words = new String[850];

    public static void readFromFile(String filename) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
    //    int noWords = 850;
        String s;
        int n = 0;
        while((s=br.readLine())!=null){
            words[n++]=s.trim();
        }
        br.close();
        
    }

    public static void writeToFile(String s) throws IOException {

        pw.print(s);
        pw.flush();
    }

    public static void main(String[] args) throws IOException {

        fw = new FileWriter(new File("Hamlet.txt"));
        pw = new PrintWriter(fw);

        readFromFile("basicWords.txt");

        Random rand = new Random();
        int r;
       
        //pw.println("            ----- Hamlet -----");
        //pw.println("                  Bob, the monkey");
        for (int i = 0; i < 1000; i++) {
            r = rand.nextInt(850);
            writeToFile(words[r] + "\n");
        }
    }
}
