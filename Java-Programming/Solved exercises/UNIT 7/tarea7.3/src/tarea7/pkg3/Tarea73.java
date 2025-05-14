package tarea7.pkg3;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("26458457P", "Irene");
        
        c.nombre = "Irene";
        System.out.println(c.nombre);
        
        c.dni = "83269785T";
        System.out.println(c.dni);
        
        c.saldo = 200;
        System.out.println(c.saldo);
              
        
        System.out.println("=== Estado de la cuenta ===");
        c.muestraCuenta();
    }
    
}
