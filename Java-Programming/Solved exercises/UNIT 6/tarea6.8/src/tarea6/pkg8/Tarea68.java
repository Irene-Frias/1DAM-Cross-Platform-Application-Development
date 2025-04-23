package tarea6.pkg8;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea68 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prefijo = "Javalin, javalón";
        String sufijo = "javalén, len, len";
        String frase;
        boolean esJavalandia = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        frase = sc.nextLine().strip();  
        String fraseLower = frase.toLowerCase();

        if (fraseLower.startsWith(prefijo)) {
            esJavalandia = true;
            frase = frase.substring(prefijo.length()).strip(); // Eliminamos el prefijo y limpiamos espacios
        } 
        
        if (fraseLower.endsWith(sufijo)) {
            esJavalandia = true;
            frase = frase.substring(0, frase.length() - sufijo.length()).strip(); // Eliminamos el sufijo y limpiamos espacios
        }

        if (esJavalandia && !frase.isEmpty()) {
            System.out.println("Está escrito en Javalandia. Mensaje traducido:");
            System.out.println(frase);
        } else {
            System.out.println("No está escrito en Javalandia.");
        }

               
    }

}
