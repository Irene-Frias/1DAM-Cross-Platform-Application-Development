package tarea3.pkg13;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea313 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota, aprobado, suspenso, condicional;
        Scanner sc = new Scanner(System.in);
        
        aprobado = 0;
        suspenso = 0;
        condicional = 0;
        for (int i = 1; i<=6; i++){
            System.out.println("Introduce la nota de los alumnos: ");
            nota = sc.nextInt();
            
            if (nota < 0 || nota > 10){
                System.out.println("La nota no está comprendida entre 0 y 10");
            }
            
            if (nota == 4){
                condicional++;
            } else if (nota < 4){
                suspenso++;
            } else if (nota >= 5){
                aprobado++;
            }
        }
        System.out.println("Aproado condicional: " + condicional);
        System.out.println("Suspenso: " + suspenso);
        System.out.println("Aprobados: " + aprobado); 
    }
    
}
