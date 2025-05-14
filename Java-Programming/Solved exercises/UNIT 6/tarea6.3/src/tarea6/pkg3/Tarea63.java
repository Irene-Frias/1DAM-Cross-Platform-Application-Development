package tarea6.pkg3;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int comparacion;
        String contrasenya;
        String palabra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Acierta la contraseña");

        System.out.println("Jugador 1 - Introduce la contraseña: ");
        contrasenya = sc.nextLine();

        do {
            System.out.println("Jugador 2 - Introduce la parlabra: ");
            palabra = sc.nextLine();
            
            comparacion = contrasenya.compareTo(palabra);
           
            if (comparacion == 0) {
                System.out.println("Son iguales");
            } else if (comparacion < 0){
                System.out.println("La segunda palabra es menor");
                System.out.println("Su longitud es de: " + palabra.length());
            } else {
                System.out.println("La primera palabra es mayor");
            }
           
        } while (!contrasenya.equals(palabra));
        
        

    }

}
