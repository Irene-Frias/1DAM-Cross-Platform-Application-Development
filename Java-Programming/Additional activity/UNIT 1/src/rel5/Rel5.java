package rel5;

import java.util.Scanner;
import java.util.Locale;

/** Write a program that calculates the area of ​​a rectangle.
 *
 * @author Irene Frías Ramos
 */
public class Rel5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double width, height, area;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Write the width of the rectangle: ");
        width = sc.nextDouble();
        
        System.out.print("Write the high of the rectangle: ");
        height = sc.nextDouble();
        
        area = width * height;
        System.out.println("The area of the rectangle is: " + area);
    }
    
}
