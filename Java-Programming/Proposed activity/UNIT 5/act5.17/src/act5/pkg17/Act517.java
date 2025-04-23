package act5.pkg17;

import java.util.Arrays;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act517 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {10, 1, 5, 8, 9, 2};
        int resultado[] = suma(array, 3);
        
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(resultado));
    }

    static int[] suma(int t[], int numElementos) {
        int resultado[] = new int[t.length - numElementos + 1];

        for (int i = 0; i <= t.length - numElementos; i++) {
            
            int suma = 0;            
            for (int j = 0; j < numElementos; j++) {
                suma += t[i + j];
            }
            resultado[i] = suma;
        }

        return resultado;
    }

}
