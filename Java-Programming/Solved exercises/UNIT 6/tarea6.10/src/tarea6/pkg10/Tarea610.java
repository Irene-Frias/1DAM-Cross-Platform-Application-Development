package tarea6.pkg10;

import java.util.Scanner;

/**
 * // ejer. aplicación 11  12  13  14  17  18  20
 * @author Irene Frías Ramos
 */
public class Tarea610 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r',
                            's', 't', 'u', 'v'};
        char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e',
                            'r', 'k', 'q', 's'};        
        char c = 0;
        String frase, sinEspacios, invertida;
        Scanner sc = new Scanner(System.in);        
        
        System.out.println("Introduzca el texto a codificar: ");
        frase = sc.nextLine();
        
        frase = frase.toLowerCase();
        System.out.println(frase);
        
        sinEspacios = quitarEspacios(frase);
        invertida = alReves(frase);
        
        if (sinEspacios.equals(invertida)){
            System.out.println("La frase " + frase + " es palíndroma");
        } else {
            System.out.println("La frase no es palíndroma");
        }
    }
    
    static String quitarEspacios(String texto){
        char c;
        String sinEspacios = "";
        for (int i = 0; i < texto.length(); i++) {
            c = texto.charAt(i);
            if (!Character.isWhitespace(c)){
                sinEspacios = sinEspacios + c;
            }            
        }
        
        return sinEspacios;
    }
    
    static String alReves(String texto){
        String nueva = "";
        for (int i = 0; i < texto.length(); i++) {
            nueva = texto.charAt(i) + nueva;
        }
        return nueva;
    }
    
}
