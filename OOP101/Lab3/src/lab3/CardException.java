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
public class CardException extends IllegalArgumentException{
    
    public CardException()
    {
        super();
    }
    
    public CardException(String n)
    {
        super(n);
    }
    
}
