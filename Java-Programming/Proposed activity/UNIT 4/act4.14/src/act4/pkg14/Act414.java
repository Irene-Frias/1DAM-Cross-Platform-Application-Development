package act4.pkg14;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act414 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dias, horas, min, seg;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad de días: ");
        dias = sc.nextInt();

        System.out.print("Introduce la cantidad de horas: ");
        horas = sc.nextInt();

        System.out.print("Introduce la cantidad de minutos: ");
        min = sc.nextInt();

        seg = n_segundos(dias, horas, min);
        System.out.println("La cantidad total en segundos es: " + seg);
    }

    static int n_segundos(int dias, int horas, int min) {
        int segDias, segHoras, segMin, t_seg;

        segDias = dias * 24 * 60 * 60;
        segHoras = horas * 60 * 60;
        segMin = min * 60;
        t_seg = segDias + segHoras + segMin;
        
        return t_seg;
    }
}
