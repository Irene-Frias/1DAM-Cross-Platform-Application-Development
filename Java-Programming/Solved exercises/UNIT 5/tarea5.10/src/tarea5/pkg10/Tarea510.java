package tarea5.pkg10;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea510 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t[] = new int [8];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < t.length; i++) {
            System.out.print("Introduce un número: ");
            t[i] = sc.nextInt();            
        }
        System.out.print(Arrays.toString(t));
        System.out.println();
        
        t = eliminarMayores(t, 2);
        System.out.println(Arrays.toString(t));
    }
    
    static int[] eliminarMayores(int t[], int valor){
        int copia[] = Arrays.copyOf(t, t.length);
        
        int i = 0;
        while (i < copia.length) {
            if (copia[i] > valor) {
                copia[i] = copia[copia.length - 1];  
                copia = Arrays.copyOf(copia, copia.length - 1);
            } else {
                i++;
            }
        }
        return copia;
    }
}
