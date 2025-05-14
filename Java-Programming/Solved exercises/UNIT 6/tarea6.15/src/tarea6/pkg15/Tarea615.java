package tarea6.pkg15;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea615 {

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
            
            System.out.println("Las letras correctas son: "
                    + letrasCorrectas(palabra, intento));
            
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
    
    static int letrasCorrectas(String a, String b) {
        int longitudMin = Math.min(a.length(), b.length());
        int contLetrasCorrectas = 0;
        for (int i = 0; i < longitudMin; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                contLetrasCorrectas++;
            }            
        }
        return contLetrasCorrectas;
    }
    
}
