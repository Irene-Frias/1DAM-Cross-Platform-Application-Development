package tarea1.pkg13;

import java.util.Scanner;

/**Calculate the average of the three notes, one 
 * for the report without decimals and one with decimals
 *
 * @author Irene Frías Ramos
 */
public class Tarea113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start the value.
        int note1, note2, note3;
        int newsletter;
        double medium;
        
        // Create a scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down 
        // the first note.
        System.out.print("Write the first quarter note: ");
        note1 = sc.nextInt();
        
        // To show the user what to do, in this case is to write down 
        // a second note.
        System.out.print("Write the second quarter note: ");
        note2 = sc.nextInt();
        
        // To show the user what to do, in this case is to write down 
        // a third note.
        System.out.print("Write the third therd note: ");
        note3 = sc.nextInt();
        
        // Calculate the average of the three notes with decimals.
        medium = (note1 + note2 + note3) / 3.0;
        System.out.println("The average grade of the course in the report card "
                + "(with decimals): " + medium);
        
        // Calculate the average of the three notes without decimals.
        newsletter = (int) medium;
        System.out.println("The average grade of the course in the report card"
                + "(without decimals:" + newsletter);
    }
    
}
