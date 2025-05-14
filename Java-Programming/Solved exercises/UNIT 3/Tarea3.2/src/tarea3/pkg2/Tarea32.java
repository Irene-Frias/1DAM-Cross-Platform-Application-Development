package tarea3.pkg2;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad, media, suma, count, count_edad;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce las edades de los alumnos: ");
        edad = sc.nextInt();
        
        suma = 0;
        count = 0;
        count_edad = 0;
        while (edad >= 0){
            suma += edad;
            count++;
            
            if (edad <= 18){
                System.out.println("Son mayores de edad");
                count_edad++;
            } else {
                System.out.println("Introduce otra edad: ");
                edad = sc.nextInt();
            }
            
            media = suma / count;
            
            System.out.println("La suma de las edades son: " + suma);
            System.out.println("La suma de las edades son: " + media);
            System.out.println("Alumnos mayores de edad son: " + count_edad);
        }
    }
    
}
