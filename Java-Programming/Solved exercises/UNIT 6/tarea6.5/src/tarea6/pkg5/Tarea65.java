package tarea6.pkg5;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase, reves;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();
        reves = alReves(frase);
        System.out.println(reves);
    }
    
    static String alReves(String frase){
        String nueva = "";
        for (int i = 0; i < frase.length(); i++) {
            nueva = frase.charAt(i) + nueva;
        }
        return nueva;
    }
}
