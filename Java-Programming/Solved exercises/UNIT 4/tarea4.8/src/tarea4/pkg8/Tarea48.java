package tarea4.pkg8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, operacion, total;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduce un número: ");
        num1 = sc.nextDouble();
        
        System.out.println("Selecciona el tipo de operación: "
                + "\n 1 - Suma \n 2 - Resta \n 3 - Multiplicación "
                + "\n 4 - División");
        System.out.print("Tipo de operación: ");
        operacion = sc.nextDouble();
        
        System.out.print("Introduce otro número: ");
        num2 = sc.nextDouble();
   
        total = calculadora(num1, num2, (int) operacion);
        System.out.println("El resultado de " + num1 + " y " + num2 + 
                " es " + total);
    }

    static double calculadora(double num1, double num2, int operacion) {
        double total = 0;
        switch (operacion) {
            case 1 -> { // Suma
                total = num1 + num2;
            }
            case 2 -> { // Resta
                total = num1 - num2;
            }
            case 3 -> { // Multiplicación
                total = num1 * num2;
            }
            case 4 -> { // División
                total = num1 / num2;
            }
            default -> { 
                System.out.println("La operación ni es válida");
            }        
        }
        return total;
    }
}
