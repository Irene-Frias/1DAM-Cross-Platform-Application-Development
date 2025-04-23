package tarea7.pkg2;

/**
 *
 * @author Irene Frías Ramos
 */
public class CuentaCorriente {
    String dni;
    String nombre;
    double saldo;
    
    CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    CuentaCorriente(String dni, String nombre) {
        this(dni, nombre, 0);
        /* Esto es lo mismo que arriba.  
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0; */
    }
    
    CuentaCorriente(String dni, double saldo) {
        this(dni, "Sin asignar", 0);
        /* Esto es lo mismo que arriba. 
        this.dni = dni;
        this.saldo = saldo;
        nombre = "Sin asignar"; */        
    }
    
    void muestraCuenta() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
    }
    
}
