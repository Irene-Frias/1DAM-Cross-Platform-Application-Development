package tarea5.pkg6;

import java.util.Arrays;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t[] = {2, 4, 6, 1, 3, 5};
        int t2[] = {1, 2, 3, 4, 5, 6};
        int acierto;
        
        acierto = primitiva(t, t2);
        System.out.println("" + acierto);
    }
    
    static int primitiva (int apuesta[], int premio[]) {
        int acierto = 0;
        
        for (int a : apuesta){
            if (Arrays.binarySearch(premio, a) >= 0){
                acierto++;
            }
        }
        
        return acierto;
    }
    
}
