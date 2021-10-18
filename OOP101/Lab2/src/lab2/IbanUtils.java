/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Dominic
 */
public class IbanUtils {
    
    static boolean checkIban(String IBAN)
    {
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
                return true; 
            } 
            
            
    }
    return false;
}
}
