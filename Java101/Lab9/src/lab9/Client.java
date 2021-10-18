/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author Dominic
 */
public class Client 
{
    private String name;
    private String CNP;
    private Card[] cards = new Card[100];
    private int noCards;

    public Client()
    {
        
    }
    public Client(String name, String CNP) 
    {
        this.name = name;
        this.CNP = CNP;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getCNP()
    {
        return CNP;
    }

    public void setCNP(String CNP) 
    {
        this.CNP = CNP;
    }
    
    public boolean add(Card c)
    {
        for(int i=0;i<noCards;i++)
        {
            if(cards[i].getIBAN().equals(c.getIBAN()))
                return false;
        }
        cards[noCards] = c;
        noCards++;
        //Connection between client and card is bidirectional!!!
        c.setC(this);
        return true;
    }
    
    public boolean delete(String IBAN)
    {
        for(int i = 0;i<noCards;i++)
            if(IBAN.equals(cards[i].getIBAN()))
            {
                for(int j=i;j<noCards-1;j++)
                    cards[j]=cards[j+1];
                noCards--;
                return true;
            }
        return false;
    }
    
    public void ANAFStrikes()
    {
        for(int i=0;i<noCards;i++)
            cards[i].withdraw(10);
    }
    
}
