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
public class Faculty 
{
    private String name;
    private Student[] students;
    private int noStudents;
    
    public Faculty(String name)
    {
        this.name = name;
    }
    
    public boolean addStudent(Student s)
    {
        for(int i=0;i<noStudents;i++)
            if(students[i].getId()==s.getId())
                return false;
        students[noStudents] = s;
        noStudents++;
        return true;
    }
    
    public double getAverageGradePerYear(int year)
    {
        double s = 0;
        double nr = 0;
        for(int i=0;i<noStudents;i++)
            {
                s = s+students[i].getAverageGradePerYear(year);
                nr++;
            }
        double avg = s/nr;
        return avg;
    }
    private int getNrGroups()
    {
        int noGroups=0;
        String groups[] = new String[50];
        for(int i=0;i<noStudents;i++)
        {
            for(int j=0;j<noGroups;j++)
            {
                if(students[i].getGroup().equals(groups[j]))
                    break;
            }
            groups[noGroups++] = students[i].getGroup();
        }
        return noGroups;
            
    }
    
    public GroupStats[] getGroupStats()
    {
        int noGroups = getNrGroups();
        int noStats = 0;
        GroupStats[] stats = new GroupStats[noGroups];
        for(int i = 0;i<noStudents;i++)
        {
            for(int j=0;j<noStats;j++)
            {
                if(students[i].getGroup()==stats[j].getGroup())
                {
                    stats[j].noStudents++;
                    stats[j].gradeSum = gradeSum+students[i].getAverageGrade();
                    break;
                }
    }
        GroupStat gs = new GroupStat();
        gs.group = students[i].getGroup();
        gs.noStudents=1;
        gs.gradeSum = students[i].getAverageGrade();
        stats[noStats++] = gs;
        }
    for(int i=0;i<noStats;i++)
        stats[i].averageGrade = stats[i].gradeSum/stats[i].noStudents;
    return stats;
    
    }
    
}
