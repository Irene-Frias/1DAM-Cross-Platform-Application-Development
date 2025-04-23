package rel6;

import java.util.Scanner;
import java.util.Locale;

/** Write a program that calculates the area of ​​a triangle.
 *
 * @author Irene Frías Ramos 
 */
public class Rel6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base, height, area;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Write the base of the triangle: ");
        base = sc.nextDouble();
        
        System.out.print("Write the base of the height: ");
        height = sc.nextDouble();
        
        area = (base * height) / 2.0;
        System.out.println("The area of ​​the triangle is: " + area);
    }
    
}
