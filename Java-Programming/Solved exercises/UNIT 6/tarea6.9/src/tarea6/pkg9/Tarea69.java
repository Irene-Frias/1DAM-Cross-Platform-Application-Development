package tarea6.pkg9;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "", palabra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una palabra: ");
        palabra = sc.nextLine();

        while (!palabra.equalsIgnoreCase("fin")) {
            frase = frase + " " + palabra;

            System.out.println("Escribe una palabra: ");
            palabra = sc.nextLine();
        }

        System.out.println("Frase final: " + frase);
    }

}
