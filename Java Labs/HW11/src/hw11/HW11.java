/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Dominic
 */
public class HW11 {
    
    private static DayData[] dates = new DayData[0];

    public static void readFromFile(String filename) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
      //  int noDays = 19031;
      
      // int n = 0;
        String s = br.readLine();
        int c = Integer.parseInt(s);
        
        System.out.println(c);
        
        br.close();
  //      for (int i = 0; i < noWords; i++) {
   //         System.out.println(i + 1 + ". " + words[i]);
   //     }
    }
    
    
    
    
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        readFromFile("‪‪C:\\Users\\Dominic\\Desktop\\weather.txt");
    }
    
}
