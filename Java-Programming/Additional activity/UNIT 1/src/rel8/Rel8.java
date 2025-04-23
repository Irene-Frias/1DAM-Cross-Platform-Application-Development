package rel8;

import java.util.Scanner;
import java.util.Locale;

/** Write a program that calculates the weekly salary of 
 * an employee based on the hours worked, at a rate of 12 euros per hour.
 *
 * @author Irene Frías Ramos
 */
public class Rel8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hours, w_salary;
        final double euros = 12;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Write the hours the employee has worked: ");
        hours = sc.nextDouble();
        
        w_salary = hours * euros;
        System.out.println("An employee's weekly salary based on hours "
                + "worked is: " + w_salary);
    }
    
}
