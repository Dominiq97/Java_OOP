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
public class Cylinder extends Circle{
    
    protected double h;

    public Cylinder() {
        super();
    }

    public Cylinder(double h, int r, int a, int b) {
        super(r, a, b);
        this.h = h;
    }
    
    public void setHeight(double h){
        this.h = h;
    }

    @Override
    public String toString() {
        return "(x,y,r,h)=("+x+","+y+","+r+","+h+")";
    }
    
    
    
    
    
}
