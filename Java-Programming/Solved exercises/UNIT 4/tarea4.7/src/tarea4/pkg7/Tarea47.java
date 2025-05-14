package tarea4.pkg7;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, n_divisores;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        
        n_divisores = esPrimo(num);
        System.out.println("Los divisores de " + num + " son " + n_divisores);
    }
    
    static int esPrimo(int num){
        int cont = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                cont++;
            }
        }
        return cont;
    }
    
}
