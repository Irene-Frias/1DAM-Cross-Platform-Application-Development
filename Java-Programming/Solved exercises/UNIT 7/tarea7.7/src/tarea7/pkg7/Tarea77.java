package tarea7.pkg7;

/**
 *
 * @author ALUMNO2425
 */
public class Tarea77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Texto t = new Texto(12);
        t.anydirCadenaInicio("Hola");
        t.anydirLetraFinal(' ');
        t.anydirCadenaFinal("que ");
        t.anydirCadenaFinal("tal");
        t.imprimir();
        System.out.println("Número total de vocales: " + t.contarVocales());
    }
    
}
