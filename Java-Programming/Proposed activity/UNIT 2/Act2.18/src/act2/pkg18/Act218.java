package act2.pkg18;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act218 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, operacion, resultado, correcto, respuesta;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        num1 = random.nextInt(99) + 1;
        num2 = random.nextInt(99) + 1;
        
        operacion = random.nextInt(3);
        correcto = 0;
        String simboloOperacion = "";
        
        switch (operacion) {
            case 0: // Suma
                simboloOperacion = "+";
                correcto = num1 + num2;
                break;
            case 1: // Resta
                simboloOperacion = "-";
                correcto = num1 - num2;
                break;
            case 2: // Multiplicación
                simboloOperacion = "*";
                correcto = num1 * num2;
                break;
        }
        
        System.out.println("Realiza la siguiente operación:");
        System.out.println(num1 + " " + simboloOperacion + " " + num2 + " = ?");
        

        respuesta = sc.nextInt();
        
        if (respuesta == correcto) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La respuesta correcta es: "
                    + correcto);
        }
    }
    
}
