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
public class CreditCard extends Card
{
    public static final long MAX_CREDIT = 10000;
    long maxCredit;
    
    public CreditCard(long amount, String IBAN, long maxCredit)
    {
        super(amount,IBAN);
        this.maxCredit = maxCredit;
    }
    
        public CreditCard(long amount, String IBAN)
    {
        super(amount,IBAN);
        this.maxCredit = MAX_CREDIT;
    }
        
    @Override
    public boolean withdraw(long sum)
    {
        if(sum>getAmount()+maxCredit) return false;
        if(sum>getAmount())
        {
            maxCredit = maxCredit - (sum - getAmount());
            setAmount(0);
        }
        else
            setAmount(getAmount()-sum);
        return true;
    }
    
}
