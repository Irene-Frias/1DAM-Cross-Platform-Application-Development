package act5.pkg20;

import java.util.Arrays;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act520 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {1, 4, 6, 8};
        int b[] = {5, 9, 2, 3};
        int resultado[];

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println();

        resultado = fusionOrdenada(a, b);
        System.out.print(Arrays.toString(resultado));
    }

    static int[] fusionOrdenada(int a[], int b[]) {
        int copia[] = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        // Compara los elementos del array
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                copia[k] = a[i];
                i++;
            } else {
                copia[k] = b[j];
                j++;
            }
            k++;
        }
        
        // Copia los elementos de 'a' restantes 
        while (i < a.length) {
            copia[k++] = a[i++];
        }
        
        // Copia los elementos de 'b' restantes 
        while (j < b.length) {
            copia[k++] = b[j++];
        }

        return copia;

    }
}
