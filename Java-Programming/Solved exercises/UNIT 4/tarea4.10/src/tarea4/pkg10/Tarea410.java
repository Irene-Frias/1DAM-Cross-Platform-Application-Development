package tarea4.pkg10;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea410 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número positivo: ");
        a = sc.nextInt();
        System.out.print("Introduce el exponente: ");
        n = sc.nextInt();
        
        System.out.println("La potencia es " + calcularPotencia(a,n));
    }
    static int calcularPotencia(int a, int n){
        if (n == 0) {
            return 1;
        } else {
            return a * calcularPotencia(a, n - 1);
        }
    }
    
}
