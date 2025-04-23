package tarea7.pkg8;

/**
 *
 * @author Irene
 */
public class Tarea78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SincronizadorFM frec = new SincronizadorFM(112);
        frec.frecuenciaUp();
        frec.frecuenciaDown();
        frec.display();
    }
    
}
