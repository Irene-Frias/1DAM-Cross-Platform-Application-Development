package tarea2.pkg8;

import java.util.Scanner;

/** Solving the Second Degree Equation and show the result.
 *
 * @author Irene Frías Ramos
 */
public class Tarea28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c, d;
        double x1, x2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the quotient of 'a': ");
        a = sc.nextInt();
        
        System.out.println("Enter the quotient of 'b': ");
        b = sc.nextInt();
        
        System.out.println("Enter the quotient of 'c': ");
        c = sc.nextInt();
        
        d = (b * b - 4 * a * c);
        
        if (d < 0)
        {
            System.out.println("There are no real numbers.");
        }
        else 
        { 
            if (a == 0)
            {
                System.out.println("It is not a first-degree equation.");
            }
            else
            {
                x1 = (-b - Math.sqrt(d)/(2*a));
                x2 = (-b + Math.sqrt(d)/(2*a));
                
                System.out.println("Result 1: " + x1);
                System.out.println("Result 2: " + x2);
            }
    }
    
    }
}
