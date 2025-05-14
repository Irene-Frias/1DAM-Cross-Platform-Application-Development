package tarea2.pkg12;

import java.util.Scanner;

/** Ask for the day, month and year and indicate if the date is correct 
 * taking into account leap months,...
 *
 * @author Irene Frías Ramos
 */
public class Tarea212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day, month, year;
        boolean date;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a day: ");
        day = sc.nextInt();
        
        System.out.println("Enter a month: ");
        month = sc.nextInt();
        
        System.out.println("Enter a year: ");
        year = sc.nextInt();
        
        if (year == 0)
        {
            date = false;
        }
        else {
            if (month == 2 && (1 <= day && day <= 28)){
                    date = true; 
                }
            else if ((month == 4 || month == 6 || month == 9 || month == 11)
                    && (1 <= day && day <= 30)){
                date = true;
            }
            else {
                if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
                        month == 10 || month == 12) && (1 <= day && day <= 31)) {
                    date = true;
                }
                else {
                    date = false;
                }
            }
            if (date == true)
            {
                System.out.println("Valid day: " + day + "/" + 
                        month + "/" + year);
            }
            else {
                System.out.println("Invalid day");
            }
        }
    }
    
}
