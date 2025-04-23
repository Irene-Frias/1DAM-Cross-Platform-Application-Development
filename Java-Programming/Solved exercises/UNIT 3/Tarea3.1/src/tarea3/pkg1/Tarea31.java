package tarea3.pkg1;

import java.util.Scanner;

/**
 *
 * @author ALUMNO2425
 */
public class Tarea31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad, mayor, menor;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la edad: ");
        edad = sc.nextInt();
        
        mayor = edad;
        menor = edad;
        
        while (edad != 1){
            if (edad > edad) {
                mayor = edad;
                System.out.println("La edad es "+ edad);
            } else {
                menor = edad;
                System.out.println("La edad es menor que -1, es incorrecta");
            }
            System.out.println("La edad es "+ edad); 
            edad = sc.nextInt();
        }
        System.out.println(mayor);
        System.out.println(menor);
        
        
    }
    
}
