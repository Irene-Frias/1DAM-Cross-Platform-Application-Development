package tarea3.pkg15;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea315 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        
        for (int i = n; i >= 1; i--) { // i -> Filas
            for (int j = 1; j <= i; j++) { // j -> Columnas
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
