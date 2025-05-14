package act1.pkg11;

import java.util.Scanner;

/** Request the base and VAT data so that it shows the total 
 * corresponding to VAT.
 *
 * @author Irene Frías Ramos
 */
public class Act111 {

    
    public static void main(String[] args) {
        // Start the variables.
        int base;
        int vat;
        double total;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down the 
        // base.
        System.out.print("Write the base number: ");
        
        // This is the value that the user write and presses enter.
        base = sc.nextInt();
        
        // To show the user what to do, in this case is to write down the 
        // vat.
        System.out.print("Write the IVA number: ");
        
        // This is the value that the user write and presses enter.
        vat = sc.nextInt();
        
        // Calcule  the total corresponding to VAT.
        total = (base * vat / 100);
        
        // Print to show it to the user.
        System.out.println("Total: " + total);
    }
    
}
