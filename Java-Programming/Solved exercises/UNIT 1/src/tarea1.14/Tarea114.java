package tarea1.pkg14;

import java.util.Scanner;
import java.util.Locale;

/** A program that asks for a decimal number as the main 
 * input and shows it to you in it's entirety.
 *
 * @author Irene Frías Ramos
 */
public class Tarea114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the value.
        double dec;
        int ent;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // Set the locale to be used.
        sc.useLocale(Locale.US);
        
        // To show the user what to do, in this case is to write down 
        // a decimal number.
        System.out.print("Enter a decimal number: ");
        dec = sc.nextDouble();
        
        // Go from decimal number to whole (casting).
        ent = (int) (dec + 0.5);
        System.out.println("The whole number is: " + ent);
    }
    
}
