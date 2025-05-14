/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7.pkg1;

/**
 *
 * @author Irene
 */
public class CuentaCorriente {

    String dni;
    String nombre;
    double saldo;

    CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0;
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
