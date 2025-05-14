package tarea7.pkg4;

/**
 *
 * @author Irene Frías Ramos
 */
public class CuentaCorriente {
    String nombre;
    String tuNombre;
    String dni;
    int saldo;

    CuentaCorriente(String nombre, String dni) {
        this.tuNombre = nombre;
        this.dni = dni;
    }

    void muestraCuenta() {
        System.out.println("Nombre: " + tuNombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
    }

    static private String nombreBanco = "International Java Bank";

    void setBanco(String nombreNuevo) {
        nombreBanco = nombreNuevo;
    }

    String getBanco() {
        return nombreBanco;
    }
    
}
