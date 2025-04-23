package act5.pkg13;

import java.util.Arrays;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act513 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t[] = {1, 2, 3, 4, 5, 6};
        int a[];
        
        System.out.println("Ordenado: " + Arrays.toString(t));
        a = desordenado(t);
        System.out.println("Desordenado: " + Arrays.toString(a));
    }

    static int[] desordenado(int t[]) {
        int copia[] = Arrays.copyOf(t, t.length);
        int posAlt, temp;
        for (int i = 0; i < copia.length; i++) {
            posAlt = (int) (Math.random() * copia.length);
            temp = copia[i];
            copia[i] = copia[posAlt];
            copia[posAlt] = temp;
        }
        return copia;
    }
}
