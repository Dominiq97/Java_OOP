/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Dominic
 */
public class Card implements Comparable<Card>{
    
   public enum Rank{Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Knight, Queen, King}
   public enum Suit{Hearts, Clubs, Spades, Diamonds}

    public Rank rank;
    public Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    @Override
    public int compareTo(Card c)
    {
        Card other = (Card) c;
        
        if(suit.compareTo(other.suit)>0)
                return 1;
        if(suit.compareTo(other.suit)<0)
                return -1;
        
        if(rank.compareTo(other.rank)>0)
            return 1;
        if(rank.compareTo(other.rank)<0)
            return -1;
        
        return 0;
        
    }
    
    
    
    }

