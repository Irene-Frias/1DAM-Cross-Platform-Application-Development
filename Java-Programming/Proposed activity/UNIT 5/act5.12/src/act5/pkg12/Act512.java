package act5.pkg12;

import java.util.Arrays;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act512 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Ordenado: " + Arrays.toString(t));
        desordenar(t);
        System.out.println("Desordenado: " + Arrays.toString(t));
    }
    
    static void desordenar(int t[]){
        int temp, posAlt;
        for (int i = 0; i < t.length; i++) {
            posAlt = (int) (Math.random()*t.length);  
            temp = t[i];
            t[i] = t[posAlt];
            t[posAlt] = temp;
        }
    }
    
}
