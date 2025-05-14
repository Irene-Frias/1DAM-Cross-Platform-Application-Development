package act1.pkg13;

import java.util.Scanner;

/** Indicates the amount that must be added to 'n' to make it a multiple of 'm'.
 *
 * @author Irene Frías Ramos
 */
public class Act113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        // Start the variables.
        int n;
        int m;
        int result;
        int multip;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down the 
        // 'n' number.
        System.out.print("Write the number (n): ");
        
        // This is the value that the user write and presses enter.
        n = sc.nextInt();
        
        // To show the user what to do, in this case is to write down the 
        // 'm' number.
        System.out.print("Write the number (m): ");
        
        // This is the value that the user write and presses enter.
        m = sc.nextInt();
        
        // Calculate the amount to be added.
        result = n % 7;
        multip = (m - result) % m;
        
        // Print to show it to the user.
        System.out.println("This is the amount that must be added to "
                + "'n' to make it a multiple of 'm': " + multip);
    }
    
}
