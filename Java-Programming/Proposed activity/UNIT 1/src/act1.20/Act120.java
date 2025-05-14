package act1.pkg20;

/** Prompts the user for a real number and calculates the 
 * square root without using any import.
 *
 * @author Irene Frías Ramos
 */
public class Act120 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the variables.
        double real;
        double square;
        
        // Create a new scanner.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        // To show the user what to do, in this case is to write down the 
        // real number.
        System.out.print("Write a real number: ");
        
        // This is the value that the user write and presses enter
        real = sc.nextDouble();
        
        // Calculate the values that the square.
        square = Math.sqrt(real);
        
        // Print to show it to the user.
        System.out.print("The square root is: " + square);
    }
    
}
