package Personal;
import java.time.LocalDateTime;

/**
 *
 * @author Irene
 */
public class JefeEstacion {
    String nombre;
    final String DNI;
    LocalDateTime fechEstacion;

    public JefeEstacion(String nombre, String DNI, LocalDateTime fechEstacion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechEstacion = fechEstacion;
    }

    public void mostrarInformacion() {
        System.out.println("Jefe de Estación: " + nombre);
        System.out.println("DNI: " + DNI);
        System.out.println("Fecha de asignación: " + fechEstacion);
    }
}
