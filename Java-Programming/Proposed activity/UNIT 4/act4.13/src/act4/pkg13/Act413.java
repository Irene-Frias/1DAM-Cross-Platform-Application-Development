package act4.pkg13;

import java.util.Scanner;

/**
 *
 * @author ALUMNO2425
 */
public class Act413 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, cantidadPares;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        n = sc.nextInt();

        cantidadPares = muestrapares(n);
        System.out.println("\nLa cantidad de números pares son: " + cantidadPares);
    }

    static int muestrapares(int n){
        int pares = 0;
        
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
                pares++;
            } 
        }
        
        return pares;
    }
}
