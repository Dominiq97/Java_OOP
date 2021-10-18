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
public class Video {
    
    protected String title;
    protected int length;
    protected boolean available;

    public Video(String title) {
        this.title = title;
        this.length = 90;
        this.available = true;
    }

    
    
    

    public Video(String title, int length) {
        this.title = title;
        this.length = length;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
    
    
    
    public String show(){
        return "Title : "+this.title+" - Length : "+this.length;
    }
    
    
    
    
    
    
    
    
    
}
