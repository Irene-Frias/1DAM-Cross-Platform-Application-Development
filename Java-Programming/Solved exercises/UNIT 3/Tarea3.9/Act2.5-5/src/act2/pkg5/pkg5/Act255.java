package act2.pkg5.pkg5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act255 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio, entradasVendidas, totalRecaudado, precioFinal;
        int aforoMaximo;
        final double porcentaje20 = 0.2;
        final double porcentaje50 = 0.5;
        final double descuento = 0.25;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); 

        System.out.println("Introduce el aforo máximo del local: ");
        aforoMaximo = sc.nextInt();

        System.out.println("Introduce el precio de la entrada: ");
        precio = sc.nextDouble();

        System.out.println("Introduce el número de entradas vendidas: ");
        entradasVendidas = sc.nextDouble();

        if (entradasVendidas <= (porcentaje20 * aforoMaximo)) {
            System.out.println("Se cancela el concierto, no se ha vendido el "
                    + "20% del aforo.");
        } 
       
        else if (entradasVendidas <= (porcentaje50 * aforoMaximo)) {
            precioFinal = precio * (1 - descuento);
            totalRecaudado = precioFinal * entradasVendidas;
            System.out.println("Se aplica una rebaja del 25% en el precio "
                    + "de la entrada.");
            System.out.println("Total recaudado con la rebaja: " 
                    + totalRecaudado);
        }
        
        else {
            totalRecaudado = precio * entradasVendidas;
            System.out.println("Total recaudado sin rebaja: " 
                    + totalRecaudado);
        }
    }
}
