package tarea5.pkg4;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, max;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce cuántos números quiere: ");
        num = sc.nextInt();

        int t[] = new int[num];

        for (int i = 0; i < t.length; i++) {
            System.out.print("Introduce el número: ");
            t[i] = sc.nextInt();
        }        
        
        max = maximo(t);
        System.out.println("El número mayor es " + max);
    }

    static int maximo(int t[]){
        int max = t[0];
        for (int i = 1; i < t.length; i++) {
            if (max < t[i]){
                max = t[i];
            }
        }
        return max;
    }
}
