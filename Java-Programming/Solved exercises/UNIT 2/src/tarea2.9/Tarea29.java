package tarea2.pkg9;

import java.util.Scanner;

/** Show on the screen how many digits a number has per keypad.
 *
 * @author Irene Frías Ramos
 */
public class Tarea29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número entre 0 y 99999: ");
        num = sc.nextInt();
        
        if (num < 0 || num > 99999)
        {
            System.out.println("The number is invalid.");
        }
        
        else if (num < 10)
        {
            System.out.println("It has a figure.");
        }
        else if (num < 100)
        {
            System.out.println("He has two figures.");
        }
        else if (num < 1000)
        {
            System.out.println("He has three figures.");
        }
        else if (num < 10000)
        {
            System.out.println("He has four figures.");
        }
        else if (num < 10000)
        {
            System.out.println("He has five figures.");
        }
    }
    
}
