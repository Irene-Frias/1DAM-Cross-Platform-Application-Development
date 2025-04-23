package tarea7.pkg4;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("Juan", "12345678A");
        CuentaCorriente cuenta2 = new CuentaCorriente("María", "87654321B");

        System.out.println("=== Estado inicial de las cuentas ===");
        cuenta1.muestraCuenta();
        System.out.println();
        cuenta2.muestraCuenta();

        System.out.println("\nCambiando el nombre del banco...");
        cuenta1.setBanco("Banco de Programadores");

        System.out.println("\n=== Estado después del cambio de banco ===");
        cuenta1.muestraCuenta();
        System.out.println();
        cuenta2.muestraCuenta();
    }
    
}
