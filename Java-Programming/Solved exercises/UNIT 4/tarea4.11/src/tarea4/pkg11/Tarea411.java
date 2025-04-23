package tarea4.pkg11;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea411 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        a = sc.nextInt();
        
        System.out.println("Introduce otro número: ");
        b = sc.nextInt();
        
        System.out.println("El máximo común divisor es: " + mcd(a, b));
    }
    
    static int mcd(int a, int b){
        int min, max;
        if (b == 0){
            return a;
        } else if (a == 0){
            return b;
        } else {
            min = a >= b ? a : b;
            max = b > a ? a : b;
            return mcd(min, max - min);
        }
    }
}
