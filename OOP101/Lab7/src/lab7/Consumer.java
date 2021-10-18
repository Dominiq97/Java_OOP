/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominic
 */
public class Consumer extends Thread{
    
    SharedResource sr;
    Consumer(SharedResource sr) {this.sr = sr;}
    public void run()
    {
        while(true)
        {
            try {
                Thread.sleep(50);
                System.out.print(sr.remove());
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
