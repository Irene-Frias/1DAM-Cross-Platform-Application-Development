package tarea1.pkg5;

/** Check between 32768 and 32767 short values the maximum and minimum value.
 *
 * @author Irene Frías Ramos
 */
public class Tarea15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Star the variable and inicialize 32767.
        short num;
        num = 32767;
        
        // Print to show it to the user. (maximum)
        System.out.println("Maximum value for short: " + num);
        
        // Add one.
        num++;
        
        // Print to show it to the user. (minimum)
        System.out.println("Minimum value for short: " + num);
    }
    
}
