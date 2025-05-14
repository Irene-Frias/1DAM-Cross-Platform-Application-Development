package tarea3.pkg5;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, resultado;
        Scanner sc = new Scanner(System.in);

        do {
            num1 = (int)(Math.random()* 100 + 1);
            num2 = (int)(Math.random()* 100 + 1);
        
            System.out.println("A continuación aparecerán dos números, "
                    + "sumalos.");
            System.out.println(num1 + "+" + num2 + "= ");
            resultado = sc.nextInt();
            
            if (resultado == num1 + num2){
                System.out.println("¡Correcto!");
            } else {
                System.out.println("¡Incorrecto! Intenteló de nuevo");
                System.out.println(num1 + "+" + num2 + "= ");
                resultado = sc.nextInt();
            }
            
        }while (resultado == num1 + num2);
    }
    
}
