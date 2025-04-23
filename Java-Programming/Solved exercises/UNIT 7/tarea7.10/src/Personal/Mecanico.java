package Personal;



/**
 *
 * @author Irene
 */
public class Mecanico {
    String nombre;
    String telefono;
    String especialidad;

    enum Especialidad {
        FRENOS, HIDRAULIZA, ELECTRICIDAD, MOTOR
    }

    public Mecanico(String nombre, String telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad.valueOf(especialidad);
    }
}
