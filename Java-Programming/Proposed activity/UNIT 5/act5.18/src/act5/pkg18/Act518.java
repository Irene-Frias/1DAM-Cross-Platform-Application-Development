package act5.pkg18;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act518 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int m[][] = new int[4][4];

        inicializaMatriz(m);*/
        int m[][] = {{1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1}};

        System.out.println(sumaColumnas(m, 3));
        System.out.println(compruebaFilas(m, 4));
        System.out.println(compruebaColumnas(m, 5));

        System.out.println();
        muestra(m);
        System.out.println();

        if (esMatrizMagica(m)) {
            System.out.println("Es una matriz mágica");
        } else {
            System.out.println("No es una matriz mágica");
        }
    }

    static void inicializaMatriz(int m[][]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < m.length; i++) {
            System.out.println("Fila -> " + (i + 1));
            for (int j = 0; j < m.length; j++) {
                System.out.print("Introduce un número " + "(col: "
                        + (j + 1) + "): ");
                m[i][j] = sc.nextInt();
            }
        }
    }

    static boolean compruebaColumnas(int m[][], int valor) {
        boolean suma;
        int col = 0;

        while (col < m.length && sumaColumnas(m, col) == valor) {
            col++;
        }

        if (col < m.length) {
            suma = true;
        } else {
            suma = false;
        }

        return suma;
    }

    static boolean compruebaFilas(int m[][], int valor) {
        boolean suma;
        int fila = 0;

        while (fila < m.length && sumaFilas(m, fila) == valor) {
            fila++;
        }

        if (fila < m.length) {
            suma = true;
        } else {
            suma = false;
        }

        return suma;
    }

    static int sumaFilas(int m[][], int fila) {
        int suma = 0;
        for (int col = 0; col < m.length; col++) {
            suma += m[fila][col];
        }
        return suma;
    }

    static int sumaColumnas(int m[][], int col) {
        int suma = 0;
        for (int fila = 0; fila < m.length; fila++) {
            suma += m[fila][col];
        }
        return suma;
    }

    static void muestra(int m[][]) {
        for (int fila[] : m) {
            for (int elem : fila) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    static boolean esMatrizMagica(int m[][]) {
        int referencia = sumaFilas(m, 0); 
        boolean result = true;
        
        for (int i = 0; i < m.length; i++) {
            if (sumaFilas(m, i) != referencia) {
                result = false;
            }
        }

        for (int j = 0; j < m.length; j++) {
            if (sumaColumnas(m, j) != referencia) {
                result = false;
            }
        }

        return result;
    }

}
