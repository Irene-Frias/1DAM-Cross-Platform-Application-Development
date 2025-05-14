package act5.pkg15;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act515 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota[][] = new int[5][3];
        
        introduceNotas(nota);
        System.out.println();

        muestra(nota);
        System.out.println();

        System.out.println("Media de los Trimestres");
        mediaTrim(nota);

        System.out.println();

        System.out.println("Media de cada Alumno");
        mediaAlumno(nota);
    }

    static void introduceNotas(int nota[][]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Alumno " + (i + 1));
            nota[i][0] = i;
            for (int j = 0; j < nota[i].length; j++) {
                System.out.print(j + 1 + "º trimestre: ");
                nota[i][j] = sc.nextInt();
            }
        }
    }

    static void mediaTrim(int nota[][]) {
        int suma;
        double media;

        for (int col = 0; col < nota[0].length; col++) {
            suma = 0;
            for (int fila = 0; fila < nota.length; fila++) {
                suma += nota[fila][col];
            }
            media = suma / 5.0;
            System.out.println((col + 1) + "º trimestre: " + media);
        }
    }

    static void mediaAlumno(int nota[][]) {
        int suma = 0;
        double media;

        for (int fila = 0; fila < nota.length; fila++) {
            for (int col = 0; col < nota[fila].length; col++) {
                suma += nota[fila][col];
            }
            media = suma / 3.0;
            System.out.println("Alumno " + (fila + 1) + ": " + media);
        }
    }

    static void muestra(int nota[][]) {
        for (int fila[] : nota) {
            for (int elem : fila) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
