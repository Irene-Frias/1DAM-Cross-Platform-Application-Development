package tarea6.pkg4;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        char c;
        int contEspacios = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);
            System.out.println(c  + "");
            if (Character.isSpaceChar(c)){
                contEspacios++;
            }            
        }
        System.out.println("La frase " + frase + " tiene " + contEspacios + ""
                + "número de espacios");
    }
    
}
