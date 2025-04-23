package tarea6.pkg2;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String primFrase, segFrase;
        int longPrimFrase, longSegFrase;
        
        Scanner sc = new Scanner(System.in);
        
        /*String primFrase = "Hola, ¿qué tal?";
        String segFrase = "Buenos días, ¿qué tal?";*/
                
        System.out.println("Introduce la primera frase: ");
        primFrase = sc.nextLine();
        
        System.out.println("Introduce la primera frase: ");
        segFrase = sc.nextLine();
        
        longPrimFrase = primFrase.length();
        longSegFrase = segFrase.length();
        
        if (longPrimFrase == longSegFrase){
            System.out.println("Son iguales");
        } else if (longPrimFrase < longSegFrase){
            System.out.println("La primera frase es más corta " 
                    + "\n" + primFrase);
        } else {
            System.out.println("La segunda frase es más corta " 
                    + "\n" + segFrase);
        }
    }
    
}
