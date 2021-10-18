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
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Client c = new Client();
        c.add(new DebitCard(1500,"123"));
        c.add(new CreditCard(1700,"124"));
        c.ANAFStrikes();
    }
    
}
