package rel7;

import java.util.Scanner;
import java.util.Locale;

/** Write a program that calculates the total of an invoice from the tax base.
 *
 * @author Irene Frías Ramos
 */
public class Rel7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base, bill, f_bill;
        final double VAT = 0.21;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("");
        base = sc.nextDouble();
        
        bill = (base * VAT) / 100;
        f_bill = base + bill;
         System.out.println("The total of the invoice with VAT is: " + f_bill);
    }
    
}
