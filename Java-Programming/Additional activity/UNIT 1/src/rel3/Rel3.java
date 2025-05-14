package rel3;

import java.util.Scanner;
import java.util.Locale;

/** 
Make a converter from pesetas to euros. 
* The amount of pesetas that you want to convert must be entered by keyboard.
 *
 * @author Irene Frías Ramos
 */
public class Rel3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double euros, convert;
        final double pesetas = 166.386;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Write an amout in pesetas: ");
        euros = sc.nextDouble();
        
        convert = euros / pesetas;
        System.out.println("The amount of pesetas to euros is: " + convert); 
    }
    
}
