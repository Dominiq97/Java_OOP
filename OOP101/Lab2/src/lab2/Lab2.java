/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Arrays;
import java.util.GregorianCalendar;

/**
 *
 * @author Dominic
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee[] emps =
        {
            new Employee(13,"john",new GregorianCalendar(1990,10,10)),
            new Employee(10,"george",new GregorianCalendar(1980,04,04)),
            new Employee(5,"mary",new GregorianCalendar(1970,3,3))
        };
        
        Arrays.sort(emps);
        for(Employee e:emps)
            System.out.println(e);
    }
    
}
