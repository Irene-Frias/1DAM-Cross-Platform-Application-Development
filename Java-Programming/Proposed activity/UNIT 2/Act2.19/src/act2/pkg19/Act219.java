package act2.pkg19;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act219 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double grados, radianes;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un ángulo en grados: ");
        grados = sc.nextDouble();
        
        grados = grados % 360;
        if (grados < 0) {
            grados += 360;
        }
        
        radianes = Math.toRadians(grados);
        
        System.out.println("Ángulo normalizado: " + grados + "°");
        System.out.println("Equivalente en radianes: " + radianes);
    }
    
}
