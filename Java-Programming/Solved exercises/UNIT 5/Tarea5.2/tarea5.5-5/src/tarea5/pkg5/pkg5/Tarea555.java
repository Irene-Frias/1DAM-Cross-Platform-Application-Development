package tarea5.pkg5.pkg5;

import java.util.Arrays;

/**
 *
 * @author Irene
 */
public class Tarea555 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {1, 1, 3, 4, 5, 6, 7, 8};
        int nuevo = 2;
        int indiceInsercion = Arrays.binarySearch(array, nuevo);
        
        if (indiceInsercion < 0){
            indiceInsercion = - indiceInsercion - 1;
        }
        
        int copia[] = new int [array.length + 1];
        System.arraycopy(array, 0, copia, 0,indiceInsercion);
        copia[indiceInsercion] = nuevo;
        System.arraycopy(array, indiceInsercion, copia, indiceInsercion + 1, 
                array.length - indiceInsercion);
        array = copia;
        System.out.println(Arrays.toString(array));
    }
    
}
