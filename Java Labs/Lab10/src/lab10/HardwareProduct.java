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
public class HardwareProduct extends Product {

    private int energyClass;

    public HardwareProduct(String name, double initialPrice, int energyClass) {
        super(name, initialPrice);
        this.energyClass = energyClass;
    }

    public double getActualPrice() {
        if (energyClass < 3) {
            return getInitialPrice() * 0.75;
        } else {
            return getInitialPrice() * 1.20;
        }
    }

    public int getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(int energyClass) {
        this.energyClass = energyClass;
    }
    
    
}
