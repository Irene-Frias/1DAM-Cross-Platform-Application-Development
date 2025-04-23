package act3.pkg18;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act318 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, menor, mcm;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        a = sc.nextInt();

        System.out.print("Introduce otro número: ");
        b = sc.nextInt();

        menor = (a < b) ? a : b;

        mcm = menor;
        for (int i = a * b; i >= menor; i--) {
            if (i % a == 0 && i % b == 0) {
                mcm = i;
            }
        }
        System.out.println("Mínimo Común Múltiplo de " + a + " y " + b + " es: "
                + mcm);
    }

}
