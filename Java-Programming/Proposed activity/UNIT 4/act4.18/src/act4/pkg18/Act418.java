package act4.pkg18;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act418 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad, min, max;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de números aleatorios a "
                + "generar: ");
        cantidad = sc.nextInt();
        
        System.out.print("Introduce el valor mínimo: ");
        min = sc.nextInt();
        
        System.out.print("Introduce el valor máximo: ");
        max = sc.nextInt();
        
        numAleatorio(max, min, cantidad);
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
