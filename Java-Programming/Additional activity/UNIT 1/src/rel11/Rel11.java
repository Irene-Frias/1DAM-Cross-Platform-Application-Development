package rel11;

import java.util.Scanner;
import java.util.Locale;

/** Make a Kb to Mb converter.
 *
 * @author Irene Frías Ramos
 */
public class Rel11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Mb, Kb;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
               
        System.out.print("Write a number in this measurement Mb: ");
        Kb = sc.nextDouble();
        
        Mb = Kb / 1024;
        System.out.println("The measurement of the number in Mb to "
                + "Kb is: " + Mb);
    }
    
}
