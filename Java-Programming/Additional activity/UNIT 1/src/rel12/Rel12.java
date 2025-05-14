package rel12;

import java.util.Scanner;
import java.util.Locale;

/** Create a program that calculates the grade that needs to be obtained 
 * in the Second exam of the Programming subject to obtain the desired 
 * average. It must be taken into account that the grade of the first exam 
 * counts 40% and that of the second exam 60%.
 *
 * @author Irene
 */
public class Rel12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double note_exam, quarter, average;
        final double first_exam = 0.4;
        final double second_exam = 0.6;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Enter the grade of the first exam: ");
        note_exam = sc.nextDouble();
        
        System.out.print("What grade do you want to get in the quarter? ");
        quarter = sc.nextDouble();
        
        average = quarter - (note_exam * first_exam);
        average = average / second_exam;
        
        System.out.printf("Para tener un " + quarter + " en el trimestre necesitas "
                + "sacar un " + average + " en el segundo examen.\n");
    }
    
}
