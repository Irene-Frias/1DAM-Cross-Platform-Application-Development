package tarea5.pkg7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = new int [5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introude un número: ");
            array[i] = sc.nextInt();          
        }
        
        System.out.println(Arrays.toString(sinRepetidos(array)));       
    }

    static int[] sinRepetidos(int t[]) {
        int temp[] = new int[0];
        
        for (int elemento : t) {
            if (buscar(temp, elemento) != -1){
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = elemento;
            }
        }

        return temp;
    }
    
    static int buscar(int t[], int elemento){
        int i = 0;
        while (i < t.length && t[i] != elemento){
            i++;
        }
        
        if (i == t.length){
            i = -1;
        } 
        return i;
    }
}
