package act5.pkg11;

import java.util.Arrays;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act511 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t[] = {1, 2, 3, 2, 5, 2};
        int posiciones[];
        posiciones = buscarTodos(t, 3);

        System.out.println("Posición: " + Arrays.toString(posiciones));
    }

    static int[] buscarTodos(int t[], int clave) {
        int cont = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave){
                cont++;
            }
        }
        
        int pos[] = new int [cont];
        int indice = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave){
                pos[indice++] = i;
            }
        }

        return pos;
    }

}
