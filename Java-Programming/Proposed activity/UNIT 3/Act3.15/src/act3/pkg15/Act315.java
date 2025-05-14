package act3.pkg15;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act315 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas, ifact, jfact, ijfact, elem;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        filas = sc.nextInt();

        // i-> fila, j -> columna 
        // E (i,j) = i! / j!(i -j)!
        /* Dibujo el triángulo 
        for () -> filas
            calculo i
            for () -> columnas
                calculo j!
                calculo (i-j)!
                calculo pascal
         */
        
        for (int i = 0; i <= filas; i++) { // Filas
            // Calculo i! 
            ifact = 1;
            for (int pos = 1; pos <= i; pos++) {
                ifact *= pos;
            }

            for (int j = 0; j <= i; j++) { // Columnas
                // Calculo j!
                jfact = 1;
                for (int pos = 1; pos <= j; pos++) {
                    jfact *= pos;
                }
                
                // Calculo (i-j)!
                ijfact = 1;
                for (int pos = 1; pos <= i - j; pos++) {
                    ijfact *= pos;
                }
                
                // Calculo el valor del elemento
                elem = (ifact / (jfact * ijfact));
                System.out.print(elem);
            }
            System.out.println();
        }

    }

}
