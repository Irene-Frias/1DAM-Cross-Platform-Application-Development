package tarea3.pkg8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        double num, media, suma;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        suma = 0;
        for (i=1; i<=10; i++){
            System.out.println("Introduce un número: ");
            num = sc.nextDouble();
            suma += num;
        }
        media = suma /10.0;
        System.out.println("La media es: " + media);
    }
    
}
