package Rel10;

import java.util.Scanner;
import java.util.Locale;

/** Make a converter from Mb to Kb.
 *
 * @author Irene Frías Ramos
 */
public class Rel10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Mb, Kb;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
               
        System.out.print("Write a number in this measurement Mb: ");
        Mb = sc.nextDouble();
        
        Kb = Mb * 1024;
        System.out.println("The measurement of the number in Mb to "
                + "Kb is: " + Kb);
    }
    
}
