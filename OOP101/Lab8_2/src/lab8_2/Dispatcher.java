/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominic
 */
public class Dispatcher extends Thread
{
    
    EventQueue events;
    
    Dispatcher(EventQueue events)
    {
        this.events = events;
    }
    
    public void run()
    {
        while(true)
        {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Dispatcher.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("Event with id " + Integer.toString(events.remove().id) + " was removed.");
            } catch (InterruptedException ex) {
                Logger.getLogger(Dispatcher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }
    
}
