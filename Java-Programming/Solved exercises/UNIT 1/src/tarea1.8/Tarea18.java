package tarea1.pkg8;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea18 {

    /** Indicates to the user whether or not they are of legal age
     * with true or false. 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the variables.
        int age;
        boolean m_age;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down the 
        // age.
        System.out.print("Write your age: ");
        
        // This is the value that the user write and presses enter.
        age = sc.nextInt();
        
        // If is less than 18 it false if not is true.
        m_age = (age>=18);
        
        // Print to show it to the user.
        System.out.println("It's higher of age: " + m_age);
    }
    
}
