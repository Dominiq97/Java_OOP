/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptest;

import java.util.GregorianCalendar;

/**
 *
 * @author Dominic
 */
public class Event implements Comparable<Event>{
    public enum Type{outdoor, indoor};
    
    private final String companyName;
    private final GregorianCalendar startDate;
    private final GregorianCalendar endDate;
    private final double price;
    private final Type type;
    private final String location;

    public Event(String companyName, GregorianCalendar startDate, GregorianCalendar endDate, double price, Type type, String location) {
        this.companyName = companyName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.type = type;
        this.location = location;
        
        if(startDate.compareTo(endDate)>0)
            throw new IllegalArgumentException("Invalid dates");
    }

    public String getCompanyName() {
        return companyName;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public GregorianCalendar getEndDate() {
        return endDate;
    }

    public double getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }
    
    @Override
    public int compareTo(Event e)
    {
        Event other = (Event) e;
        if(this == other) return 0;
        
        if(this.price!=other.price)
            return (int) (this.price-other.price);
        
        if(this.type!=other.type)
            return this.type.compareTo(other.type);
        
        return 0;
    }
    
    @Override
    public String toString()
    {
        return this.companyName + " " + Double.toString(this.price);
    }
    
    
}
