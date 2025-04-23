package tarea6.pkg13;

import java.util.Scanner;

/**
 *
 * @author ALUMNO2425
 */
public class Tarea613 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        int numVeces[] = new int['z' - 'a' + 1];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();

        frase.equalsIgnoreCase(frase);

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                numVeces[frase.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 'z' - 'a' + 1; i++) {
            if (numVeces[i] != 0) {
                System.out.println("La letra " + (char) (i + 'a') + " está"
                        + "repetida " + numVeces[i] + " número de veces.");
            }
        }
    }

}
