package tarea7.pkg2;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("21345678I", "Irene", 100);

        System.out.println("=== Estado inicial de la cuenta 1 ===");
        cuenta1.muestraCuenta();

        CuentaCorriente cuenta2 = new CuentaCorriente("1235456", "Irene");
        
        System.out.println("=== Estado inicial de la cuenta 2 ===");
        cuenta2.muestraCuenta();

        CuentaCorriente cuenta3 = new CuentaCorriente("1235456", 54);
        
        System.out.println("=== Estado inicial de la cuenta 3 ===");
        cuenta3.muestraCuenta();
    }

}
