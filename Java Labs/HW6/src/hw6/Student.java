/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

/**
 *
 * @author Dominic
 */
public class Student {
    
    int nr=0;
    private String name;
    private int totalPoints;

    public Student(String name, int totalPoints) {
        this.name = name;
        this.totalPoints = totalPoints;
    }

    public String getName() {
        return name;
    }
    
    public void addExam(int mark){
        this.totalPoints+=mark;
        nr++;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getMeanMark(){
        return this.getTotalPoints()/nr;
    }
    
    
    
}
