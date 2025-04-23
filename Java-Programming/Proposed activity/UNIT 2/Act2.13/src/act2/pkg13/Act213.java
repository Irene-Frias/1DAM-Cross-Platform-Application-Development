package act2.pkg13;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numAnimales;
        double kilosPorAnimal, comidaDiaria, comidaNecesaria, comidaPorAnimal;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Introduce la cantidad de comida diaria "
                + "disponible en kilos: ");
        comidaDiaria = sc.nextDouble();
        
        System.out.println("Número de animales: ");
        numAnimales = sc.nextInt();
        
        System.out.println("Kilos que come cada animal: ");
        kilosPorAnimal = sc.nextDouble();
        
        if (numAnimales == 0)
        {
            System.out.println("No hay animales a los que alimentar");
        }
        else {
            comidaNecesaria = comidaDiaria * numAnimales;
            if (comidaDiaria >= comidaNecesaria){
                System.out.println("Hay suficiente comida para los "
                        + "animales" + comidaNecesaria);
            }
            else {
                comidaPorAnimal = comidaDiaria / numAnimales;
                System.out.println("No hay suficiente comida. Cada animal "
                        + "recibirá: " + comidaPorAnimal);
            }
        }
    }
    
}
