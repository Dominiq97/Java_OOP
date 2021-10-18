/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw7;

/**
 *
 * @author Dominic
 */
public class Share {
    
    private double value;
    private Company company;

    public Share(double value, Company company) {
        this.value = value;
        this.company = company;
    }

    public double getValue() {
        return value;
    }

    public Company getCompany() {
        return company;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    
    
    
}
