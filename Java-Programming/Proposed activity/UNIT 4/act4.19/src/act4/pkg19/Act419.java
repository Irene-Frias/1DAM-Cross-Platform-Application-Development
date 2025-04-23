package act4.pkg19;

import java.util.Scanner;

/**
 *
 * @author Irene
 */
public class Act419 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        //numAleatorios(0, 1, n);
    }

    static int numAleatorio(int min, int max, int cantidad){
        int aleatorio = 0; 
        
        for (int i = 0; i < cantidad; i++){
            aleatorio = (int) (Math.random()* (max - min + 1)) + min;
            System.out.println(aleatorio);
        }
        
        return aleatorio;
    }
}
