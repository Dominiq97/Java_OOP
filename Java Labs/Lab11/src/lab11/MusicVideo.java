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
public class MusicVideo extends Video{
    
    private String artist;
    private String cathegory;

    

    public MusicVideo(String artist) {
        super("unknown");
        this.artist = artist;
        this.cathegory = "general";
    }
  
    
    
    public String show(){
        return "Title : "+this.title+" - Artist : "+this.artist+" - Cathegory : "+this.cathegory;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCathegory() {
        return cathegory;
    }

    public void setCathegory(String cathegory) {
        this.cathegory = cathegory;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    
    
    
    
}
