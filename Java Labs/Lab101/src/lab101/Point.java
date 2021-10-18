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
public class Point {
    
    protected int x;
    protected int y;

    public Point() {
    }

    public Point(int a, int b) {
        this.x = a;
        this.y = b;
    }
    
    public void setPoint(int a, int b){
        this.x = a;
        this.y = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(x,y)=("+x+","+y+")";
    }
    
    
    
    
    
    
    
    
    
}
