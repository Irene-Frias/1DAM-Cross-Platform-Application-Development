package act1.pkg14;

import java.util.Scanner;

/** A program that calls for the base and height of the triangle.
 *
 * @author Irene Frías Ramos
 */
public class Act114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the variables.
        double base;
        double height;
        double area;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down the 
        // base of triangle.
        System.out.print("Write the base of a triangle: ");
        
        // This is the value that the user write and presses enter.
        base = sc.nextDouble();
        
        // To show the user what to do, in this case is to write down the 
        // base of triangle.
        System.out.print("Write the height of a triangle: ");
        height = sc.nextDouble();
        
        // Calculate the 
        area = (base * height) / 2;
        
        // Print to show it to the user.
        System.out.println("The total area of the triangle is: " + area);
        System.out.printf("The total area of the triangle is: %.2f\n" + area); 
    }
    
}
