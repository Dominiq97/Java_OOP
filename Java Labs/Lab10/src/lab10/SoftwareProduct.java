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
public class SoftwareProduct extends Product {

    private String platform;

    public SoftwareProduct(String name, double initialPrice, String platform) {
        super(name, initialPrice);
        this.platform = platform;
    }

    public double getActualPrice() {
        if (platform.equals("linux")) {
            return getInitialPrice() * 0.85;
        }
        if (platform.equals("windows")) {
            return getInitialPrice() * 1.15;
        }
        return 0.0;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    
}
