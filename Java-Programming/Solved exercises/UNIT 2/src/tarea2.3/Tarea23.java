package tarea2.pkg3;

import java.util.Scanner;

/** Ask for two different numbers and show which one is the largest.
 *
 * @author Irene Frías Ramos
 */
public class Tarea23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("We will enter two numbers and say which "
                + "of them is greater.");
        
        System.out.print("Enter a number: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter another number: ");
        num2 = sc.nextInt();
        
        if (num1 < num2)
        {
            System.out.println(num1 + "is minor.");
        }
        else
        {
            System.out.println(num2 + "is older.");
        }
        
    }
    
}
