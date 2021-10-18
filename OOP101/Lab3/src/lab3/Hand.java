/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author Dominic
 */
public class Hand implements Storable{
    
    Card[] cards = new Card[52];
    int noCards = 0;
    
    public Hand()
    {
        
    }
    
    public void addCard(Card c)
    {
        cards[noCards++] = c;
    }
    
    public boolean deleteCard(Card.Rank r, Card.Suit s)
    {
        for(int i=0;i<noCards;i++)
        {
            if(cards[i].rank == r && cards[i].suit == s)
            {
                for(int j=i;j<noCards-1;j++)
                    cards[j] = cards[j+1];
                noCards--;
                return true;
            }
                    
        }
        return false;
    }
    
    public void sort()
    {
        for(int i=0;i<noCards-1;i++)
            for(int j=i+1;j<noCards;j++)
                if(cards[i].compareTo(cards[j])<0)
                {
                    Card temp = cards[i];
                    cards[i] = cards[j];
                    cards[j] = temp;
                }
    }
    
    public void display()
    {
        for(int i=0;i<noCards;i++)
            System.out.println(cards[i].suit+" "+cards[i].rank);
    }
    
    @Override
    public void store(String file) throws FileNotFoundException
    {
        FileOutputStream outputFile=new FileOutputStream(file);
        OutputStreamWriter outputStream=new OutputStreamWriter(outputFile);
        PrintWriter pw=new PrintWriter(outputStream);
        
        for(int i=0;i<noCards;i++)
            pw.println(cards[i].rank+" "+cards[i].suit);
        pw.flush();
        
    }
    
}
