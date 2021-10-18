package lab1;
import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 *
 * @author Dominic
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        GregorianCalendar date = new GregorianCalendar(2000,9,15);
        Client c = new Client("Name","2981020467586",date);
        Card card1 = new CreditCard(10500,"1232123212321232123212321232123212",500);
        
        c.AddCard(card1);
        card1.withdraw(200);
        
        Card card2 = new CreditCard(1000,"1232123212321232123212321232123218",700);
        c.AddCard(card2);
        c.RemoveCard("1232123212321232123212321232123218");
        
    }
    
}
