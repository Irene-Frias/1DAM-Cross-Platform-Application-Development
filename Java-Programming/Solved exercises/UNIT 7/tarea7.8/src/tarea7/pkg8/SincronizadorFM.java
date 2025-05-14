package tarea7.pkg8;

/**
 *
 * @author Irene
 */
public class SincronizadorFM {
    double frecuencia;
    
    public SincronizadorFM(double frecuenciaInicio) {
        if (frecuenciaInicio < 80){
            this.frecuencia = 80;
        } else if (frecuenciaInicio > 180) {
            this.frecuencia = 180;
        } else {
            this.frecuencia = frecuenciaInicio;
        }
    }
    
    public double frecuenciaUp() {
        frecuencia += 0.5;
        compruebaFrecuencia();
        return frecuencia;
    }
    
    public double frecuenciaDown() {
        frecuencia -= 0.5;
        compruebaFrecuencia();
        return frecuencia;
    }
    
    public void compruebaFrecuencia() {
        if (frecuencia < 80){
            this.frecuencia = 180;
        } else if (frecuencia > 180) {
            this.frecuencia = 80;
        } else {
            this.frecuencia = frecuencia;
        } 
    }
    
    public void display() {
        System.out.println("La frecuencia es de " + frecuencia + " MHz");
    }
    
}
