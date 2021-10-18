/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg1;

/**
 *
 * @author Dominic
 */
public class Bulb {
    
    private int power;
    private boolean turnedOn;

    public Bulb(int power, boolean turnedOn) {
        this.power = power;
        this.turnedOn = turnedOn;
    }
    
    public Bulb(int power){
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public boolean isTurnedOn() {
        return this.turnedOn;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }
    
    public void turnOn(){
        this.turnedOn = true;
    }
    
    public void turnOff(){
        this.turnedOn = false;
    }
    
    
    
}
