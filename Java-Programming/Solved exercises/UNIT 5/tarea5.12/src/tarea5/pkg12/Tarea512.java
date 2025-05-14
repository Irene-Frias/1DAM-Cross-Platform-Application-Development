package tarea5.pkg12;

// import java.util.Arrays;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea512 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t[][] = new int [5][5];
        
        for (int n = 0; n < t.length; n++) {
            for (int m = 0; m < t[n].length; m++) {
                t[n][m] = 10 * n + m;      
            }            
        }        
        // System.out.println(Arrays.deepToString(t));
        
        for (int fila[] : t){
            for (int elem : fila){
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    
}
