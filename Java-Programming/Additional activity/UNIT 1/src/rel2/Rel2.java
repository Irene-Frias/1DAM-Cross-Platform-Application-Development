package rel2;

import java.util.Scanner;
import java.util.Locale;

/** Make a converter from euros to pesetas. 
 * The amount of euros to be converted must be entered by keyboard.
 *
 * @author Irene Frías Ramos
 */
public class Rel2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double euros, convert;
        final double pesetas = 166.386;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Write an amount in euros: ");
        euros = sc.nextDouble();
        
        convert = euros * pesetas;
        System.out.println("The amount of euros to pesetas is: " + convert);
    }
    
}
