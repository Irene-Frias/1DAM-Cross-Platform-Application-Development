package act1.pkg19;

import java.util.Scanner;

/** A program that calculates the price of a ticket for adults and 
 * children. If the price is equal to or greater than 100, make a 5% discount.
 *
 * @author Irene Frías Ramos
 */
public class Act119 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the variables.
        double ticket_inf;
        int ticket_adult;
        double total, t_final;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down the 
        // a child ticket number.
        System.out.print("Write the number of childens tickets: ");
        
        // This is the value that the user write and presses enter.
        ticket_inf = sc.nextDouble();
        
        // To show the user what to do, in this case is to write down the 
        // a adults ticket number.
        System.out.print("Write the number of adults tickets: ");
        
        // This is the value that the user write and presses enter.
        ticket_adult = sc.nextInt();
        
        // Calculate the price of the ticket of adults and childrens.
        total = (ticket_inf * 15.50) + (ticket_adult * 20);
        t_final = (total >= 100) ? total : (total * 0.5);
        
        // Print to show it to the user.
        System.out.print("El importe de la taquilla es: " + t_final);
    }
    
}
