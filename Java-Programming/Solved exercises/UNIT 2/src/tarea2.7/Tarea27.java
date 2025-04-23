package tarea2.pkg7;

import java.util.Scanner;

/** Ask for three numbers and show them from highest to lowest.
 *
 * @author Irene Frías Ramos
 */
public class Tarea27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter another number: ");
        num2 = sc.nextInt();
        
        System.out.println("Enter another number: ");
        num3 = sc.nextInt();
        
        if (num1 > num2 && num2 > num3)
        {
            System.out.println(num1 + "," + num2 + "," + num3);
        }
        else if (num2 > num1 && num1 > num3)
        {
            System.out.println(num2 + "," + num1 +"," + num3);
        }
        else if (num2 > num3 && num3 > num1)
        {
            System.out.println(num2 + "," + num1 +"," + num3);
        }
        else if (num1 > num3 && num3 > num2)
        {
            System.out.println(num1 + "," + num3 +"," + num2);
        }
        else if (num3 > num1 && num1 < num2)
        {
            System.out.println(num3 + "," + num1 + "," + num2);
        }
        else if (num3 > num2 && num2 < num1)
        {
            System.out.println(num3 + "," + num1 + "," + num2);
        }
        
    }
    
}
