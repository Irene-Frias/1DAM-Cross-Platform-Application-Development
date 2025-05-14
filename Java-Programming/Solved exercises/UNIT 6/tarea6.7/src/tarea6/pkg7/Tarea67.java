package tarea6.pkg7;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase, palabra;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();
        
        System.out.println("Introduce un palabra: ");
        palabra = sc.nextLine();
        
        contarPalabras(frase, palabra);        
    }
    
    /** 
     * Cuenta las letras dentro de la frase, buscando que coincida 
     * en la frase 
     * 
     * @param frase
     * @param palabra 
     */
    static void contarPalabras (String frase, String palabra){
        int countPalabras = 0;
        int pos = frase.indexOf(palabra);
        
        while (pos != -1) {
            countPalabras++;
            pos = countPalabras = frase.indexOf(palabra, pos + 1);             
        }
        
        if (countPalabras == 0){
            System.out.println("La palabra "  + palabra + " no se encuentra "
                    + "en la frase " + frase);
        } else {
            System.out.println("La palabra "  + palabra + " está en la se "
                    + "encuentra en la frase " + frase);
        }
    }
    
}
