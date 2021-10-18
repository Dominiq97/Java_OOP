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
public class Book extends Publication
{
    private String ISBN;
    private String genre;

    public Book(String ISBN, String genre, String name, String authors, int noPages) 
    {
        super(name, authors, noPages);
        this.ISBN = ISBN;
        this.genre = genre;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre) 
    {
        this.genre = genre;
    }
    
    @Override
    public String toString()
    {
        return "B"+" "+getName()+" "+getAuthors()+" "+getNoPages()+" "+ISBN+" "+genre;
    }
    
    
}
