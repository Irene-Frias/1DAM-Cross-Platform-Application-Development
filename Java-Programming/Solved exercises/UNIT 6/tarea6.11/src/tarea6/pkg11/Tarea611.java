package tarea6.pkg11;

import java.util.Scanner;

/**
 *
 * @author Irene
 */
public class Tarea611 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r',
                            's', 't', 'u', 'v'};
        final char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e',
                            'r', 'k', 'q', 's'};        
        char codificado[];
        String texto;
        Scanner sc = new Scanner(System.in);        
        
        System.out.print("Introduzca el texto a codificar: ");
        texto = sc.nextLine();
        
        texto = texto.toLowerCase();
        System.out.println(texto);
        
        codificado = new char [texto.length()];
        
        for (int i = 0; i < texto.length(); i++){
            codificado[i] = codificar(conjunto1, conjunto2, texto.charAt(i));
        }
        texto = String.valueOf(codificado);      
        System.out.println(texto);
    }
    
    static char codificar(char conj1[], char conj2[], char c){
        char codificado;
        final String conjunto1 = String.valueOf(conj1);        
        int pos = conjunto1.indexOf(c);
        
        if (pos == -1){
            codificado = c;
        } else {
            codificado = conj2[pos];
        }       
        
        return codificado;
    }
    
}
