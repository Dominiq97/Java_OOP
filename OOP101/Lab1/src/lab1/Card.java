/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Dominic
 */
public abstract class Card {
    
    private final String IBAN;
    private long amount;

    public Card(String IBAN, long amount) throws Exception {
        
        if(IBAN.length()==34)
        {
            long N = Long.parseLong(IBAN.substring(0,8));
            N=N%97;
            String temp = N+IBAN.substring(9,15);
            N = Long.parseLong(temp);
            
            N=N%97;
             temp = N+IBAN.substring(16,22);
            N = Long.parseLong(temp);
            
            N=N%97;
                temp = N+IBAN.substring(23,29);
            N = Long.parseLong(temp);
            
            if(N%97==1)
            {
                this.IBAN = IBAN;
                this.amount = amount;
            } 
            
            else throw new RuntimeException("Wrong IBAN!");
        }
        
        else throw new RuntimeException("Wrong IBAN!");
    }

    public String getIBAN() {
        return IBAN;
    }


    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
     
    public void deposit(long sum)
    {
        amount+=sum;
    }
    
    public abstract boolean withdraw(long sum);

   
    
    
    
    
    
    
}




