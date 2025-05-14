package act3.pkg13;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act313 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hora, min, seg, seg_incrementar;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la hora: ");
        hora = sc.nextInt();
        
        System.out.print("Introduce la minutos: ");
        min = sc.nextInt();
        
        System.out.print("Introduce la segundos: ");
        seg = sc.nextInt();
        
        System.out.print("Introduce los segundos que quiere incrementar: ");
        seg_incrementar = sc.nextInt();
        
        // Incremento en segundos totales
        while (seg_incrementar > 0){
            seg += 1;
            if (seg >= 60) {
                seg = 0;
                min += 1;
            }
            if (min >= 60) {
                min = 0;
                hora += 1;
            }

            if (hora >= 24) {
                hora = 0;
            }
            seg_incrementar--;
        }
                
        System.out.println(hora + ":" + min + ":" + seg);
    }
    
}
