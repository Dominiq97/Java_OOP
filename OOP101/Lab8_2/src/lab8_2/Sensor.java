/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominic
 */
public class Sensor extends Thread
{
    
    EventQueue events;
    Sensor(EventQueue events)
    {
        this.events = events;
    }
    
    @Override
    public void run()
    {
        Random r = new Random();
        while(true) 
        {
            int i = r.nextInt(4) + 3;
            
            try {
                Thread.sleep(5+i*2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sensor.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            try {
                SensorEvent ev = new SensorEvent();
                events.add(ev);
                System.out.println("Event nr "+ Integer.toString(ev.id) + " was added");
            } catch (InterruptedException ex) {
                Logger.getLogger(Sensor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
