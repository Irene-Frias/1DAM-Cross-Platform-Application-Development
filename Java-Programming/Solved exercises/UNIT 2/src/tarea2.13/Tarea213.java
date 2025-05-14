package tarea2.pkg13;

import java.util.Scanner;

/** Create a program that enters the hour, minutes, and seconds and displays 
 * the incremented time.
 *
 * @author Irene Frías Ramos
 */
public class Tarea213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hour, min, seg;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the hours: ");
        hour = sc.nextInt();
        
        System.out.print("Enter the minutes: ");
        min = sc.nextInt();
        
        System.out.print("Enter the seconds: ");
        seg = sc.nextInt();
        
        System.out.println("The time is: " + hour + ":" + min + ":" + seg);
        
        seg++;
        if (seg > 59)
        {
            min = 0;
            if (min > 59)
            {
                min = 0;
                hour++;
                if (hour > 23)
                {
                    hour = 0;
                }
            }
            else {
                System.out.println("The values entered are not correct");
            }
        }
        System.out.println("The increased time is: " + hour + ":" + min +
                ":" + seg);
    }
    
}
