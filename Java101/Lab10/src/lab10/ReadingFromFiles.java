/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Dominic
 */
public class ReadingFromFiles 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        FileReader fr = new FileReader("output.txt");
        BufferedReader br = new BufferedReader(fr);
        //String s = br.readLine();
        //System.out.println(s);
        String s;
        while((s=br.readLine())!=null)
            System.out.println(s);
        br.close();
    }
    
}
