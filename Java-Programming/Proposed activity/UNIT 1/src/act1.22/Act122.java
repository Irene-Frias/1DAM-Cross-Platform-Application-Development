package act1.pkg22;

import java.util.Scanner;

/** Introduce the meters and pass them to centimeters with decimals.
 *
 * @author Irene Frías Ramos
 */
public class Act122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the variables.
        double m, cm;

        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down the 
        // the length in meters.
        System.out.print("Write the length of the throw in meters: ");
        
        // This is the value that the user write and presses enter.
        m = sc.nextDouble();
        
        // Calculate the meters to centimeters.
        cm = m * 100;
        cm = (int) cm;
        
        // Print to show it to the user.
        System.out.print("Length of the throw in centimeters is: " + cm);
    }
    
}
