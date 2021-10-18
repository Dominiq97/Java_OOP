/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author Dominic
 */
public class Main {

    public static void main(String[] args) {
        Shop s = new Shop();
        Product h1, h2, h3;
        Product s1, s2, s3;
        h1 = new HardwareProduct("fridge", 130, 5);
        s1 = new SoftwareProduct("Office", 20, "windows");
        s2 = new SoftwareProduct("Nero", 35, "windows");
        h2 = new HardwareProduct("cooler", 70, 3);
        s3 = new SoftwareProduct("BitDefender", 199, "windows");
        h3 = new HardwareProduct("microwave", 130, 4);
        
        s.add(s3);
        s.add(s2);
        s.add(s1);
        s.add(h1);
        s.add(h2);
        s.add(h3);

        for (int i = 0; i < s.getProductCounter();i++){
            System.out.println(s.getProds();
            
            
        }
    }
}
