/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea7.pkg1;

/**
 *
 * @author Irene
 */
public class Tarea71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "Juan Pérez");

        System.out.println("=== Estado inicial de la cuenta ===");
        cuenta1.muestraCuenta();

        System.out.println("\nIngresando 500€...");
        cuenta1.ingresarSaldo(500);
        cuenta1.muestraCuenta();
        
        System.out.println("\nIntentando sacar 200€...");
        cuenta1.sacarDinero(200);
        cuenta1.muestraCuenta();

        System.out.println("\nIntentando sacar 400€...");
        cuenta1.sacarDinero(400);
        cuenta1.muestraCuenta();
    }
    
}
