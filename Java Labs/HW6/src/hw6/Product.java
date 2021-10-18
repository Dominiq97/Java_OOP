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
public class Product {
    
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProduct(){
        System.out.println(this.name + " -> " + this.price);
    }

    public double getPrice() {
        return price;
    }

    public void setPriceRol(double price) {
        this.price = price;
    }
    
    public double getPriceInRON(){
        return this.price/10000;
    }

    public void setPriceInRON(double price) {
        this.price = price;
    }
    
    
    
    
    
    
    
}
