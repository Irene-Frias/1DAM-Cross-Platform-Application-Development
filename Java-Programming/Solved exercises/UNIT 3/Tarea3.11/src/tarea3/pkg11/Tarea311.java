package tarea3.pkg11;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea311 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        num = sc.nextInt();
        
        num = 1;
        double factorial = 0;
        for (int i = num; i > 0; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
    
}
