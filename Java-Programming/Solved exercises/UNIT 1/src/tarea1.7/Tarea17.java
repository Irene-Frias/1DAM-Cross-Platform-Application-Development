package tarea1.pkg7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea17 {

    /** Calculate the area and length of a circle with decimals.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the variables.
        double length;
        double radio;
        double area;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // Scanner-specific settings.
        sc.useLocale(Locale.US);
        
        // To show the user what to do, in this case is to write down the 
        // radio.
        System.out.print("Write the radio: ");
        
        // This is the value that the user write and presses enter.
        radio = sc.nextDouble();
        
        // Calculate the area and length of the circle.
        area = Math.PI * Math.pow(radio, 2);
        length = 2 * Math.PI * radio;
        
        // Print to show it to the user.
        System.out.println("Result area circle: " + area);
        System.out.println("Result length circle: " + length);
    }
    
}
