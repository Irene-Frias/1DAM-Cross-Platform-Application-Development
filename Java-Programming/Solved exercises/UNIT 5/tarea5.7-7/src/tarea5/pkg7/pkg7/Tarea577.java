package tarea5.pkg7.pkg7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea577 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad = 0;
        double numeros[] = new double [cantidad];
        
        pedirNum(cantidad, numeros);        
        Arrays.sort(numeros);
        System.out.println("Array con números favoritos ordenados: " 
                + Arrays.toString(numeros));

        // Eliminación y cálculo de media
        while (numeros.length > 1) {
            double num1 = numeros[0];
            double num2 = numeros[1];
            double media;
            
            media = (num1 + num2) / 2.0;
            double[] nuevoArray = Arrays.copyOfRange(numeros, 2, 
                    numeros.length);
            nuevoArray = insertarOrdenado(nuevoArray, media);
            numeros = nuevoArray;
            // System.out.println("Número de la suerte: " 
            // + Arrays.toString(numeros));
        }
        
        System.out.println("Tu número de la suerte es: " + numeros[0]);
    }

    static void pedirNum(int cantidad, double numeros[]){
        numeros = new double[cantidad];
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("¿Cuántos números favoritos deseas ingresar? "
                + "(mínimo 2): ");
            cantidad = sc.nextInt();            
        } while (cantidad < 2);              
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }
    }
    
    static double[] insertarOrdenado(double t[], double clave) {
        double[] nuevo = new double [t.length + 1];
        
        int i = 0;        
        while (i < t.length && t[i] < clave) {
            nuevo[i] = t[i];
            i++;
        }
        
        System.arraycopy(t, i, nuevo, i + 1, t.length - i);
        nuevo[i] = clave;

        return nuevo;
    }  
    
}