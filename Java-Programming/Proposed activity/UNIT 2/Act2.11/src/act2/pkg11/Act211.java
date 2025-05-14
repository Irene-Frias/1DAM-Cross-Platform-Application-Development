package act2.pkg11;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act211 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, resto;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        
        /*
        if (num >= 0 && num < 10000 && num % 11 == 0)
        {
            System.out.println("Es capicua");
        }
        else
        {
            System.out.println("No es capicua");
        }
        */
        
        if (num % 10 == 0)
        {
            System.out.println("Es capicua");
        }
        else if (num % 100 == 0)
        {
            System.out.println("Es capicua");
        }
        else if (num % 1000 == 0)
        {
            System.out.println("Es capicua");
        }
        else if (num % 10000 == 0)
        {
            System.out.println("Es capicua");
        }
        else
            System.out.println("No es capicua");

    }
    
}
