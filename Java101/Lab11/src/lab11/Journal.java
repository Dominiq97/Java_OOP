/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author Dominic
 */
public class Journal extends Publication
{
    private double ImpactFactor;
    private String domain;

    public Journal(double ImpactFactor, String domain, String name, String authors, int noPages) 
    {
        super(name, authors, noPages);
        this.ImpactFactor = ImpactFactor;
        this.domain = domain;
    }

    public double getImpactFactor() 
    {
        return ImpactFactor;
    }

    public void setImpactFactor(double ImpactFactor)
    {
        this.ImpactFactor = ImpactFactor;
    }

    public String getDomain() 
    {
        return domain;
    }

    public void setDomain(String domain) 
    {
        this.domain = domain;
    }
    
    @Override
    public String toString()
    {
        return "J"+" "+getName()+" "+getAuthors()+" "+getNoPages()+" "+ImpactFactor+" "+domain;
    }
    
    
}
