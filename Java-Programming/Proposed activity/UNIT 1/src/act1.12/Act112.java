package act1.pkg12;

import java.util.Scanner;

/** That shows an integer and indicates the amount so that 
 * it is a multiple of 7.
 *
 * @author Irene Frías Ramos
 */
public class Act112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new scanner.
        int num;
        int result;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down the 
        // number.
        System.out.print("Write a number: ");
        
        // This is the value that the user write and presses enter.
        num = sc.nextInt();
        
        // Calculate the number of if is a multiple of 7.
        result = 7 - num % 7;
        // I double-check the result number if it's a multiple of 7.
        result = result % 7;
        
        // Print to show it to the user.    
        System.out.println("The result is multiple of 7: " + result);
    }
    
}
