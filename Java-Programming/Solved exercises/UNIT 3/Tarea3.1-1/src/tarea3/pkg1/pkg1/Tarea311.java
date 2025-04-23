package tarea3.pkg1.pkg1;

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
        double num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número positivo: ");
        num = sc.nextDouble();
        
        while (num != 0){       
            if (num > 0){
                if (num % 2 == 0){
                System.out.println("Es par");
                } else {
                System.out.println("Es impar");
                }
                num = Math.pow(num, 2);
                System.out.println("El número al cuadrado es: " + num);
            }
            System.out.println("Introduce un número positivo: ");
            num = sc.nextDouble();
        }       
    }    
}
