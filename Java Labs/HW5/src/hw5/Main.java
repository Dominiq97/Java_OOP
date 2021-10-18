/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

import java.text.DecimalFormat;

/**
 *
 * @author Dominic
 */
public class Main {
    
    public static void main(String[] args) {
        Circle c1 = new Circle(10, 5, 20);
        Circle c2 = new Circle(32,11, 8);
        
        String value1 = new DecimalFormat("##.##").format(c1.getArea());
        System.out.println("Aria lu' c1 e : "+value1);
        String value2 = new DecimalFormat("##.##").format(c2.getArea());
        System.out.println("Aria lu' c2 e : "+value2);
        String value3 = new DecimalFormat("##.##").format(c1.getCircumference());
        System.out.println("Lungimea lu' c1 e : "+value3);
        String value4 = new DecimalFormat("##.##").format(c2.getCircumference());
        System.out.println("Lungimea lu' c2 e : "+value4);
        
    }
    
}
