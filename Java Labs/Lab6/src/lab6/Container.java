/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Dominic
 */
public class Container {
    private Part[] parts = new Part[10]; //initial size of 10 parts
    private int noParts=0; //how many parts are actually in the container
    
    public void addPart(Part p){
        parts[noParts++]=p; //add received part to the last unoccupied position
        //simplified, it does not check if noParts==parts.length
    }
    
    public void doSmthForAllParts(){
        //iterate over all the parts
        for(int i=0;i<noParts;i++)
            parts[i].doSmth(i);
    }
    
    
    public static void main(String[] args) {
        Container c=new Container();
        Part p1=new Part();
        c.addPart(p1);
        Part p2 = new Part();
        c.addPart(p2);
        //or add anonymous Part
        c.addPart(new Part());
        c.doSmthForAllParts();
    }
    
    
    
}


