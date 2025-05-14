package tarea3.pkg12;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea312 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        int suspenso = 0;
        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i<5; i++){
            System.out.print("Introduce una calificación: ");
            nota = sc.nextInt();

            if (nota < 5){
               suspenso++; 
            }        
            
        }
        
        if (suspenso != 0){
            System.out.println("Hay alumnos que están suspensos");
        } else {
            System.out.println("No hay alumnos suspensos");
        }
        
    }
    
}
