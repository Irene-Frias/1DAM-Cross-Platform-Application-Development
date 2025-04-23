package tarea7.pkg5;

/**
 *
 * @author Irene Frías Ramos
 */
public class Gestor {
    String nombre;
    String telefono;
    double importe;
    
    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importe = importe;
    }
                       
    String getTelefono(String telefono) {
        return this.telefono;
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Importe: " + this.importe);
    }
    
}
