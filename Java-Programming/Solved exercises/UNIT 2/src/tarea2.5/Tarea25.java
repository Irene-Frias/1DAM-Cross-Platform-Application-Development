package tarea2.pkg5;

import java.util.Scanner;

/** Ask for two numbers and show them in decreasing fashion.
 *
 * @author Irene Frías Ramos
 */
public class Tarea25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, highter, smaller;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter another number: ");
        num2 = sc.nextInt();
        
        highter = num1 > num2 ? num1 : num2;
        smaller = num1 < num2 ? num1 : num2;
        
        System.out.println("Highter: " + highter + "Smaller: " + smaller);
        
    }
    
}
