package act4.pkg16;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act416 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, primos;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        
        
        System.out.println("Los divisores primos de " + num + " son: ");
        primos = divisoresPrimos(num);
    }
    
    static int divisoresPrimos(int num){
        int cont = 0;
        
        for(int i = 1; i <= num; i++){
            if (num % i == 0 && esPrimo(i)){
                System.out.println(i);
            }
            cont++;
        }
        
        return cont;
    }
    
    static boolean esPrimo(int num){
        boolean primo;
        primo = num % 2 == 0;
        return primo;
    }
}
