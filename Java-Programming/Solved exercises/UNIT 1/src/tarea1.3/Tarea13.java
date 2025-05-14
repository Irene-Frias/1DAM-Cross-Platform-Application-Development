package tarea1.pkg3;

import java.util.Scanner;

/** Ask the user for their age and show how old they will be next year.
 *
 * @author Irene Frías Ramos
 */
public class Tarea13 {

    
    public static void main(String[] args) {
        // Start the value.
        int age;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down the age.
        System.out.print("Write your age: ");
        
        // This is the value that the user write and presses enter.
        age = sc.nextInt();
        
        // The age that the user give more one. 
        age++;
        
        // Result that shows the user.
        System.out.println("Here's how old you'll be next year: " + age);
        
    }
    
}
