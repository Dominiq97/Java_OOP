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
public class DebitCard extends Card
{
    public DebitCard(long amount, String IBAN)
    {
        super(amount,IBAN);
    }
    
    public boolean withdraw(long sum)
    {
        if(sum>=getAmount())
            return false;
        else
            setAmount(getAmount()-sum);
        return true;
    }
}
