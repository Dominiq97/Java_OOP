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
public abstract class Publication 
{
    private String name;
    private String authors;
    private int noPages;

    public Publication(String name, String authors, int noPages) 
    {
        this.name = name;
        this.authors = authors;
        this.noPages = noPages;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAuthors()
    {
        return authors;
    }

    public void setAuthors(String authors) 
    {
        this.authors = authors;
    }

    public int getNoPages() 
    {
        return noPages;
    }

    public void setNoPages(int noPages)
    {
        this.noPages = noPages;
    }
    
    @Override
    public abstract String toString();
    
  
}
