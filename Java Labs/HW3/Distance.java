import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 *
 * @author Dominic
 */
public class Distance {
    
    public static double distance(double x1, double y1, double x2, double y2){
        double dist =  sqrt(pow(x1-x2,2)+pow(y1-y2,2));
        return dist;
    }
    
    public static void main(String[] args) {
        System.out.println(distance(0,0,4,5));
    }
    
}