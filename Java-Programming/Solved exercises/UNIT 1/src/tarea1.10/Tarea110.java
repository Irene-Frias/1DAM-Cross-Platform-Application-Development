package tarea1.pkg10;

import java.util.Scanner;

/** If it is raining and they have finished the tasks they can go out. 
 * Only if they have finished or it is not raining or the fact of going 
 * to the library. Using a boolean algorithm (true or false).
 *
 * @author Irene Frías Ramos
 */
public class Tarea110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new scanner.
        boolean rain;
        boolean final_act;
        boolean library;
        boolean go_out;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down true
        // or false.
        System.out.print("It's rainning (true or false): ");
        
        // This is the value that the user write and presses enter.
        rain = sc.nextBoolean();
        
        // To show the user what to do, in this case is to write down true
        // or false.
        System.out.print("It's you finish the homework (true or false): ");
        
        // This is the value that the user write and presses enter.
        final_act = sc.nextBoolean();
        
        // To show the user what to do, in this case is to write down true
        // or false.
        System.out.print("It's you have go to the library (true or false): ");
        
        // This is the value that the user write and presses enter.
        library = sc.nextBoolean();
        
        // If it rains or she can't go out and if she finishes homework 
        // or goes to the library.
        go_out = !(rain) && final_act || library;
        
        // Print to show it to the user.
        System.out.println("Final result: " + go_out);
    }
    
}
