package tarea3.pkg3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int n_secreto;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        
        n_secreto = ((int) Math.random()* 99 + 1);
        while (n_secreto != num && num != -1){
            if (n_secreto > num){
                System.out.println("Es mayor");
            } else {
                System.out.println("Es menor");
            }
            System.out.print("Introduzca otro número: ");
            num = sc.nextInt();
        }
        if (n_secreto == num){
            System.out.println("Son iguales");
        } else {
            System.out.println("Te has rendido");
        }
    }
    
}
