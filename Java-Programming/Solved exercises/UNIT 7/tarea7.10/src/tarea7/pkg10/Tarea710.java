package tarea7.pkg10;

import Personal.JefeEstacion;
import java.time.LocalDateTime;

/**
 *
 * @author Irene
 */
public class Tarea710 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JefeEstacion jefe1 = new JefeEstacion("Carlos López", 
                "12345678A", LocalDateTime.now());

        System.out.println("=== Información del Jefe de Estación ===");
        jefe1.mostrarInformacion();
    }

}