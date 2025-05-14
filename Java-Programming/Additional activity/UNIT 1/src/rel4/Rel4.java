package rel4;

import java.util.Scanner;
import java.util.Locale;

/** 
Write a program that adds, subtracts, multiplies 
* and divides two numbers entered by keyboard.
 *
 * @author Irene Frías Ramos
 */
public class Rel4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num, num2, sum, sub, mult, div;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Write a number: ");
        num = sc.nextDouble();
        
        System.out.print("Write another number: ");
        num2 = sc.nextDouble();
        
        sum = num + num2;
        System.out.println("The sum of the two numbers is: " + sum);
        
        sub = num - num2;
        System.out.println("The subtraction of the two numbers is: " + sub);
        
        mult = num * num2;
        System.out.println("The multiplication of the two numbers is: " + mult);
        
        div = num / num2;
        System.out.println("The division of the two numbers is: " + div);
    }
    
}
