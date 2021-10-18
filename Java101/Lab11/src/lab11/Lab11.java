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
public class Lab11 
{

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        FileReader fr = new FileReader("text.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("output.txt");
        PrintWriter pw = new PrintWriter(fw);
        int k=0;
        Publication publication[] = new Publication[10];
        Book b;
        Journal j;
        String s;
        while((s=br.readLine())!=null)
        {
            String st[] = s.split(" ");
            if(st[0].equals("B"))
            {
                b = new Book(st[1],st[2],st[3],st[4],Integer.parseInt(st[5]));
                publication[k++] = b;
            }
            else
            {
                j = new Journal(Double.parseDouble(st[1]),st[2],st[3],st[4],Integer.parseInt(st[5]));
                publication[k++] = j;
            }
        }
        for(int i=0;i<k;i++)
            pw.println(publication[i].toString());
        pw.flush();
        br.close();
    }
    
}
