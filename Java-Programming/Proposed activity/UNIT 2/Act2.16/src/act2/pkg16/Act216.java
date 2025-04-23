package act2.pkg16;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act216 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, abs;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        
        abs = (num < 0) ? -num : num;
        System.out.println("El valor absoluto de " + num + " es: " + abs);
    }
    
}
