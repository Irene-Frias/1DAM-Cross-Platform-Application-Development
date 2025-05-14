package act2.pkg19;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act219 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double grados, num, radianes;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduce un grado de un ángulo: ");
        num = sc.nextDouble();
        
        grados = num % 360;
        
        if (grados < 0){
            System.out.println("El ángulo se encuentra en el rango de "
                    + "0º a 360º ");
            
            grados += 360;
            System.out.println("El número introducido " + num + " tiene un "
                + "ángulo de " + grados + "º");
        }
        else {
            radianes = Math.toRadians(grados);
            
            System.out.println("No se encuentra en el rango de 0º a 360º");
            System.out.println("El número introducido " + num + " es equivalente a "
                + grados + " en radianes");
        }       
    }
    
}
