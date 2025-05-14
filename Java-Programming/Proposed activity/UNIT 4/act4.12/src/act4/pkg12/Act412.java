package act4.pkg12;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act412 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1, x2, y1, y2, distancia;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Introduce los puntos siguientes");
        
        System.out.print("x1 -> ");
        x1 = sc.nextInt();
        
        System.out.print("y1 -> ");
        y1 = sc.nextInt();
        
        System.out.print("x2 -> ");
        x2 = sc.nextInt();
        
        System.out.print("y2 -> ");
        y2 = sc.nextInt();
        
        distancia = distancia(x1, y1, x2, y2);
        
        System.out.println("La distancia total que separa los puntos es: " 
                + distancia);
    }
    
    static double distancia (double x1, double y1, double x2, double y2){
        double t_distancia;
        t_distancia = Math.sqrt(Math.pow(x1, 2) - Math.pow(x2, 2) +
                Math.pow(y1, 2) - Math.pow(y2, 2));
        
        return t_distancia;
    }
}
