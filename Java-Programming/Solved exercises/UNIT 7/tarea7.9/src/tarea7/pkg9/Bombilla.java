package tarea7.pkg9;

/**
 *
 * @author Irene
 */
public class Bombilla {

    private boolean interruptor;
    public static boolean interruptorGeneral = true; // Afecta a todas las 
                                                    // bombillas

    public Bombilla() {
        this.interruptor = false; // Se inicializa apagada
    }

    public void encendido() {
        this.interruptor = true;
    }

    public void apagado() {
        this.interruptor = false;
    }

    public void estadoBombilla() {
        if (this.interruptor && interruptorGeneral) {
            System.out.println("La bombilla está encendida");
        } else {
            System.out.println("La bombilla está apagada");
        }
    }

    public static void activarInterruptorGeneral() {
        interruptorGeneral = true;
    }

    public static void desactivarInterruptorGeneral() {
        interruptorGeneral = false;
    }

}
