package tarea5.pkg4.pkg4;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea544 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int t[] = {1, 5, 6, 8, 4, 2, 3};
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        buscar(t, num);
    }

    static int buscar(int t[], int clave) {
        int pos; 
        int i = 0;
        
        while (i < t.length && t[i] != clave) {
            i++;
        }
        
        if (i < t.length) {
            pos = i;
            System.out.println("El número " + clave + " está en la posición "
                    + pos);
        } else {
            pos = -1;
            System.out.println("El número " + clave + " no se encuentra " 
                    + pos);
        }
        
        return pos;
    }
}
