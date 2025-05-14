package personaldata;

import java.util.Scanner;

/** The program asks the user to enter their name and age, 
 * and then prints a message with that information.
 *
 * @author Irene Frías Ramos
 */
public class PersonalData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        int age;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Write your name: ");
        name = sc.nextLine();
        
        System.out.print("Write your age: ");
        age = sc.nextInt();
        
        System.out.println("Hello, " + name + " you are " + age + " years old.");
    }
    
}
