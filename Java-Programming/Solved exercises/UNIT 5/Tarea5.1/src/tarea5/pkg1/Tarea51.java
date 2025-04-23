package tarea5.pkg1;


/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valores[] = new int [10];
        
        for (int i = 0; i < valores.length; i++){
            valores[i] = (int) (Math.random()* 100 + 1);
            System.out.print(valores[i] + " ");
        }
        
        int suma = 0;
        for (int i = 0; i < valores.length; i++){
            suma += valores[i];
        }
        
        // Repito lo anterior con la sentencia for-each
        for (int valor : valores){
            suma += valor;
        }
        
        System.out.println("\n La suma de la tabla es: " + suma);
    }
    
}
