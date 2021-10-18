/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Dominic
 */
public class Test {

    private static FileWriter fw;
    private static PrintWriter pw;
    private static Video[] videos = new Video[10];
    private static int size = 0;

    public static void readFromFile(String filename, String casefile) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String s;
        int j;
        while ((s = br.readLine()) != null) {
            //  System.out.println(s);
            switch (casefile) {
                case "m":
                    videos[size++] = new Movie(s);
                    break;
                case "mv":
                    videos[size++] = new MusicVideo(s);
                    break;
                case "v":
                    videos[size++] = new Video(s);
                    break;
            }
        }
        br.close();
    }

    public static void writeToFile(Video obj) throws IOException {
     //   FileWriter fw = new FileWriter("src\\lab11\\storage.txt");
     //   PrintWriter pw = new PrintWriter(fw);
        pw.println(obj.show());

    }

    public static void main(String[] args) throws IOException {

        fw = new FileWriter("src\\lab11\\storage.txt");
        pw = new PrintWriter(fw);

        readFromFile("src\\lab11\\video.txt", "v");

        readFromFile("src\\lab11\\musicVideo.txt", "mv");
        readFromFile("src\\lab11\\movie.txt", "m");
        
        videos[3].setTitle("Karamazov");
        videos[7].setTitle("Paleontologu");
        videos[8].setAvailable(false);
        ((MusicVideo) videos[5]).setArtist("satra benz");
        ((MusicVideo) videos[3]).setArtist("MACANACHE");
        ((MusicVideo) videos[3]).setCathegory("Horror");
        ((Movie) videos[6]).setRating(7);
        ((Movie) videos[7]).setRating(9);
        ((Movie) videos[6]).setLength(120);
        ((Movie) videos[6]).setTitle("Marean");
        
        
        
        for (int i = 0; i < size; i++) {
            writeToFile(videos[i]);
        }
        
        
        //   for(int i = 0; i<size; i++){
        //       System.out.println(videos[i].getTitle());
        //   }

        pw.flush();
        pw.close();

    }

}
