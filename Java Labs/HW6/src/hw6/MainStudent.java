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
public class MainStudent {
    
    public static void main(String[] args) {
        Student s = new Student("Mircea Radu", 0);
        s.addExam(7);
        s.addExam(4);
        s.addExam(6);
        System.out.println(s.getName()+" has the mean mark : "+s.getMeanMark());
    }
    
}
