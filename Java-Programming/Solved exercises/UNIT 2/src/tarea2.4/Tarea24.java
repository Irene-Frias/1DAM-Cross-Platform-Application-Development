package tarea2.pkg4;

import java.util.Scanner;

/** Indicate if a number is near-zero, which are those that are positive, 
 * negative, or close to 0 by less than 1 unit.
 *
 * @author Irene Frías Ramos
 */
public class Tarea24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        num = sc.nextDouble();
        
        if (num != 0 && num > -1 && num < 1)
        {
            System.out.println("It's an almost-zero number.");
        }
        else
        {
            System.out.println("It's not a near-zero number.");
        }
    }
    
}
