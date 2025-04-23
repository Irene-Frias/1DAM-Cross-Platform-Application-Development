package tarea1.pkg6;

import java.util.Scanner;

/** Calculate the average grade of two incoming grades giving the result in.
 *
 * @author Irene Frías Ramos
 */
public class Tarea16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the variables.
        int note1;
        int note2;
        double  medium;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down the 
        // first note.
        System.out.print("Write your first note: ");
        
        // This is the value that the user write and presses enter.
        note1 = sc.nextInt();
        
        // To show the user what to do, in this case is to write down the 
        // second note.
        System.out.print("Write your second note: ");
        
        // This is the value that the user write and presses enter.
        note2 = sc.nextInt();
        
        // Calculate the average of the grades.
        medium = (note1 + note2) / 2.0;
        
        // Print to show it to the user.
        System.out.println("Your total note is: " + medium);
    }
    
}
