package tarea4.pkg3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double altura, radio, volumen, area;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Introduce la altura del cilindro: ");
        altura = sc.nextInt();
                
        System.out.println("Introduce el radio del cilindro: ");
        radio = sc.nextInt();
        
        volumen = volumen(radio, altura);
        System.out.println(volumen);
        
        area = area(radio, altura);
        System.out.println(area);
    }
    
    static double area(double radio, double altura){
        double area;
        area = 2 * Math.PI * radio * (altura + radio);
        return area;
    }
    
    static double volumen(double radio, double altura){
        double volumen;
        volumen = Math.PI * Math.pow(2,radio) * altura;
        return volumen;
    }
    
}
