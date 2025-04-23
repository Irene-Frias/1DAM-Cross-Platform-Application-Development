package act2.pkg15;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act215 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base, altura, area;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Introduce un número real para calcular "
                + "el área de un triángulo.");
        
        System.out.print("Introduce la base: ");
        base = sc.nextDouble();
        
        System.out.print("Introduce la altura: ");
        altura = sc.nextDouble();
        
        if (base <= 0 || altura <= 0)
        {
            System.out.println("En la base o altura ha introducido "
                    + "un número negativo.");
        }
        else 
        {
            area = (base * altura) / 2;
            System.out.println("El área del triángulo es: " + area);
        }
    }
    
}
