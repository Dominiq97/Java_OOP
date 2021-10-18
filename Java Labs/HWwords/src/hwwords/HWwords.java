/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwwords;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author Dominic
 */
public class HWwords {

    private static PrintWriter pw;
    private static FileWriter fw;
    private static String[] words = new String[255];
    private static int noWords = 0;

    /**
     * @param args the command line arguments
     */
    public static void writeToFile(String str, int nr) throws IOException {

        pw.print(str);
        pw.print(" - ");
        pw.println(nr);

    }

    public static void readFromFile(String filename) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        int n = 0;
        String s;
        while ((s = br.readLine()) != null) {
            String arr[] = s.split(" ");
            Arrays.sort(arr);

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            int c = arr.length;
            int[] nr = new int[c];
            // System.out.println(arr.length);
            for (int i = 0; i < c; i++) {
                nr[i] = 1;
            }

            for (int i = 0; i < c; i++) {
                System.out.println(nr[i]);
            }
            
            int i = 0;
            while(i<c) {
                int j = i+1;
                if (arr[i].equalsIgnoreCase(arr[j]) == true) {
                    while (j < c) {
                        arr[j-1]=arr[j];
                        j++;
                    }
                    j--;
                    c--;
                }
                i++;
            }
            
            System.out.println(" ");
            
            for (int k = 0; k < c; k++) {
                writeToFile(arr[k],nr[k]);
            }

        }
        br.close();
    }

    //public static void main(String[] args) throws IOException {
    public static void main(String[] args) throws IOException {

        //       readFromFile("C:\\Users\\Dominic\\Desktop\\PL\\HWwords\\src\\hwwords\\words.txt");
        //    FileReader fileReader = new FileReader("C:\\Users\\Dominic\\Desktop\\PL\\HWwords\\src\\hwwords\\words.txt");
        /*        String s = "";
 
            int i;
            
            BufferedReader br = new BufferedReader(fileReader);
 
            while((i =  fileReader.read())!=-1){
                char ch = (char)i;
            s = s + ch; 
            }
            s += " ";
            
        System.out.println(s);
        while ((s = br.readLine()) != null) {
         */
        readFromFile("C:\\Users\\Dominic\\Desktop\\PL\\HWwords\\src\\hwwords\\words.txt");
    }

}
