/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Dominic
 */
public class Course 
{
    private String name;
    private int year;
    private boolean passed;
    private int grade;
    private int credit;
    
    public Course(String name, int year, int credit)
    {
        this.name = name;
        this.year = year;
        this.credit = credit;
    }
    
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    
    public void Passed(boolean passed)
    {
        this.passed = passed;
    }
    
    public boolean hasPassed()
    {
        return passed;
    }
    
    public int getGrade()
    {
        return grade;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public int getCredit()
    {
        return credit;
    }
}
