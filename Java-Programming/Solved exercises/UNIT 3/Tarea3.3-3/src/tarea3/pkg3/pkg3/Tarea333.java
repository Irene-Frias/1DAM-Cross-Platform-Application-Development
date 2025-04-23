package tarea3.pkg3.pkg3;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea333 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, resto, total;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Introduce un número positivo: ");
            num = sc.nextInt();
        } while (num < 0);
        
        total = 0;
        while (num > 0){
            // System.out.println("Num: " + num);
            
            resto = num % 10;
             System.out.println("Resto: " + resto);
            
            total = total * 10 + resto;
             System.out.println("Total: " + total);
            
            num = num / 10;
        }
        System.out.println(total);
        
        
    }
}
