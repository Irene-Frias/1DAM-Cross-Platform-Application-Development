package tarea2.pkg6;

import java.util.Scanner;

/** Add from task 2.3 that they are equal.
 *
 * @author Irene Frías Ramos 
 */
public class Tarea26 {

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
            System.out.println("It's equal");
        }
        else if (num1 > num2)
        {
            System.out.println(num1 + " is older " + num2);
        }
        else 
        {
            System.out.println(num2 + " is minor " + num1);
        }
    }
    
}
