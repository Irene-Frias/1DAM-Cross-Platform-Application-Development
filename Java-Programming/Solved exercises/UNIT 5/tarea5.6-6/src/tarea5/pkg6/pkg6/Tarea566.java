package tarea5.pkg6.pkg6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea566 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t[] = new int[8];
        int borrar, indiceBorrar;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * 10 + 1);
        }
        Arrays.sort(t);
        System.out.println("Array original: " + Arrays.toString(t));
        
        System.out.print("Elemento a borrar: ");
        borrar = sc.nextInt();
        
        indiceBorrar = Arrays.binarySearch(t, borrar);
        
        t = eliminarNum(t, indiceBorrar);  
        System.out.println(Arrays.toString(t));
    }
    
    static int[] eliminarNum(int t[], int indiceBorrar){
        if (indiceBorrar >= 0) {
            System.arraycopy(t, indiceBorrar + 1, t, indiceBorrar,
                    t.length - indiceBorrar - 1);
            t = Arrays.copyOf(t, t.length - 1);
        } else {
            System.out.println("No se ha encontrado el elemento en el array");
        }
        return t;
    }
}
