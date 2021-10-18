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
public abstract class Card 
{
    private long amount;
    private String IBAN;
    private Client c;
    
    public Card(long amount, String IBAN)
    {
        this.amount = amount;
        this.IBAN = IBAN;
    }

    public long getAmount() 
    {
        return amount;
    }

    public String getIBAN() 
    {
        return IBAN;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }
    
    public void deposit(long sum)
    {
        this.amount = this.amount + sum;
    }
    
    public abstract boolean withdraw(long sum);
    
    public void setC(Client c)
    {
        this.c = c;
    }
        
}
