/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

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
public class Words 
{
 //method
        public static boolean isVowel(char a)
        {
            if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
                return true;
            return false;
        }
    
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        FileWriter fw = new FileWriter("output.txt");
        PrintWriter pw = new PrintWriter(fw);
        String s;
        
        //number of lines
        FileReader fr1 = new FileReader("text.txt");
        int no = 0;
        BufferedReader br1 = new BufferedReader(fr1);
        while((s=br1.readLine())!=null)
            no++;
        System.out.println(no);
        br1.close();
        
        //number of words
        FileReader fr2 = new FileReader("text.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        no = 0;
        while((s=br2.readLine())!=null)
        {
            String st[] = s.split(" ");
                no+=st.length;
        }
        System.out.println(no);
        br2.close();
        
       
        //number of vowels
        FileReader fr3 = new FileReader("text.txt");
        BufferedReader br3 = new BufferedReader(fr3);
        int noVowels = 0;
        while((s=br3.readLine())!=null)
            for(int i=0;i<s.length();i++)
                if((isVowel(s.charAt(i)))==true)
                    noVowels++;
        System.out.println(noVowels);
        br3.close();
        
        //reverse file itself
        String rev[] = new String[20];
        no = 0;
        FileReader fr4 = new FileReader("text.txt");
        BufferedReader br4 = new BufferedReader(fr4);
        while((s=br4.readLine())!=null)
        {
            rev[no] = s;
            no++;
        }
        for(int i=no-1;i>=0;i--)
            pw.println(rev[i]);
        
        pw.flush();
    }
}
