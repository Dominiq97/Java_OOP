/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.lang.Comparable;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Dominic
 */
public class Employee implements Comparable{
    
    int id;
    String name;
    GregorianCalendar bday;

    public Employee(int id, String name, GregorianCalendar bday) {
        this.id = id;
        this.name = name;
        this.bday = bday;
    }
    
    public int compareTo(Object emp)
    {
        Employee other = (Employee)emp; //?
        if(this == emp) return 0; //?
        //primitive 
                
        if(id<other.id) 
            return -1;
        
        if(id>other.id)
            return 1;
        
        if(name.compareTo(other.name)!=0)
            return(bday.compareTo(other.bday));
        
        return 0;
    }
    
}
