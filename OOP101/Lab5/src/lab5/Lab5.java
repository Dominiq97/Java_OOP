/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author Dominic
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Sandu","1981020460076",new GregorianCalendar(2015,7,7),"IT",3000);
        Employee e2 = new Employee("Marcel","65434562456", new GregorianCalendar(2017,3,4),"Cooking",4000);
        Employee e3 = new Employee("Marcel","65434562456", new GregorianCalendar(2017,3,4),"Cooking",4000);
        Employee e4 = new Employee("Marcela","29123432143", new GregorianCalendar(2000,12,25),"Research",6000);
        Employee e5 = new Employee("Karen","543234534245", new GregorianCalendar(2005,4,6), "Security",500);
        Employee e6 = new Employee("Eftimie","23243235434645",new GregorianCalendar(2007,7,8),"Ice Cream", 50000);
        Employee e7 = new Employee("Aurelian","1948342543456",new GregorianCalendar(2009,6,5),"Hot Dogs",30000);
        Employee e8 = new Employee("Nicu","102383434535",new GregorianCalendar(2015,7,7),"IT",3500);
        Employee e9 = new Employee("Georgica","195874564564",new GregorianCalendar(1999,5,5),"People",5000);
        Employee e10 = new Employee("Andrei","198645646547",new GregorianCalendar(2012,9,23),"Stuff",10000);
        ArrayList<Employee> employees = new ArrayList(); 
        
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);
        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
        
        ListIterator<Employee> listIt = employees.listIterator();
        
        while(listIt.hasPrevious())
        {
            if(listIt.previousIndex()==employees.size()/2)
                employees.add(employees.size()/2, e9);
        }
        
        Set<Employee> empSet = new HashSet<>(employees);
        
        Iterator setIt = empSet.iterator();
        System.out.println("Hash set:");
        while(setIt.hasNext())
            System.out.println(setIt.next());
        
        
        TreeSet<Employee> empTree = new TreeSet<>(empSet);
        
        System.out.println("");
        System.out.println("Tree set:");
        
        for (Employee e : empTree)
        {
            System.out.println(e);
        }
        
        
    }
    
}
