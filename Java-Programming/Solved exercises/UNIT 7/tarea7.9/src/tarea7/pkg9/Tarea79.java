package tarea7.pkg9;

/**
 *
 * @author Irene
 */
public class Tarea79 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bombilla bombilla1 = new Bombilla();
        Bombilla bombilla2 = new Bombilla();

        System.out.println("Intentando encender la bombilla 1...");
        bombilla1.encendido();
        bombilla1.estadoBombilla();

        System.out.println("\nIntentando encender la bombilla 2...");
        bombilla2.encendido();
        bombilla2.estadoBombilla();

        System.out.println("\nApagando el interruptor general...");
        Bombilla.desactivarInterruptorGeneral();

        bombilla1.estadoBombilla();
        bombilla2.estadoBombilla();

        System.out.println("\nEncendiendo el interruptor general...");
        Bombilla.activarInterruptorGeneral();
        
        bombilla1.estadoBombilla();
        bombilla2.estadoBombilla();
        
    }
}