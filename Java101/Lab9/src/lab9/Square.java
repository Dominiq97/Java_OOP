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
public class Square extends Shape
{
    private int edge;
    
    public Square(int x, int y, int edge)
    {
        super(x,y);
        this.edge = edge;
    }
    
    @Override
    public double getArea()
    {
        return Math.pow(edge,2);
    }
}
