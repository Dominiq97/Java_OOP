/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominic
 */
public class SharedResource {
    
    LinkedList<Integer> l = new LinkedList<>();
    static int MAX_CAPACITY = 100;
    
    public synchronized void add(Integer i)
    {
        try {
            while(l.size()>=MAX_CAPACITY)
                wait();
            l.add(i);
            notify();
        } catch (InterruptedException ex) {
            Logger.getLogger(SharedResource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public synchronized Integer remove()
    {
        try {
            while(l.size()==0)
                wait();
            Integer res = l.pop();
            notify();
            return res;
        } catch (InterruptedException ex) {
            Logger.getLogger(SharedResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    
}
