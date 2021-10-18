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
public class Student 
{
    private int id;
    private String name;
    private int year;
    private String group;
    private Course[] courses;
    private int noCourses;
    
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    public void setYear(int year)
    {
        this.year = year;
    }
    
    public void setGroup(String group)
    {
        this.group = group;
    }
    
    public void setCourses(Course[] courses)
    {
        this.courses = courses;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    public int getYear()
    {
        return year;
    }
    
    public String getGroup()
    {
        return group;
    }
    
    public boolean addCourse(Course c)
    {
        for(int i=0;i<courses.length;i++)
            if(courses[i].getName().equals(c.getName()))
                return false;
        courses[noCourses] = c; 
        return true;
    }
    
    public double getAverageGrade()
    {
        double s = 0;
        double nr = 0;
        for(int i=0;i<noCourses;i++)
            if(courses[i].hasPassed()==true)
            {
                s = s+courses[i].getGrade();
                nr++;
            }
        if(nr==0)
            return 0;
        double av = s/nr;
        return av;
    }
    
    public double getAverageGradePerYear(int year)
    {
        double s = 0;
        double nr = 0;
        for(int i=0;i<noCourses;i++)
            if(courses[i].hasPassed()==true && courses[i].getYear()==year)
            {
                s = s+courses[i].getGrade();
                nr++;
            }
        if(nr==0)
            return 0;
        double av = s/nr;
        return av;
    }
    
    public int getCredits()
    {
        int s = 0;
        for(int i=0;i<noCourses;i++)
        {
            if(courses[i].hasPassed()==true)
                s = s+courses[i].getCredit();
        }
        return s;
    }
}
    
