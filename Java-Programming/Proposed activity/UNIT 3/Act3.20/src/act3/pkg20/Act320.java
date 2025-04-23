package act3.pkg20;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act320 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cantidad, banco, hucha, cajon, bolsillos, total;
        Scanner sc = new Scanner(System.in);

        cantidad = 0;
        banco = 0;
        while (banco <= 0) {
            System.out.print("Introduce la cantidad de dinero de el banco: ");
            banco = sc.nextDouble();
            if (banco > 0) {
                cantidad++;
            } else {
                System.out.println("La cantidad introducida no puede ser "
                        + "negativa");
            }
        }

        hucha = 0;
        while (hucha <= 0) {
            System.out.print("Introduce la cantidad de dinero de el "
                    + "hucha: ");
            hucha = sc.nextDouble();
            if (hucha > 0) {
                cantidad++;
            } else {
                System.out.println("La cantidad introducida no puede ser "
                        + "negativa");
            }
        }

        cajon = 0;
        while (cajon <= 0) {
            System.out.print("Introduce la cantidad de dinero de el "
                    + "cajón: ");
            cajon = sc.nextDouble();
            if (cajon > 0) {
                cantidad++;
            } else {
                System.out.println("La cantidad introducida no puede ser "
                        + "negativa");
            }
        }
        
        bolsillos = 0;
        while (bolsillos <= 0) {
            System.out.print("Introduce la cantidad de dinero de el "
                    + "bolsillos: ");
            bolsillos = sc.nextDouble();
            if (bolsillos > 0) {
                cantidad++;
            } else {
                System.out.println("La cantidad introducida no puede ser "
                        + "negativa");
            }
        }

        total = banco + hucha + cajon + bolsillos;
        System.out.println("La suma total de dinero es de: " + total + " €");

    }

}
