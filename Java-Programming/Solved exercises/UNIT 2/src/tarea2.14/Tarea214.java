package tarea2.pkg14;

import java.util.Scanner;

/** Create a schedule that enters the day, month, and year so that it displays
 * the next day
 *
 * @author Irene Frías Ramos
 */
public class Tarea214 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day, month, year;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a day: ");
        day = sc.nextInt();
        
        System.out.println("Enter a month: ");
        month = sc.nextInt();
        
        System.out.println("Enter a year: ");
        year = sc.nextInt();
        
        if (day <= 1 || day < 31)
        {
            if (month >= 12)
            {
                month = 1;
                if (year > 0)
                {
                    year++;
                }
            }
            System.out.println("The day is: " + day + "/" + month + "/" + year);
        }
        else {
            System.out.println("Any of the days or months entered is"
                    + " not valid");
        }
    }
    
}
