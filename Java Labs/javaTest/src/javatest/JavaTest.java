/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

//import static java.lang.Math.ceil;
//import static java.lang.Math.floor;
import static java.lang.Math.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dominic
 */
public class JavaTest {

    /**
     * @param args the command line arguments
     */
    public static class Calculate {

        static int cube(int x) {
            return x * x * x;
        }

        public static boolean evenNumbers(int x) {
            int[] vec = new int[x];
            Random r = new Random();
            for (int i = 0; i < x; i++) {
                vec[i] = r.nextInt(100);
            }
            int evNo = 0;
            for (int i = 0; i < x; i++) {
                if (vec[i] % 2 == 0) {
                    evNo++;
                }
            }

            for (int i = 0; i < x; i++) {
                System.out.println(vec[i] + " ");
            }
            if (evNo > (x / 2)) {
                return true;
            }
            return false;
        }
        
        
        
        

        public static void main(String args[]) {
       /*     int result = Calculate.cube(5);
            System.out.println(floor(3.52));
            System.out.println(result);

            Random r = new Random();
            int a = r.nextInt(100);
            System.out.println(a);
            int c = -1;
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
         
            System.out.println(evenNumbers(s));
        */    
            
                
            Doctor d = new Doctor();
            
            Patient p1 = new Patient("radu", 23, "9839842");
            Patient p2 = new Patient("klaus", 72, "9839842");
            Patient p3 = new Patient("cipri", 21, "9839842");
            Patient p4 = new Patient("octav", 65, "9839842");
            d.addPacient(p4);
            d.addPacient(p3);
            d.addPacient(p2);
            d.addPacient(p1);
            
            System.out.println(d.getOldestPatient());
            System.out.println(d.computeSalary());  
            
            
            
            
            
            
            
            
            
        }
    }

}
