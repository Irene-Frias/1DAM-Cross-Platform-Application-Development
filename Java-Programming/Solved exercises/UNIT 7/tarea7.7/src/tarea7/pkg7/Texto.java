package tarea7.pkg7;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author ALUMNO2425
 */
public class Texto {
    public String cadena;
    private final int LONGITUD;
    private final String VOCALES = "aeiouáéíóú";
    private LocalDate creacion;
    private LocalDateTime ultModificacion;

    public Texto(int longitud) {
        this.cadena = "";
        this.LONGITUD = longitud; 
        this.creacion = LocalDate.now();
        this.ultModificacion = null;
    }

    public void anydirLetraInicio(char c) {
        if (cadena.length() < LONGITUD) {
            this.cadena = c + this.cadena;
            ultModificacion = LocalDateTime.now();
        }
    }

    public void anydirLetraFinal(char c) {
        if (cadena.length() < LONGITUD) {
            this.cadena += c;
            ultModificacion = LocalDateTime.now();
        }
    }

    public void anydirCadenaInicio(String cad) {
        if (cadena.length() + cad.length() <= LONGITUD) {
            this.cadena = cad + this.cadena;
            ultModificacion = LocalDateTime.now();
        }
    }

    public void anydirCadenaFinal(String cad) {
        if (cadena.length() + cad.length() <= LONGITUD) {
            this.cadena += cad;
            ultModificacion = LocalDateTime.now();
        }
    }

    public void imprimir() {
        System.out.println("El texto fue creado el: " + creacion);
        System.out.println("Última modificación: " + ultModificacion);
        System.out.println("Texto actual: " + this.cadena);
    }

    private boolean esVocal(char c) {
        boolean vocal = false;
        c = Character.toLowerCase(c);
        if (VOCALES.indexOf(c) != -1){
            vocal = true;
        }
        return vocal;
    }

    public int contarVocales() {
        int vocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i))) {
                vocales++;
            }
        }
        return vocales;
    }
}

