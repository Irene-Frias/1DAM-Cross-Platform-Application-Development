package rel1;

import java.util.Scanner;

/** Make a program that asks for two numbers and then
 * shows the result of their multiplication.
 *
 * @author Irene Frías Ramos
 */
public class Rel1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, num2, result;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Write a number: ");
        num = sc.nextInt();
        
        System.out.print("Write another number: ");
        num2 = sc.nextInt();
        
        result = num * num2;
        System.out.println("The result of their multiplication is: " + result);
    }
    
}
