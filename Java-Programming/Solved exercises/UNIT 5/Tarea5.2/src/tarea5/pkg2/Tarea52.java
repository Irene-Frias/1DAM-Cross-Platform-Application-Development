package tarea5.pkg2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num[] = new double [5];
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        for (int i = 0; i < num.length; i++){
            System.out.print("Introduce un número: ");
            num[i] = sc.nextDouble();
        }
        
        System.out.print(Arrays.toString(num));
        
        /*for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }*/
    }
    
}
