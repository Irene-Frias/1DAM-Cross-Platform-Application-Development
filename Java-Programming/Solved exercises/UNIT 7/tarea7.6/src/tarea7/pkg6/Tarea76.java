package tarea7.pkg6;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo;
        Scanner sc = new Scanner(System.in);
        Hora h = new Hora();
        
        System.out.println("Hora: ");
        tiempo = sc.nextInt();
        h.setHora(tiempo);
        
        System.out.println("Minutos: ");      
        tiempo = sc.nextInt();
        h.setMin(tiempo);
        
        System.out.println("Segundos: ");
        tiempo = sc.nextInt();
        h.setSeg(tiempo);
        
        System.out.println("Segundos que quiere mostrar: ");
        int numSeg = sc.nextInt();
        for (int i = 0; i < numSeg; i++) {
            System.out.println(h.getHora() + ":" + h.getMin() + ":" + h.getSeg());
            h.aumentarSeg();
        }
    }
    
}
