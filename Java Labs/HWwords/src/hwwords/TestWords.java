/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwwords;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Dominic
 */
public class TestWords {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner s=new Scanner(new File("words.txt"));
        int x=0;
        while(s.hasNext()){
            x++;
            s.next();
        }
        s.close();
        s=new Scanner(new File("words.txt"));
        String[] words=new String[x];
        int z=0;
        while(s.hasNext()){
            words[z]=s.next().trim();
            z++;
        }
        s.close();
        String[] uwords=new String[x];
        int[] uwfq=new int[x];
        int y=0,ct;
        boolean found;
        for(int i=0;i<x;i++){
            found=false;
            for(int j=0;j<y && !found;j++){
                if(words[i].equals(uwords[j])){
                    found=true;
                }
            }
            if(!found){
                uwords[y]=words[i];
                ct=1;
                for(int k=i+1;k<x;k++){
                    if(words[i].equals(words[k]))
                        ct++;
                }
                uwfq[y]=ct;
                y++;
            }
        }
        for(int i=0;i<y;i++){
            System.out.println(uwords[i]+" "+uwfq[i]);
        }
        
    }
}
