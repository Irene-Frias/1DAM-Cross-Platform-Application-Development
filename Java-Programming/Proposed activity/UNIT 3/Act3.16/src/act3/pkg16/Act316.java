package act3.pkg16;

import java.util.Scanner;
/**
 *
 * @author Irene Frías Ramos
 */
public class Act316 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios para centrar el triángulo
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Imprimir los asteriscos de la fila
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Nueva línea al final de cada fila
        }
    }
}
