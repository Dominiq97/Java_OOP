/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw7;

/**
 *
 * @author Dominic
 */
public class Portfolio {
    
    private Share[] shares = new Share[10];
    private int noshares;

    public Portfolio() {
    }
    
    public int getNoshares() {
        return noshares;
    }

    public Share[] getShares() {
        return shares;
    }

    public void setNoshares(int noshares) {
        this.noshares = noshares;
    }

    public void setShares(Share[] shares) {
        this.shares = shares;
    }
    
    public void addShare(Share s){
            shares[noshares++]=s;
    }
    public double computeSum(){
        int s = 0;
        for(int i = 0;i<noshares;i++){
            s = (int) (s + shares[i].getValue());
        }
        return s;
    }
    
}
