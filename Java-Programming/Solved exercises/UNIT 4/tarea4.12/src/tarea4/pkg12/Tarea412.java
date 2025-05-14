package tarea4.pkg12;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea412 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        
        System.out.println("Resultado de Fibonacci: " + fibonacci(n));
    }
    
    static int fibonacci(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }
}
