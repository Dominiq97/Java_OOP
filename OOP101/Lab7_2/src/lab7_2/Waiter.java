/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominic
 */
public class Waiter extends Thread{
    
    Kitchen kt;
    
    Waiter(Kitchen kt)
    {
        this.kt = kt;
    }
    
    public void run()
    {
        while(true)
        {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Waiter.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Pizza with id " + Integer.toString(kt.remove().id) + " was removed.");
        }
            
    }
    
}
