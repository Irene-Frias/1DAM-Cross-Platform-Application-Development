package tarea1.pkg12;

import java.util.Scanner;

/** Ask the user to enter a number to display the absolute value.
 *
 * @author Irene Frías Ramos
 */
public class Tarea112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the value.
        int abs_num;
        int num;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down 
        // the absolute value.
        System.out.print("Type a number to get the absolute value: ");
        
        //  This is the value that the user write and presses enter.
        num = sc.nextInt();
        
        // If the num it's less than 0 show num if not show -1.
        abs_num = (num < 0) ? num * (-1) : num;
        
        // Print to show it to the user.
        System.out.println("The absolute value is: " + abs_num);
    }
    
}
