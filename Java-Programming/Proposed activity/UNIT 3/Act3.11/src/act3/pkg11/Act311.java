package act3.pkg11;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act311 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, resto, binario, count = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número decimal: ");
        num = sc.nextInt();
        
        resto = 0;
        binario = 0;
        while (num >= 0){
            resto = num % 2;
            num = num / 2;
            System.out.print(resto);
        }
        
    }
    
}
