/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 * @author Dominic
 */


public class Doctor extends CareProvider{
        
    

    public  double computeSalary(){
        return 50*super.getNoPatients();
    }
                
}
    
    
    

