/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominic
 */
public class Producer extends Thread{
    
    SharedResource sr;
    Producer(SharedResource sr) {this.sr = sr;}
    
    public void run()
    {
        Random r = new Random();
        while(true)
        {
            try {
                Thread.sleep(50);
                int i=r.nextInt(100);
                sr.add(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
