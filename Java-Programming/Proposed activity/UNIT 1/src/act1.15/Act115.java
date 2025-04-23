package act1.pkg15;

import java.util.Scanner;

/** A program that asks for the values to get the equation
 * y = a² + bx + c
 * 
 * @author Irene Frías Ramos
 */
public class Act115 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the variables.
        int a, b, c, x;
        double y;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // Show to the user.
        System.out.print("Write down the values to get the equation "
        + "'y = a² + bx + c'");
        
        // To show the user what to do, in this case is to write down the 
        // quotient 'a'.
        System.out.print("Write the quotient 'a': ");
        
        // This is the value that the user write and presses enter.
        a = sc.nextInt();
        
        // To show the user what to do, in this case is to write down the 
        // quotient 'b'.
        System.out.print("Write the quotient 'b': ");
        
        // This is the value that the user write and presses enter.
        b = sc.nextInt();
        
        // To show the user what to do, in this case is to write down the 
        // quotient 'c'.
        System.out.print("Write the quotient 'c': ");
        
        // This is the value that the user write and presses enter.
        c = sc.nextInt();
        
        // To show the user what to do, in this case is to write down the 
        // quotient 'x'.
        System.out.print("Write the quotient 'x': ");
        
        // This is the value that the user write and presses enter.
        x = sc.nextInt();
        
        // Calculate the values that the equation.
        y = a*(Math.pow(x, 2)) + (b * x) + c;
        
        // Print to show it to the user.
        System.out.print("The value corresponding to 'y' is: " + y);
    }
    
}
