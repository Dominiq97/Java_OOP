/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.io.Serializable;

/**
 *
 * @author Dominic
 */
public class Product implements Serializable{
    
    private String type;
    private int quantity, price;

    public Product(String type, int quantity, int price) {
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
    
    public int getTotalPrice()
    {
        return price*quantity;
    }
    
    @Override
    public String toString()
    {
        return type + " " + Integer.toString(price) + " " + Integer.toString(quantity);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
