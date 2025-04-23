package tarea5.pkg2.pkg2;

import java.util.Arrays;

/**
 *
 * @author ALUMNO2425
 */
public class Tarea522 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tabla[] = new double [10];
        double tabla1[] = tabla;
        double tabla2[] = tabla1;
        
        System.out.println("Tabla: " + Arrays.toString(tabla));
        System.out.println("Tabla1: " + Arrays.toString(tabla1));
        System.out.println("Tabla2: " + Arrays.toString(tabla2));
    }
    
}
