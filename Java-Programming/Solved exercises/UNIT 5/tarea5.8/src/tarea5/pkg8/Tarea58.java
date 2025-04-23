package tarea5.pkg8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ALUMNO2425
 */
public class Tarea58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[] = new int[5];
        int par[] = new int[0];
        int impar[] = new int[0];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduce un número: ");
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                par = Arrays.copyOf(par, par.length + 1);
                par[par.length - 1] = num[i];
            } else {
                impar = Arrays.copyOf(impar, impar.length + 1);
                impar[impar.length - 1] = num[i];
            }
        }

        System.out.println("Pares: " + Arrays.toString(par));
        System.out.println("Impares: " + Arrays.toString(impar));
    }

}
