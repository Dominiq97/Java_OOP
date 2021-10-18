/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author Dominic
 */
public class Patient {
    
    private String name;
    private int age;
    private String CNP;

    public Patient(String name, int age, String CNP) {
        this.name = name;
        this.age = age;
        this.CNP = CNP;
    }

    public int getAge() {
        return age;
    }

    public String getCNP() {
        return CNP;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
