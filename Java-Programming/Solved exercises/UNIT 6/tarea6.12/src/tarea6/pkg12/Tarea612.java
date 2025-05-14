package tarea6.pkg12;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ALUMNO2425
 */
public class Tarea612 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        String anagrama;  // roma = amor ramo mora
        String palabra1, palabra2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una palabra: ");
        palabra1 = sc.nextLine();
        
        palabra1 = palabra1.toLowerCase();
        
        System.out.print("Introduce una plabra: ");
        palabra2 = sc.nextLine();        
        
        palabra2 = palabra2.toLowerCase();
        
        if (palabra1.length() != palabra2.length()){
            System.out.println("No son aragrama");
        } else {
            char p1[] = palabra1.toCharArray();
            char p2[] = palabra2.toCharArray();
            
            Arrays.sort(p1);   
            Arrays.sort(p2);
            
            if (Arrays.equals(p1, p2)){
                anagrama = "La palabra " + palabra1 + " y la palabra "
                        + palabra2 + " son aragrama";
                
            } else {
                anagrama = "La palabra " + palabra1 + " y la palabra "
                        + palabra2 + " son aragrama";
            }
        }
        
    }
    
}
