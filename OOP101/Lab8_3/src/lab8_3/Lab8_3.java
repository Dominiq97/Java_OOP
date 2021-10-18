/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominic
 */
public class Lab8_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BlockingQueue<SensorEvent> bq = new ArrayBlockingQueue<>(20);
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.execute(new Runnable(){
            
            @Override
            public void run()
            {
                while(true)
                    try {
                        bq.put(new SensorEvent());
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Lab8_3.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        });
        
        for(int i=0;i<4;i++)
        {
            executor.execute(new Runnable() {
            
                @Override
                public void run() 
                {
                    while(true)
                        try {
                            System.out.println(Integer.toString(bq.take().id));
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Lab8_3.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
            });
        }
        
    }
    
}
