/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.FileNotFoundException;

/**
 *
 * @author Dominic
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException 
    {
         
        Card c1 = new Card(Card.Rank.Ace, Card.Suit.Spades);
        Card c2 = new Card(Card.Rank.Two, Card.Suit.Hearts);
        Card c3 = new Card(Card.Rank.Knight, Card.Suit.Clubs);
        
        Hand h = new Hand();
        
        h.addCard(c1);
        h.addCard(c2);
        h.addCard(c3);
        h.sort();
        h.display();
        
        h.store("cards.txt");
        
    }
    
}
