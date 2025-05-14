package tarea5.pkg11;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ALUMNO2425
 */
public class Tarea511 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longitud;
        Scanner sc = new Scanner(System.in);

        System.out.println("LA CÁMARA SECRETA");
        System.out.print("Introduce la longitud de la combinación: ");
        longitud = sc.nextInt();

        int secreto[] = new int[longitud];
        generaAleatorios(secreto);

        int jugador[] = new int[longitud];
        muestraArray(jugador);

        while (!Arrays.equals(jugador, secreto)) {
            pistas(jugador, secreto);
            muestraArray(jugador);            
        }
        
        System.out.println("¡La combinación es correcta!");        
    }

    static void generaAleatorios(int a[]){        
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 5 + 1);
            System.out.println(a[i]);
        }
    }
    
    static void muestraArray(int a[]){
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("Introduce el número: ");
            a[i] = sc.nextInt();
        }
    }

    static void pistas(int jugador[], int secreto[]) {
        for (int i = 0; i < jugador.length; i++) {
            if (secreto[i] < jugador[i]) {
                System.out.println("La posición " + i + " el número " + 
                        jugador[i] + " es menor");
            } else if (secreto[i] > jugador[i]) {
                System.out.println("La posición " + i + " el número " + 
                        jugador[i] + " es mayor");
            } else {
                System.out.println("Es el mismo");
            }
        }
    }
}
