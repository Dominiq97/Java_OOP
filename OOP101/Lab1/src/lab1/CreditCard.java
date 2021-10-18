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
public class CreditCard extends Card{
    
    private final long MaxWithdraw;

    public CreditCard(long MaxWithdraw, String IBAN, long amount) throws Exception {
        super(IBAN, amount);
        this.MaxWithdraw = MaxWithdraw;
    }
    
@Override
   public boolean withdraw(long sum)
   {
       if(sum<=getAmount()+MaxWithdraw)
       {
           setAmount(getAmount()-sum);
           return true;
       }
       return false;
   }
    
}
