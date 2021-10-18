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
public class Circle {

    /**
     * @param args the command line arguments
     */
    private int xCircle;
    private int yCircle;
    private double radius;

    public Circle(int xCircle, int yCircle, double radius) {
        this.xCircle = xCircle;
        this.yCircle = yCircle;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public int getxCircle() {
        return xCircle;
    }

    public int getyCircle() {
        return yCircle;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setxCircle(int xCircle) {
        this.xCircle = xCircle;
    }

    public void setyCircle(int yCircle) {
        this.yCircle = yCircle;
    }
    
    public double getArea(){
        return (Math.PI*(this.radius*this.radius));
    }
    
    public double getCircumference(){
        return Math.PI*2*this.radius;
    }
    
    
    
    
}
