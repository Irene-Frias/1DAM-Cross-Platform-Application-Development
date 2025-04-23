package tarea7.pkg5;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gestor gest1 = new Gestor("Irene", "635 665 159");
        Gestor gest2 = new Gestor ("Daniel", "6548789825");
        CuentaCorriente c = new CuentaCorriente("98754545", "Irene", gest1);
        
        System.out.println("=== Estado inicial de la cuenta ===");
        gest2.mostrarInformacion();
        c.setGestor(gest2);
        c.muestraCuenta();
        c.muestraCuenta();
    }

}
