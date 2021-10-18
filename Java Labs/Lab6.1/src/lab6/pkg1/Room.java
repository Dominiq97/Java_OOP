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
public class Room {

    private String name;
    private double surface;
    private Bulb[] bulbs;
    private int noBulbs;

    public Room(String name, double surface) {
        this.name = name;
        this.surface = surface;
        this.bulbs = new Bulb[10];
      //  this.noBulbs = noBulbs;
    }

    public String getName() {
        return name;
    }

    public Bulb[] getBulbs() {
        return bulbs;
    }

    public int getNoBulbs() {
        return noBulbs;
    }

    public double getSurface() {
        return surface;
    }

    public void setBulbs(Bulb[] bulbs) {
        this.bulbs = bulbs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoBulbs(int noBulbs) {
        this.noBulbs = noBulbs;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public void addBulb(Bulb b) {
        bulbs[noBulbs++] = b;
    }

    public void turnOffAllBulbs() {
        for (int i = 0; i < noBulbs; i++) {
            if (bulbs[i].isTurnedOn() == true) {
                bulbs[i].turnOff();
            }
        }
    }

    public void turnOnAllBulbs() {
        for (int i = 0; i < noBulbs; i++) {
            bulbs[i].turnOn();
            
        }
    }

    public int getInstantConsumption() {
        int sumPower = 0;
        for(int i = 0;i<noBulbs;i++){
            if (bulbs[i].isTurnedOn() == true){
                sumPower+=bulbs[i].getPower();
            }
        }
        return sumPower;
    }

    public int getMaximumConsumption() {
        int power = 0;
        for(int i = 0;i<noBulbs;i++){
            power = power+ bulbs[i].getPower();
        }
        return power;
    }

    public static void main(String[] args) {
        Room r = new Room("Living room", 179.2);
        Bulb b1 = new Bulb(50,false);
        Bulb b2 = new Bulb(50,false);
        b2.turnOn();
        r.addBulb(b1);
        r.addBulb(b2);
        System.out.println(r.getInstantConsumption()); //50
        System.out.println(r.getMaximumConsumption()); //100
        r.turnOnAllBulbs();
        System.out.println(r.getInstantConsumption()); //100
        r.turnOffAllBulbs();
        System.out.println(r.getInstantConsumption()); //0
    }

}
