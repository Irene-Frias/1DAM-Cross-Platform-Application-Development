package tarea5.pkg5;

import java.util.Arrays;

/**
 *
 * @author Irene
 */
public class Tarea55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longitud = 6, fin = 6, pares[];
        
        pares = rellenaPares(longitud, fin);
        
        System.out.println("Los números pares son: " + Arrays.toString(pares));
    }
    
    static int[] rellenaPares(int longitud, int fin){
        int pares[] = new int [longitud];
        
        int i = 0;
        while (i < pares.length){
            int num = (int) (Math.random()* fin + 1);
            if (num % 2 == 0){
                pares[i] = num;
                i++;
            }
            Arrays.sort(pares);
        }
        
        return pares;
    }
}
