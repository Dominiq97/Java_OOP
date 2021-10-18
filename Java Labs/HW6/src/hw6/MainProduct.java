/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

/**
 *
 * @author Dominic
 */
public class MainProduct {
    
    public static void main(String[] args) {
        
    Product p1 = new Product("detergent", 120000);
    Product p2 = new Product("prosop", 320000);
    
    p1.displayProduct();
    p2.displayProduct();
    
    p1.setPriceRol((p1.getPriceInRON()+10.25));
    p2.setPriceRol((p2.getPriceInRON()+10.25));
    
    p1.displayProduct();
    p2.displayProduct();
    
    System.out.println(p1.getPriceInRON()*10000);
    System.out.println(p2.getPriceInRON()*10000);
    
    
    
    }
}
