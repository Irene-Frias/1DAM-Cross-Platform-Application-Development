package tarea2.pkg1;

import java.util.Scanner;

/** Ask for a number and say if it's odd or even.
 *
 * @author Irene Frías Ramos
 */
public class Tarea21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        if (num % 2 == 0)
        {
            System.out.println("It's even.");
        }
        
        /* if (num % 2 != 0)
        {
            System.out.println("It's odd.");
        } 
        */
        
        else
        {
            System.out.println("It's odd.");
        }
    }
    
}
