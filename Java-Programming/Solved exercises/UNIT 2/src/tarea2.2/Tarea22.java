package tarea2.pkg2;

import java.util.Scanner;

/** Ask for two whole numbers and say if they are the same or not.
 *
 * @author Irene Frías Ramos
 */
public class Tarea22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter another number: ");
        num2 = sc.nextInt();
        
        if (num1 == num2)
        {
            System.out.println("Both numbers are the same.");
        }
        else 
        {
            System.out.println("They are no different.");
        }
        
    }
    
}
