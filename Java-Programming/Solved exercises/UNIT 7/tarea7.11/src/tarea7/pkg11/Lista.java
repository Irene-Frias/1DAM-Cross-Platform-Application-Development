package tarea7.pkg11;

import java.util.Arrays;

/**
 *
 * @author Irene Frías Ramos
 */
public class Lista {
    Integer tabla[];

    public Lista() {
        tabla = new Integer[0];
    }

    public void insertarInicio(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    public void insertarFinal(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    public void insertarIndice(int posicion, Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1,
                tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    public int eliminarIndice(int indice) {
        int eliminado = tabla[indice];
        for (int i = indice; i < tabla.length - 1; i++) {
            tabla[i] = tabla[i + 1];
        }
        tabla = Arrays.copyOf(tabla, tabla.length - 1);
        return eliminado;
    }

    public int buscarNum(int num) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == num) {
                return i;
            }
        }
        return -1; 
    }

    public void imprimir() {
        System.out.println("Muestra la lista: " + Arrays.toString(tabla));
    }
    
}
