package tarea2.pkg10;

import java.util.Scanner;

/** Ask for a full grade between 0 and 10. Insufficient (0 and 4) Sufficient 
 * (5) Good (6) Notable (7 and 8) and Outstanding (9 and 10)
 *
 * @author Irene Frías Ramos
 */
public class Tarea210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a note: ");
        nota = sc.nextInt();
        
        if (0 <= nota && nota < 5) {
            System.out.println("Insufficient");
        } else if (nota == 5) {
            System.out.println("Sufficient");
        } else if (nota == 6) {
            System.out.println("Good");
        } else if (nota == 7 || nota == 8){
            System.out.println("Notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Outstanding");
        } else {
            System.out.println("Error, note doesn't exit");
        }
        
        switch (nota){
            case 0, 1, 2, 3, 4 -> {
                System.out.println("Insufficient");
            }
            case 5 -> {
                System.out.println("Sufficient");
            }
            case 6 -> {
                System.out.println("Good");
            }
            case 7, 8 -> {
                System.out.println("Notable");
            }
            case 9, 10 -> {
                System.out.println("Outstanding");
            }
            default -> {
                System.out.println("Error, note doesn't exit");
            }
        }
    }
    
}
