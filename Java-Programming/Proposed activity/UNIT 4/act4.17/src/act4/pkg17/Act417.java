package act4.pkg17;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act417 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        a = sc.nextInt();

        System.out.print("Introduce otro número: ");
        b = sc.nextInt();

        numAmigos(a, b);
    }

    static int numAmigos(int a, int b) {
        int a_divisor, b_divisor, amigos;

        a_divisor = 0;
        b_divisor = 0;
        amigos = 0;
        for (int i = 1; i < a; i++) {
            a_divisor = a / i;
            b_divisor = b / i;
            amigos = a_divisor + b_divisor;
        }
        
        if (a_divisor == b_divisor) {
            System.out.println("Los números " + a + " y " + b
                    + " son amigos");
        } else {
            System.out.println("Los números " + a + " y " + b
                    + " no son amigos");
        }

        return amigos;
    }
}
