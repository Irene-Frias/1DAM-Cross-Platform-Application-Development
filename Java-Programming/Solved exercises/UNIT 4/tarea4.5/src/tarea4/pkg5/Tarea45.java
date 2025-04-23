package tarea4.pkg5;

import java.util.Scanner;

/**
 *
 * @author ALUMNO2425
 */
public class Tarea45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char caracter;
        boolean resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un carácter: ");
        caracter = sc.next().charAt(0);
        
        resultado = vocal(caracter);
        System.out.println("¿Es una vocal? " + resultado);
    }
    
    static boolean vocal(char vocal){
        boolean resultado;
        if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' 
                || vocal == 'u') {
            resultado = true;   
        } else {
            resultado = false;
        }
        return resultado;
    }
}
