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
public class DebitCard extends Card{

    public DebitCard(String IBAN, long amount) throws Exception {
        super(IBAN, amount);
    }
    
    
 @Override
 public boolean withdraw(long sum)
 {
     if(this.getAmount() < sum)
         return false;
     else 
         this.setAmount(this.getAmount()-sum);
     
     return true;
     
         
 }
}
