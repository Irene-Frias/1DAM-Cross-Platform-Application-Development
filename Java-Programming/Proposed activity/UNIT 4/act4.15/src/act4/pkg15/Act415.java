package act4.pkg15;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act415 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hora1, hora2, minuto1, minuto2, instantes;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Instante 1");
        System.out.print("Introduce las horas: ");
        hora1 = sc.nextInt();
        
        System.out.print("Introduce las minutos: ");
        minuto1 = sc.nextInt();
        
        System.out.println("Instante 2");
        System.out.print("Introduce otras horas: ");
        hora2 = sc.nextInt();
        
        System.out.print("Introduce otros minutos: ");
        minuto2 = sc.nextInt();
        
        instantes = diferenciaMin(hora1, minuto1, hora2, minuto2);
        System.out.println("La diferencia entre ambos instantes es: " 
                + instantes);
    }
    
    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2){
        int instantes;
        
        instantes = ((hora1 * 60) + minuto1) - ((hora2 * 60) + minuto2);
        
        return instantes;
    }
    
}
