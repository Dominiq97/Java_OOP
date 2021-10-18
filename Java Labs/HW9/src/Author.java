/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominic
 */
public class Author {
    
    private String name;
    private Publication[] publications = new Publication[10];
    private int index = 0;

    public Author(String name, Publication[] publications) {
        this.name = name;
        this.publications = publications;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public Publication[] getPublications() {
        return publications;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublications(Publication[] publications) {
        this.publications = publications;
    }

    public void addPublication(Publication p){
        publications[index++] = p;
    }
    
    public double computeScore(){
        double s = 0;
        for(int i = 0; i<index; i++){
            s+=publications[i].computeScore();
        }
        return s;
    }
    
    
    
}
