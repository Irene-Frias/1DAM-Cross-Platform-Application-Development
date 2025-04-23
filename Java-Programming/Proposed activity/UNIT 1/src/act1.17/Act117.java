package act1.pkg17;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double mm, cm, m, total;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe una medida en milímetros: ");
        mm = sc.nextDouble();
        
        System.out.print("Escribe una medida en centímetros: ");
        cm = sc.nextDouble();
        
        System.out.print("Escribe una medida en metros: ");
        m = sc.nextDouble();
        
        total = (m * 100) + cm + (mm / 10);
        System.out.println("El resultado en centrimetros de los datos "
                + "introducidos es: " + total);
    }
    
}
