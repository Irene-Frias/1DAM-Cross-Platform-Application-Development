package calculatedistancepoints;

import java.util.Scanner;

/** The program requests the coordinates of two points in the plane 
 * (x1, y1) and (x2, y2) and calculates the distance between them 
 * using the formula:
 * distance = root ((x2−x1)^2 + 2+(y2−y1)^2)
 * 
 * @author Irene Frías Ramos
 */
public class CalculateDistancePoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1, y1, x2, y2, distance;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Write a number of 'x1': ");
        x1 = sc.nextDouble();
        
        System.out.print("Write a number of 'y1': ");
        y1 = sc.nextDouble();
        
        System.out.print("Write a number of 'x2': ");
        x2 = sc.nextDouble();
        
        System.out.print("Write a number of 'y1': ");
        y2 = sc.nextDouble();
        
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.print("Write a number of 'y1': ");
    }
    
}
