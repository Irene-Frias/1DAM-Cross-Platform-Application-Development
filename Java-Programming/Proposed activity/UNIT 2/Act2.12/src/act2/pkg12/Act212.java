package act2.pkg12;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, resto;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe los número de tu DNI: ");
        num = sc.nextInt();
        
        resto = num % 23;
        String letra = "";
        switch (resto)
        {
            case 0 -> {
                letra = "T";
            }
            case 1 -> {
               letra = "R";
            }
            case 2 -> {
                letra = "W";
            }
            case 3 -> {
                letra = "A";
            }
            case 4 -> {
                letra = "G";
            }
            case 5 -> {
                letra = "M";
            }
            case 6 -> {
                letra = "Y";
            }
            case 7 -> {
                letra = "F";
            }
            case 8 -> {
                letra = "P";
            }
            case 9 -> {
                letra = "D";
            }
            case 10 -> {
                letra = "X";
            }
            case 11 -> {
                letra = "B";
            }
            case 12 -> {
                letra = "N";
            }
            case 13 -> {
                letra = "J";
            }
            case 14 -> {
                letra = "Z";
            }
            case 15 -> {
                letra = "S";
            }
            case 16 -> {
                letra = "Q";
            }
            case 17 -> {
                letra = "V";
            }
            case 18 -> {
                letra = "H";
            }
            case 19 -> {
                letra = "L";
            }
            case 20 -> {
                letra = "C";
            }
            case 21 -> {
                letra = "K";
            }
            case 22 -> {
                letra = "E";
            }
            default -> {
                System.out.println("Desconocida");
            }
        }
        System.out.println("Tu DNI con letra es: " + num + letra);
        sc.close();
    }
    
}
