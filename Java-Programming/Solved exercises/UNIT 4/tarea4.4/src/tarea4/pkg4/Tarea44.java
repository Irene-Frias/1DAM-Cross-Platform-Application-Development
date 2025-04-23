package tarea4.pkg4;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, max;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        num1 = sc.nextInt();
        
        System.out.print("Introduce otro número: ");
        num2 = sc.nextInt();
        
        max = maximo(num1, num2);
        System.out.println("El máximo de " + num1 + " y de " + num2 + 
                " es: " + max);
    }
    
    static int maximo(int num1, int num2){
        int max;
        if (num1 > num2){
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }    
}
