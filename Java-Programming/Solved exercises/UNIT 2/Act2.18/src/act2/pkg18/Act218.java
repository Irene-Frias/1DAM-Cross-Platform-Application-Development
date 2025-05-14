package act2.pkg18;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act218 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, total;
        String resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Se realizará la suma de dos números. "
                + "Deberá estar comprendidos entre 1 y 99.");
        
        num1 = (int)(Math.random()*99 + 1);
        num2 = (int)(Math.random()*99 + 1);
        
        num3 = (int)(Math.random()*3);
        switch (num3){
            case 0 -> {
                System.out.println("Introduce el resultado de "+ num1 + " + " + num2);
                total = sc.nextInt();
                
                resultado = num1 + num2 == total ? "Correcto" : "Incorrecto";
                System.out.println("El resultado es: " + resultado);
            }
            case 1 -> {
                System.out.println("Introduce el resultado de " + num1 + " - " + num2);
                total = sc.nextInt();
                
                resultado = num1 - num2 == total ? "Correcto" : "Incorrecto";
                System.out.println("El resultado es: " + resultado);
            }
            case 2 -> { 
                System.out.println("Introduce el resultado de " + num1 + " * " + num2);
                total = sc.nextInt();
                
                resultado = num1 * num2 == total ? "Correcto" : "Incorrecto";
                System.out.println("El resultado es: " + resultado);
            }
        }        
    }
    
}
