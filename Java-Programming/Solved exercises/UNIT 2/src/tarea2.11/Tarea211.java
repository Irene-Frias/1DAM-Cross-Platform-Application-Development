package tarea2.pkg11;

import java.util.Scanner;

/** Ask for a week number between 1 and 7 to show the corresponding day of 
 * the week.
 *
 * @author Irene Frías Ramos
 */
public class Tarea211 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number, to return the day of the week to "
                + "which it corresponds.");
        System.out.print("Enter a number between 1 and 7:");
        num = sc.nextInt();
        
        switch (num)
        {
            case 1 -> {
                System.out.println("Monday");
            }
            case 2 -> {
                System.out.println("Tuesday");
            }
            case 3 -> {
                System.out.println("Wednesday");
            }
            case 4 -> {
                System.out.println("Thrusday");
            }
            case 5 -> {
                System.out.println("Friday");
            }
            case 6 -> {
                System.out.println("Saturday");
            }
            case 7 -> {
                System.out.println("Sunday");
            }
            default -> {
                System.out.println("It doesn't exit this day of the week");
            }
        }
    }
    
}
