package tarea3.pkg9;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, i;
        Scanner sc = new Scanner(System.in);
        
        num = 0;
        while (1 >= num && num <= 10){
            System.out.println("Introduce un número comprendido entre"
                    + " 1 y 10: ");
            num = sc.nextInt();
        }
        
        System.out.println("La tabla de multiplicar del " + num + " es: ");
        
        for (i=1; num<=10; i++){
            System.out.println(num + " x " + i + " = " + i*num);
        }
    }
    
}
