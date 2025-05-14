package converttemperature;

import java.util.Scanner;

/** The program asks the user to enter a temperature in degrees 
 * Celsius and converts it to Fahrenheit.
 *
 * @author Irene Frías Ramos
 */
public class ConvertTemperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double celsius, fahrenheit;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a temperature in degrees Celsius: ");
        celsius = sc.nextDouble();
        
        fahrenheit = (9 / 5) * celsius + 32;
        System.out.println("The conversion to Fahrenheit is: " 
                + fahrenheit + " degrees Fahrenheit.");
    }
    
}
