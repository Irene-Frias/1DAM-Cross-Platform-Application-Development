package tarea1.pkg4;

import java.util.Scanner;

/** Ask the user about their current year and when they were born.
 * After writing down the years they will have next year.
 *
 * @author Irene Frías Ramos
 */
public class Tarea14 {


    public static void main(String[] args) {
        // Start the value.
        int year;
        int born_date;
        int age;
        
        // Create a new scanner.
        Scanner sc = new Scanner(System.in);
        
        // To show the user what to do, in this case is to write down the 
        // current year.
        System.out.print("Write the current year: ");
        
        // This is the value that the user write and presses enter.
        year = sc.nextInt();
        
        // To show the user what to do, in this case is to write down the 
        // born date.
        System.out.print("Born date: ");
        
        // This is the value that the user write and presses enter.
        born_date = sc.nextInt();
        
        // Calculate the age with the value that start the user.
        age = year - born_date;
        
        // Print to show it to the user.
        System.out.println("This is your age: " + age);
        
    }
    
}
