/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Dominic
 */
public class Lab8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sensor[] sensors = new Sensor[4];
        Dispatcher[] dispatchers = new Dispatcher[1];
        EventQueue events = new EventQueue();
        for(int i=0;i<sensors.length;i++)
        {
            if(i==0)
                dispatchers[i] = new Dispatcher(events);
            sensors[i] = new Sensor(events);
        }
            
        ExecutorService executor=Executors.newFixedThreadPool(20);
        
        for(int i=0;i<sensors.length;i++)
        {
            if(i==0)
                executor.execute(dispatchers[i]);
            executor.execute(sensors[i]);
        }
        
    }
    
}
