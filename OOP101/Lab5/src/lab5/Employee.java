/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author Dominic
 */
public class Employee implements Comparable<Employee>
{
    private String name;
    private String CNP;
    private GregorianCalendar hiringDate;
    private String specialization;
    private double salary;

    public Employee(String name, String CNP, GregorianCalendar hiringDate, String specialization, double salary) {
        this.name = name;
        this.CNP = CNP;
        this.hiringDate = hiringDate;
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public GregorianCalendar getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(GregorianCalendar hiringDate) {
        this.hiringDate = hiringDate;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString()
    {
        String s = name + " " + CNP + " " +hiringDate.get(GregorianCalendar.YEAR)+ " " + Double.toString(salary);
        return s;
    }
    
    @Override
    public int compareTo(Employee e)
    {
        Employee other = (Employee) e;
        return this.CNP.compareTo(other.CNP);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.CNP);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.CNP, other.CNP)) {
            return false;
        }
        return true;
    }
    
    
}
