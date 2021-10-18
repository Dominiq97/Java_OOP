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
public class Circle extends Point{

    protected int r;
    
    public Circle() {
        super();
    }

    public Circle(int r, int a, int b) {
        super(a, b);
        this.r = r;
    }
    
    public void setRadius(int r){
        this.r = r;
    }

    @Override
    public String toString() {
        return "(x,y,r)=("+x+","+y+","+r+")";
    }
    
    
    
    
    
    
    
    
    
    
}
