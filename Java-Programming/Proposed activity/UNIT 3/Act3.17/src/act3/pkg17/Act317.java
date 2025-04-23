package act3.pkg17;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act317 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, menor, mcd;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        a = sc.nextInt();
        
        System.out.print("Introduce otro número: ");
        b = sc.nextInt();
        
        menor = (a < b) ? a : b;
        mcd = menor;
        
        for (int i = menor; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                mcd = i; 
                break; 
            }
        }

        System.out.println("Máximo Común Divisor de " + a + " y " + b + " es: "
                + mcd);
    }
    
}
