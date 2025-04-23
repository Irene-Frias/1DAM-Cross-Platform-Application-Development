package tarea5.pkg3;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce cuántos números quiere: ");
        num = sc.nextInt();
        
        int t[] = new int [num];
        
        for (int i = 0; i < t.length; i++){
            System.out.print("Introduce un número: ");
            t[i] = sc.nextInt();
        }
        
        for (int i = t.length - 1; i >= 0; i--){
            System.out.print(t[i] + " ");
        }
    }
    
}
