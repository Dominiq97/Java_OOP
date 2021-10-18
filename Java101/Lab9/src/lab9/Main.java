/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author Dominic
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape[] geom = new Shape[10];
        geom[0] = new Circle(1,2,3);
        geom[1] = new Square(4,5,2);
        geom[2] = new Square(3,3,3);
        geom[3] = new Circle(5,4,1);
        for(int i=0;i<4;i++)
            System.out.println(geom[i].getArea());
        
    }
    
}
