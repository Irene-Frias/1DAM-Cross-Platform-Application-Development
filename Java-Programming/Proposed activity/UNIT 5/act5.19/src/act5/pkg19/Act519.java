package act5.pkg19;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act519 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dorsales[] = new int[0];
        int dorsal = 0;
        int menores, descalificado = 0;        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce los dorsales de los corredores "
                + "(-1 para finalizar): ");
        while (dorsal != -1) {
            dorsal = sc.nextInt();
            System.out.print("Introduce los dorsales de los corredores "
                + "(-1 para finalizar): ");
            dorsales = Arrays.copyOf(dorsales, dorsales.length + 1);
            dorsales[dorsales.length - 1] = dorsal;
        }
        dorsales = Arrays.copyOf(dorsales, dorsales.length - 1);
        System.out.println(Arrays.toString(dorsales));
        System.out.println();

        
        System.out.print("Introduce el dorsal de los corredores menores "
                + "de edad: ");
        menores = sc.nextInt();
        adelantarCorredor(dorsales, menores);

        
        System.out.print("Introduce los dorsales de los corredores "
                + "descalificados: ");
        dorsales = eliminarDorsales(dorsales, descalificado);
        
        Arrays.sort(dorsales);
        System.out.println("Clasificación final: " + Arrays.toString(dorsales));
    }

    static void adelantarCorredor(int dorsales[], int dorsal) {
        int pos = Arrays.binarySearch(dorsales, dorsal);
        int temp;
        if (pos > 0) {
            temp = dorsales[pos - 1];
            dorsales[pos - 1] = dorsales[pos];
            dorsales[pos] = temp;
        }
    }
    
    static int[] eliminarDorsales(int dorsales[], int dorsal){
        int pos = Arrays.binarySearch(dorsales, dorsal);
        int nuevo[] = new int [dorsales.length - 1];
        if (pos >= 0){
            System.arraycopy(dorsales, 0, nuevo, 0, pos);
            System.arraycopy(dorsales, pos + 1, nuevo, pos,
                    dorsales.length - pos - 1);
        }
        return nuevo;
    }

}
