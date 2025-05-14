package tarea7.pkg5;

/**
 *
 * @author Irene Frías Ramos
 */
public class CuentaCorriente {

    public double saldo;
    public String nombre;
    String dni;
    Gestor gestor;

    CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
        gestor = null;
    }

    CuentaCorriente(String dni, String nombre, Gestor g) {
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
        this.gestor = g;
    }

    void setGestor(Gestor gestor){
        this.gestor = gestor;
    }
    
    void sacarDinero(double decremento, double saldo) {
        saldo -= decremento;
        if (this.saldo < decremento) {
            System.out.println("No es posible llevar a cabo la operación");
        } else {
            System.out.println("Tu saldo restante es de " + saldo + " € ");
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
