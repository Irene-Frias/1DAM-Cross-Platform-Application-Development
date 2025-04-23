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
        int num1, num2, respuesta;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        // Números entre el 1 y 99
        num1 = random.nextInt(99) + 1; 
        num2 = random.nextInt(99) + 1;
        
        System.out.println("Suma los siguientes números:");
        System.out.println(num1 + " + " + num2 + " = ?");
        
        respuesta = sc.nextInt();
        
        int sumaCorrecta = num1 + num2;
        
        if (respuesta == sumaCorrecta) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La respuesta correcta es: " + sumaCorrecta);
        }
    }
    
}
