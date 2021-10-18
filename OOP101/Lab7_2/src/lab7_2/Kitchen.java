/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_2;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominic
 */
public class Kitchen {
    
    LinkedList<Pizza> l = new LinkedList<>();
    static int MAX_CAPACITY = 100;
        
        public synchronized void add(Pizza p)
        {
            while(l.size()>=MAX_CAPACITY) try {
                wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Kitchen.class.getName()).log(Level.SEVERE, null, ex);
                }
            l.add(p);
            notify();
        }
        
        public synchronized Pizza remove()
        {
            while(l.size()==0) try {
                wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Kitchen.class.getName()).log(Level.SEVERE, null, ex);
                }
            Pizza res = l.pop();
            notify();
            return res;
        }
        
    }
    

