package act1.pkg18;

import java.util.Scanner;

/** A program that calculates the total legs of ant 
 * species (6 legs), ants (8 legs), and mealybugs (14 legs).
 *
 * @author Irene Frías Ramos
 */
public class Act118 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the variables.
        int ant, spider, coch, legs;
        
        Scanner sc = new Scanner(System.in);
        
        // Show to the user.
        System.out.print("Calcularemos el número de patas de diferentes "
                + "especies de invertebrados.");
        
        // To show the user what to do, in this case is to write down the 
        // a number of ants.
        System.out.print("Write the number of ants: ");
        
        // This is the value that the user write and presses enter.
        ant = sc.nextInt();
        
        // To show the user what to do, in this case is to write down the 
        // a number of spider.
        System.out.print("Write the number of spiders: ");
        
        // This is the value that the user write and presses enter.
        spider = sc.nextInt();
        
        System.out.print("Write the number of cochineal: ");
        
        // This is the value that the user write and presses enter.
        coch = sc.nextInt();
        
        // Calculate the number of legs
        legs = (ant * 6) + (spider * 8) + (coch * 14);
        
        // Print to show it to the user.
        System.out.println("The total number of legs of the species is: " + legs);
    }
    
}
