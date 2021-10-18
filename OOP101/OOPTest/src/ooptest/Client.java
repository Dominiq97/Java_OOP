/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptest;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Dominic
 */
public class Client {
    
    private final String name;
    private String email;
    private Event[] events = new Event[20];
    private int noEvents = 0;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    public void buyEvent(Event e)
    {
        events[noEvents++] = e;
        checkDuplicates();
    }
    
    public void checkDuplicates()
    {
        for(int i=0;i<noEvents-1;i++)
            for(int j=0;j<noEvents;j++)
                if(events[i].compareTo(events[j])==0)
                    removeEvent(j);
    }
    
    public void removeEvent(int index)
    {
        for(int i=index;i<noEvents-1;i++)
            events[i] = events[i+1];
        noEvents--;
    }
    
    public void displayByType(Event.Type type)
    {
        for(Event e:events)
            if(e.getType()==type)
            System.out.println(e);
    }
    
    public ArrayList<Event> toList()
    {
        ArrayList<Event> list = new ArrayList();
        for(Event e:events)
            list.add(e);
        return list;
    }
    
    public void Display()
    {
        for(int i=0;i<noEvents;i++)
            System.out.println(events[i]);
    }
    
}
