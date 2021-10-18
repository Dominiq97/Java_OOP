/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.GregorianCalendar;

/**
 *
 * @author Dominic
 */
public class Client {
    
    private final String name;
    private final String CNP;
    private final GregorianCalendar bday;
    private final Card[] cards = new Card[20];
    private int NoCards = 0;

    public Client(String name, String CNP, GregorianCalendar bday) {
        this.name = name;
        this.CNP = CNP;
        this.bday = new GregorianCalendar();
        this.bday.setTime(bday.getTime());
    }
    
    public GregorianCalendar getBday()
    {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(bday.getTime());
        return gc;
    }

    public String getName() {
        return name;
    }

   
    public String getCNP() {
        return CNP;
    }


    public Card[] getCards() {
        return cards;
    }
 
    public void AddCard(Card card)
    {
        cards[NoCards++] = card;
    }
    
    
    public boolean RemoveCard(String IBAN)
    {
        for(int i=0;i<NoCards;i++)
            if(cards[i].getIBAN().equals(IBAN))
            { for(int j=i;j<NoCards-1;j++)
                
                    cards[j]=cards[j+1];
                    
            NoCards--;
            return true;
                    
                }
        return false;
           }
    }
    
           
    

