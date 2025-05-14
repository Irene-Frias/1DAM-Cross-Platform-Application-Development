package tarea7.pkg14;

import java.util.Arrays;

/**
 *
 * @author Irene
 */
public class Main {

    int tablaEnteros[] = new int[0];

    public void insertarAlFinal(int nuevo) {
        tablaEnteros = Arrays.copyOf(tablaEnteros, 
                tablaEnteros.length + 1);
        tablaEnteros[tablaEnteros.length - 1] = nuevo;
    }
    
    public void mostrarMain() {
        for (int array : tablaEnteros){
            System.out.print(array + " ");
        }
    }
}
