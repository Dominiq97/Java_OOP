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
public abstract class Shape 
{
    private int x,y;

    public Shape(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    
    public abstract double getArea();

    public int getX() 
    {
        return x;
    }

    public int getY() 
    {
        return y;
    }
    
    
}
