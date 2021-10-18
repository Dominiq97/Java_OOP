/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominic
 */
public class Kitchen {
    
    final Lock lock = new ReentrantLock();
    final Condition notFull = lock.newCondition();
    final Condition notEmpty = lock.newCondition(); 
    LinkedList<Pizza> l = new LinkedList<>();
    static int MAX_CAPACITY = 100;
        
        public void add(Pizza p) throws InterruptedException
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
        
        public Pizza remove() throws InterruptedException
        {
            lock.lock();
            try {
               while(l.isEmpty()) notEmpty.await();
               Pizza res = l.pop();
               notFull.signal();
               return res; 
            }
            finally {
                
               lock.unlock();
            }
        }
        
    }
