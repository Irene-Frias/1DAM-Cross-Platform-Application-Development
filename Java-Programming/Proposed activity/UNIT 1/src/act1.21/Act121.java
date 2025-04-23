package act1.pkg21;

import java.util.Scanner;

/** Asks for two numbers 'a' and 'b' if they are the same it 
 * has to show true and if not false
 *
 * @author Irene Frías Ramos
 */
public class Act121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new scanner.
        int a, b;
        boolean result;
                
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down the 
        // number 'a'.
        System.out.print("Write the number 'a': ");
        
        // This is the value that the user write and presses enter.
        a = sc.nextInt();
        
        // To show the user what to do, in this case is to write down the 
        // number 'b'.
        System.out.print("Write the number 'b': ");
        
        // This is the value that the user write and presses enter.
        b = sc.nextInt();
        
        // If they are the same, it has to show true and if not false.
        result = a == b ? true : false;
        
        // Print to show it to the user.
        System.out.println("Are both numbers the same? " + result);
    }
    
}
