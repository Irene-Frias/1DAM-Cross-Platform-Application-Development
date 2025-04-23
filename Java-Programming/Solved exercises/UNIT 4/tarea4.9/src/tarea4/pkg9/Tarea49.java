package tarea4.pkg9;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, max;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        num1 = sc.nextInt();
        
        System.out.print("Introduce otro número: ");
        num2 = sc.nextInt();
        
        System.out.print("Introduce otro número: ");
        num3 = sc.nextInt();
        
        max = maximo(num1, num2, num3);
        System.out.println("El máximo de " + num1 + ", " + num2 + " y de "
                + num3 + " es: " + max);
    }
    
    static int maximo(int num1, int num2, int num3){
        int max;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }
        return max;
    }
    
}
