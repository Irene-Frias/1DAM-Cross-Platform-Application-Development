package calculatebmi;

import java.util.Scanner;

/** The program asks the user to enter their weight in kilograms and 
* their height in meters, and then calculates the Body Mass Index (BMI)
 *
 * @author Irene Frías Ramos
 */
public class CalculateBMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double weight, height, BMI;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your weight in kilograms (kg): ");
        weight = sc.nextDouble();
        
        System.out.print("Enter your weight in height (m): ");
        height = sc.nextDouble();
        
        BMI = weight / Math.pow(height, 2);
        System.out.println("Your Body Mass Index is: " + BMI);
    }
    
}
