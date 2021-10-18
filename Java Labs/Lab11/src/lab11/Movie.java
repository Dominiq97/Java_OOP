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
public class Movie extends Video{
    
    private String director;
    private int rating;

    public Movie(String director) {
        super("movie title");
        this.director = director;
        this.rating = 5;
    }
    
    

    
    public String show(){
        return "Title : "+this.title+" - Director : "+this.director+" - Rating : "+this.rating;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getRating() {
        return rating;
    }
    
    
    
    
    
    
    
}
