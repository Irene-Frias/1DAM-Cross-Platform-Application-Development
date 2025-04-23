package act5.pkg14;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act514 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int encuestados;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce el número de personas encuestadas: ");
        encuestados = sc.nextInt();

        double sueldo[] = new double[encuestados];
        for (int i = 0; i < encuestados; i++) {
            System.out.print("Introduce el nivel de adquisitivo: ");
            sueldo[i] = sc.nextDouble();
        }

        System.out.println("Números introducidos creciente: "
                + Arrays.toString(sueldo));

        System.out.print("Números introducidos decreciente: \n");
        decreciente(sueldo);

        System.out.println("El sueldo máximo y mínimo: ");
        maxYmin(sueldo);

        media(sueldo, encuestados);
    }

    static void decreciente(double sueldo[]) {
        for (int i = sueldo.length - 1; i >= 0; i--) {
            System.out.println(sueldo[i] + " ");
        }
    }

    static void maxYmin(double sueldo[]) {
        double max = sueldo[0];
        double min = sueldo[0];

        for (int i = 1; i < sueldo.length; i++) {
            if (sueldo[i] > max) {
                max = sueldo[i];
            }
            if (sueldo[i] < min) {
                min = sueldo[i];
            }
        }

        System.out.println(max + " es el sueldo máximo");
        System.out.println(min + " es el sueldo mínimo");
    }

    static int media(double sueldo[], int cantidad) {
        double suma = 0;
        double total;

        for (int i = 0; i < sueldo.length; i++) {
            suma += sueldo[i];
        }

        total = suma / cantidad;
        System.out.println("La media de los sueldos es: " + total);

        return (int) total;
    }

}
