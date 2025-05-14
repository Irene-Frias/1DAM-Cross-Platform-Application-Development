package tarea3.pkg10;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea310 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, impar, sumar;
        
        sumar = 0;
        for (num=1; num<=10; num++){
            impar = (2 * num) - 1;
            sumar += impar;
        }
        System.out.println(sumar);
    }
    
}
