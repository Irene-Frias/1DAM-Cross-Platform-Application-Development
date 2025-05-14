package tarea1.pkg11;

import java.util.Scanner;

/** Calculate the annual profits of apples (2.35€) 
 * and pears (1.95€) per kilo being the fixed price.
 *
 * @author Irene Frías Ramos
 */
public class Tarea111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the variables.
        final double apple = 2.35;
            int apple1;
            int apple2;
            double t_apple;
        
        final double pera = 1.95;
            int pear1;
            int pear2;
            double t_pera;

        double total;
        
         // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down 
        // the first term. (apple)
        System.out.print("Answer the price of apple first term: ");
        
        // This is the value that the user write and presses enter.
        apple1 = sc.nextInt();
        
        // To show the user what to do, in this case is to write down 
        // the second term. (apple)
        System.out.print("Answer the price of apple second term: ");
        
        // This is the value that the user write and presses enter.
        apple2 = sc.nextInt();
        
        // To show the user what to do, in this case is to write down 
        // the first term. (pear)
        System.out.print("Answer the price of peras first term: ");
        // This is the value that the user write and presses enter.
        pear1 = sc.nextInt();
        
        // To show the user what to do, in this case is to write down 
        // the second term. (pear)
        System.out.print("Answer the price of peras second term: ");
        pear2 = sc.nextInt();
        
        // Calculate the total annual benefits of apples and pears. 
        t_apple = (apple1 + apple2) * apple;
        t_pera = (pear1 + pear2) * pera;
        total = (t_apple + t_pera);
       
        // Print to show it to the user.
        System.out.println("Total result of apple and peras: " + total);
    }
    
}
