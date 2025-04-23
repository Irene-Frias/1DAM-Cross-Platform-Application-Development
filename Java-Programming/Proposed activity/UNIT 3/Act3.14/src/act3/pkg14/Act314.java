package act3.pkg14;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act314 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, contPrimos;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número n: ");
        n = sc.nextInt();
        
        contPrimos = 0;
        for (int i = 1; i <= n; i++) {
            boolean esPrimo = true;

            if (i <= 1) { // Los números menores o iguales a 1 no son primos
                esPrimo = false; 
            } else { // Si encontramos un divisor, no es primo
                for (int j = 2; j < i; j++) { 
                    if (i % j == 0) {
                        esPrimo = false;
                    }
                }
            }

            if (esPrimo) {
                System.out.println(i + " primo");
                contPrimos++;
            } else {
                System.out.println(i + " no primo");
            }
        }

        System.out.println("Resultan un total de " + contPrimos + 
                " números primos.");
    }
    
}
