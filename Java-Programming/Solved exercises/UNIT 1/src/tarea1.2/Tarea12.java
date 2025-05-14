package tarea1.pkg2;

import java.util.Scanner;

/** Write a program to ask for a number and show it on the console 
 *
 * @author Irene
 */
public class Tarea12 {

    
    public static void main(String[] args) {
        // Start the value.
        int num;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down 
        // a number.
        System.out.print("Write a number: " );
        
        //  This is the value that the user write and presses enter.
        num = sc.nextInt();
        
        // Print to show it to the user.
        System.out.println("This is your number: " + num);
    }
    
}
