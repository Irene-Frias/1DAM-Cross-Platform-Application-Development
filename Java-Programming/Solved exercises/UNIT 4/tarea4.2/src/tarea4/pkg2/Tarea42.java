package tarea4.pkg2;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, mayor, menor;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        num1 = sc.nextInt();
        
        System.out.print("Introduce otro número: ");
        num2 = sc.nextInt();

        comprendidos(num1, num2);
    }
    
    static void comprendidos(int num1, int num2){
        int mayor = (num1 > num2) ? num1 : num2;
        int menor = (num1 < num2) ? num1 : num2;
        
        for (int i = menor; i <= mayor; i++){
            System.out.println(i);
        }
    }
}
