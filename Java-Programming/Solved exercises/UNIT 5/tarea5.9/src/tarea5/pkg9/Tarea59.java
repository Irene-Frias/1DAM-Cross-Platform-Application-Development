package tarea5.pkg9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Irene
 */
public class Tarea59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntos[] = new int[5];
        int puntosExh, pos, indiceInsertar = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < puntos.length; i++) {
            System.out.print("Introcuce la puntuación del programador: ");
            puntos[i] = sc.nextInt();
        } 
        Arrays.sort(puntos);
        System.out.println("Puntos ordenados: " + Arrays.toString(puntos));

        System.out.print("Puntos de los programadores de exhibición"
                + "(para finalizar -1): ");
        puntosExh = sc.nextInt();

        while (puntosExh != -1) {
            pos = Arrays.binarySearch(puntos, puntosExh);
            if (pos < 0) {
                indiceInsertar = -pos - 1;
            } else {
                indiceInsertar = pos;
            }

            int copia[] = new int[puntos.length + 1];
            System.arraycopy(puntos, 0, copia, 0,
                    indiceInsertar);
            System.arraycopy(puntos, indiceInsertar,
                    copia, indiceInsertar + 1,puntos.length - indiceInsertar);
            copia[indiceInsertar] = puntosExh;
            puntos = copia;

            System.out.print("Puntos de los programadores de exhibición"
                + "(para finalizar -1): ");
            puntosExh = sc.nextInt();
        }

        System.out.println("Puntuación final: " + Arrays.toString(puntos));

    }

}
