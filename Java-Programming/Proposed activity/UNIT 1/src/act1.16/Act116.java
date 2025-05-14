package act1.pkg16;

import java.util.Scanner;

/** The user enters the data in seconds and displays it in hours, 
 * minutes and seconds
 *
 * @author Irene Frías Ramos
 */
public class Act116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the values.
        int hours, min, seg;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down the 
        // seconds.
        System.out.print("Introduce una cantidad en segundos: ");
        
        // This is the value that the user write and presses enter.
        seg = sc.nextInt();
        
        // Calculate it in hours, minutes and seconds.
        hours = seg / 3600;
        min = (seg % 3600) / 60;
        seg = hours % 60;
        
         // Print to show it to the user.
        System.out.println("The number in second is: " + hours + " hours "
                + min + " minutes " + seg +" seconds.");
    }
    
}
