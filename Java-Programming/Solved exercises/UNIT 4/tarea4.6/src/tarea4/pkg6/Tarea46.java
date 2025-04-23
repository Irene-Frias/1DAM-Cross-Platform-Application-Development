package tarea4.pkg6;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        boolean resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        
        resultado = esPrimo(n);
        System.out.println("¿El número " + n + " es primo? " + resultado);
    }
    
    static boolean esPrimo(int n){
        boolean resultado;
        if (n % 2 == 0){
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}
