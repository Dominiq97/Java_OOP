/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominic
 */
public class Cook extends Thread {
    
    Kitchen kt;
    Cook(Kitchen kt)
    {
        this.kt = kt;
    }
    
    @Override
    public void run()
    {
        int id = 0;
        Random r = new Random();
        while(true) 
        {
            int i = r.nextInt(4) + 3;
            
            try {
                Thread.sleep(5+i*2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cook.class.getName()).log(Level.SEVERE, null, ex);
            }
            id++;
            
            try {
                kt.add(new Pizza(id,i));
            } catch (InterruptedException ex) {
                Logger.getLogger(Cook.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Pizza nr "+ Integer.toString(id) + " was added");
        }
    }
    
}
