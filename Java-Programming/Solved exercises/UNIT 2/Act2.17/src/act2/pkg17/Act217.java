package act2.pkg17;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, total;
        String resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Se realizará la suma de dos números. "
                + "Deberá estar comprendidos entre 1 y 99.");
        
        num1 = (int)(Math.random()*99 + 1);
        num2 = (int)(Math.random()*99 + 1);
        
        System.out.println("Suma los siguientes números: " + num1 +
                " y " + num2);
        
        System.out.println("Introduce el resultado: ");
        total = sc.nextInt();
        
        System.out.println("Introduce el resultado total de la "
                + "suma: " + total);
        
        resultado = num1 + num2 == total ? "Correcto" : "Incorrecto";
        System.out.println("El resultado es: " + resultado);
    }
    
}
