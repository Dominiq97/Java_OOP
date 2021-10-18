/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_2;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Dominic
 */
public class EventQueue {
    
    final Lock lock = new ReentrantLock();
    final Condition notFull = lock.newCondition();
    final Condition notEmpty = lock.newCondition(); 
    LinkedList<SensorEvent> l = new LinkedList<>();
    static int MAX_CAPACITY = 100;
        
        public void add(SensorEvent p) throws InterruptedException
        {
            lock.lock();
            try{
                while(l.size()==100) notFull.await();
                l.add(p);
                notEmpty.signal();
            }
            finally{
                
                lock.unlock();
            }
            
        }
        
        public SensorEvent remove() throws InterruptedException
        {
            lock.lock();
            try {
               while(l.isEmpty()) notEmpty.await();
               SensorEvent res = l.pop();
               notFull.signal();
               return res; 
            }
            finally {
                
               lock.unlock();
            }
        }
    
}
