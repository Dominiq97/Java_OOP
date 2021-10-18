/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptest;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 *
 * @author Dominic
 */
public class OOPTest {

    /**
     * @param args the command line arguments
     */
    public HashMap<Event.Type,ArrayList<Client>> toMap(Event.Type type, ArrayList<Client> clientList)
    {
        HashMap<Event.Type,ArrayList<Client>> map1 = new HashMap();
        map1.put(type, clientList);
        return map1; 
    }
    
    public static void main(String[] args) {
        
       Event e1 = new Event("CevaTurism",new GregorianCalendar(2018,8,8),new GregorianCalendar(2018,8,9),300,Event.Type.indoor,"Casa caselor");
       Event e2 = new Event("Kompania",new GregorianCalendar(2018,8,8),new GregorianCalendar(2018,9,8),0,Event.Type.outdoor,"Parcul de jos");
       Event e3 = new Event("PadureaAlba",new GregorianCalendar(2018,9,9),new GregorianCalendar(2018,9,11),500,Event.Type.outdoor,"Padurea Alba");
       Client c1 = new Client("Iulian","iuly_printul_1992@aol.com");
       c1.buyEvent(e1);
       c1.buyEvent(e2);
       c1.buyEvent(e1);
       c1.buyEvent(e3);
       Client c2 = new Client("David","daviddavid99@yahoo.com");
       c2.buyEvent(e2);
       c2.buyEvent(e2);
       
       ArrayList<Event> eventList = c1.toList();
       
       c2.Display();
       
       ArrayList<Client> clients = new ArrayList();
       clients.add(c1);
       clients.add(c2);
     
       OOPTest exit = new OOPTest();
       exit.start();
       //c2.displayByType(Event.Type.outdoor);
       
       
       
       
    }
    
    public void start()
    {
     //   HashMap hmap = toMap(Event.Type.outdoor,clients);
    }
    
}
