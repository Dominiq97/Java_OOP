/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_3;

import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author Dominic
 */
public class SensorEvent {
    
    static int nextid=0;
    public enum EventType {Fire, Smoke, Flooding};
    private EventType event;
    Random r = new Random();
    public int id;
    private Calendar time;
    
    public SensorEvent()
    {
        this.id = getId();
        this.time=Calendar.getInstance();
        int i = r.nextInt(3);
        if(i==0)
            this.event = event.Fire;
        
        if(i==1)
            this.event = event.Smoke;
        
        if(i==2)
            this.event = event.Flooding;
    }
    
    public static synchronized int getId()
    {
        return nextid++;
    }
    
    
}

