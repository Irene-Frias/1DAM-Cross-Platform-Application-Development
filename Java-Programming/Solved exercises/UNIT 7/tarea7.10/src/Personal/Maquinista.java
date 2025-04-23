package Personal;



/**
 *
 * @author Irene
 */
public class Maquinista {
    String nombre;
    final String DNI;
    double sueldo;
    int rango;
    
    public Maquinista(String nombre, String DNI, double sueldo, int rango){
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.rango = rango;
    }
}
