/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab101;

/**
 *
 * @author Dominic
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Point p1 = new Point(5, 6);
        Circle c1 = new Circle();
        c1.setPoint(3, 4);
        c1.setRadius(2);
        Circle c2 = new Circle(4, 5, 8);
        c2.setPoint(4, 2);
        Cylinder ch1 = new Cylinder();
        ch1.setHeight(5);
        ch1.setPoint(3, 5);
        ch1.setRadius(3);
        Cylinder ch2 = new Cylinder(2, 5, 12, 15);
        ch2.setPoint(4, 8);
        System.out.println(p1.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
   
    }
}
