/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominic
 */
public class University {

    private String name;
    private String location;
    private Author[] authors = new Author[10];
    private int index = 0;

    public University(String name, String location, Author[] authors) {
        this.name = name;
        this.location = location;
        this.authors = authors;
    }

    public University() {
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAuthor(Author a) {
        authors[index++] = a;
    }
    
    public double computeScore(){
        double s = 0;
        for(int i = 0; i<index; i++){
            s += authors[i].computeScore()*(1000);
        }
        return s;
    }

}
