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
public class Shop {

    private Product[] prods = new Product[100];
    private int productCounter = 0;

    public boolean add(Product p) {
        if (productCounter < prods.length) {
            prods[productCounter++] = p;
            return true;
        } else {
            return false;
        }
    }

    public void setProductCounter(int productCounter) {
        this.productCounter = productCounter;
    }

    public int getProductCounter() {
        return productCounter;
    }

    public Product[] getProds() {
        return prods;
    }
    
    
    
}
