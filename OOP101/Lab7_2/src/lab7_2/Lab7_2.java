/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_2;

/**
 *
 * @author Dominic
 */
public class Lab7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kitchen kt = new Kitchen();
        Cook cook1 = new Cook(kt);
        Cook cook2 = new Cook(kt);
        Cook cook3 = new Cook(kt);
        Waiter waiter1 = new Waiter(kt);
        Waiter waiter2 = new Waiter(kt);
        Waiter waiter3 = new Waiter(kt);
        Waiter waiter4 = new Waiter(kt);
        cook1.start();
        cook2.start();
        cook3.start();
        waiter1.start();
        waiter2.start();
        waiter3.start();
        waiter4.start();
        
    }
    
}
