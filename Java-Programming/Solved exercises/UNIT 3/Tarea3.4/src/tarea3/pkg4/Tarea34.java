package tarea3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double altura, mas_alto, count_mas_alto;
        int count;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número en centímetros: ");
        altura = sc.nextDouble();
        
        count = 0;
        mas_alto = 0;
        count_mas_alto = 0;
        while (altura != -1){
            if (altura > mas_alto){
                mas_alto = altura;
                count_mas_alto = count;
            }
            count++;
            System.out.println("La altura del arbol es: ");
            altura = sc.nextInt();
            
            if (mas_alto == - 1){
                System.out.println("No hay ningún árbol");
            } else {
                System.out.println("El árbol mide: " + mas_alto);
                System.out.println("La etiqueta del árbol es: "
                    + count_mas_alto);
            }
        }
        
        
        
    }
    
}
