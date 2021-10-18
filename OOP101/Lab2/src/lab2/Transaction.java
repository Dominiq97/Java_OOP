/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Calendar;

/**
 *
 * @author Dominic
 */
public class Transaction {
    
    private long sum;
    private String IBAN;
    private final Calendar date;

    public Transaction(long sum, String IBAN, Calendar date) {
        this.sum = sum;
        this.IBAN = IBAN;
        this.date = date;
    }
    
    public long getSum()
    {
        return this.sum;
    }
    
}
