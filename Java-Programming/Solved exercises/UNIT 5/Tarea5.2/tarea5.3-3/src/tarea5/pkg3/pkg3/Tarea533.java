package tarea5.pkg3.pkg3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ALUMNO2425
 */
public class Tarea533 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce los números que quieres del array: ");
        numero = sc.nextInt();
                
        int n[] = new int [numero];
        for (int i = 0; i < numero; i++) {
            System.out.print("Introduce un número: ");
            n[i] = sc.nextInt();
        }
        
        System.out.println(Arrays.toString(n) + "");
        
        int i = 0;
        int positivo = 0;
        int negativo = 0;
        while (i < numero) {
            if (n[i] > 0){
                positivo += n[i];
            } else {
                negativo += n[i];
            }
            
        }
        System.out.println("Números positivos: " + positivo);
        System.out.println("Números negativos: " + negativo);
    }
    
}
