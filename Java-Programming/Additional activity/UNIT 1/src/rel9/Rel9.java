package rel9;

import java.util.Scanner;
import java.util.Locale;

/** Write a program that calculates the volume of a cone 
 * according to the formula.
 *
 * @author Irene Frías Ramos
 */
public class Rel9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r, h;
        final double PI = 3.141592;
        double V;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("We will calculate the volume of a cone.");
        System.out.print("Write the value of 'r': ");
        r = sc.nextInt();
        
        System.out.print("Write the value of 'h': ");
        h = sc.nextInt();
        
        V = 1 / 3 * PI * Math.pow(r, 2) * h;
        System.out.println("The volume of the cone is: " + V);
    }
    
}