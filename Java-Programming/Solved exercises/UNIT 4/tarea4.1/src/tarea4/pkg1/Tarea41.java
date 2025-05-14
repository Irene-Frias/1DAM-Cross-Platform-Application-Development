package tarea4.pkg1;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n; 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        
        eco(n, "Eco");
    }

    static void eco(int n, String mensaje){
        for (int i = 1; i <= n; i++){
            System.out.println(mensaje);
        }
    }
}
