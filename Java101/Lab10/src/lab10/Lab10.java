/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Dominic
 */
public class Lab10
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        //to write: FileWriter and a PrintWriter
        FileWriter fw = new FileWriter("output.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println("First line");
        pw.println("Second line");
        //from buffer to file
        pw.flush();
        //we should close open resources
        pw.close();
    }
    
}
