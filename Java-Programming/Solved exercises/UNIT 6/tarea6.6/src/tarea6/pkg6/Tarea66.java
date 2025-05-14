package tarea6.pkg6;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c;
        String usuario, sinVocales = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el nombre completo del usuario: ");
        usuario = sc.nextLine();
        
        for (int i = 0; i < usuario.length(); i++) {
            c = usuario.charAt(i);
            if (!esVocal(c)){
                sinVocales = sinVocales + c;
            }
        }
        
        System.out.println("Muestra el nombre sin vocales, minúsculas y "
                + "acentuadas: " + sinVocales);        
    }
    
    static boolean esVocal(char c){
        boolean result;
        String vocales = "aeiouáéíóú";
        c = Character.toLowerCase(c);
        
        if (vocales.indexOf(c) == -1){
            result = false;
        } else {
            result = true;
        }
        
        return result;
    }
    
}
