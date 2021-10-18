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
public class Circle extends Shape
{
    private int radius;

    public Circle(int x, int y, int radius) 
    {
        super(x,y);
        this.radius = radius;
    }
    
    @Override
    public double getArea()
    {
        return Math.PI*Math.pow(radius,2);
    }
    
}
