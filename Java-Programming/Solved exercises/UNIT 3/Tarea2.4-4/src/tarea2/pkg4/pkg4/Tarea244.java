package tarea2.pkg4.pkg4;

import java.util.Scanner;
        
/**
 *
 * @author Irene
 */
public class Tarea244 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;
        boolean resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        n1 = sc.nextInt();
        
        System.out.print("Introduce un número: ");
        n2 = sc.nextInt();
        
        resultado = n1 % n2 == 0 ? true : false;
        System.out.println("¿Son múltiplos? " + resultado);
    }
    
}
