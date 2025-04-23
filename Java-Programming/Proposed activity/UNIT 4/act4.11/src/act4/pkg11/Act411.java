package act4.pkg11;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act411 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduce un número: ");
        radio = sc.nextDouble();
        mostrarSuperficieVolumen(radio);   
    }
    
    static void mostrarSuperficieVolumen(double radio){
        double superficie = superficie(radio);
        double volumen = volumen(radio);   
        System.out.println("La superficie de una esfera es: " + superficie);
        System.out.println("El volumen de una esfera es: " + volumen);
    }
    
    static double superficie(double radio){
        double superficie;
        superficie = 4*Math.PI * Math.pow(radio, 2);
        return superficie;
    }
    
    static double volumen(double radio){
        double volumen;
        volumen = (4*Math.PI / 3) * Math.pow(radio, 3);
        return volumen;
    }
    
}
