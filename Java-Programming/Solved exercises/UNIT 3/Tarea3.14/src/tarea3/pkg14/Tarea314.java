package tarea3.pkg14;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea314 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        
        for (i=0; i<=10; i++){
            System.out.println("La tabla del " + i);
            for (int j=0; j<=10; j++){
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
            System.out.println(" "); 
        }
    }
    
}
