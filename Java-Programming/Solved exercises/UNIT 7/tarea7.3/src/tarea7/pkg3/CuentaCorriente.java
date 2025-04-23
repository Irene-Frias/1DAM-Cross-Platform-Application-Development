package tarea7.pkg3;

/**
 *
 * @author Irene Frías Ramos
 */
public class CuentaCorriente {

    public double saldo;
    public String nombre;
    String dni;

    CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
    }

    void sacarDinero(double decremento) {
        if (this.saldo < decremento) {
            System.out.println("No es posible llevar a cabo la operación. Saldo insuficiente.");
        } else {
            this.saldo -= decremento;
            System.out.println("Tu saldo restante es de " + this.saldo + " €");
        }
    }

    void ingresarSaldo(double incremento) {
        saldo += incremento;
    }

    void muestraCuenta() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
    }
}
