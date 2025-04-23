package tarea1.pkg9;

import java.util.Scanner;

/** It asks the user for a Boolean number and shows if the number is par.
 *
 * @author Irene Frías Ramos
 */
public class Tarea19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the variables.
        int num;
        boolean par;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down the 
        // a boolean number.
        System.out.print("Write a boolean number: ");
        
        // This is the value that the user write and presses enter.
        num = sc.nextInt();
        
        // Calculate if the number is par.
        par = (num%2) == 0;
        
        // Print to show it to the user.
        System.out.println("The number is par: " + par);
    }
    
}
