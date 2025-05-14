package tarea6.pkg14;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea614 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String anagrama, intento;
        String palabra;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Jugador 1 - Introzca una palabra: ");
            palabra = sc.nextLine();            
        } while (palabra.isEmpty());
        
        do {
            System.out.println("Jugador 2 - Introzca una palabra: ");
            intento = sc.nextLine();            
        } while (!palabra.equals(intento));
        
        desordenarPalabra(palabra);
        
    }
    
    static String desordenarPalabra(String palabra){
        char anagrama[] = palabra.toCharArray();
        
        for (int numCambios = 0; numCambios < anagrama.length; numCambios++){
            int i = (int) (Math.random()* anagrama.length);
            int j = (int) (Math.random() * anagrama.length);
            char aux = anagrama[i];
            anagrama[i] = anagrama[j];
            anagrama[j] = aux;
        }
        
        return String.valueOf(anagrama);
    }
    
}
