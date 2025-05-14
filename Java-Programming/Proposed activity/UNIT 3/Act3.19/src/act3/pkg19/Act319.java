package act3.pkg19;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act319 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num, raiz, cuadrado = 0, cuadradoValido = 1, resto, aprox = 1;
        int cont = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        raiz = Math.sqrt(num);

        while (cuadrado < num){
            cuadrado = (int)Math.pow(aprox, 2);
        
            if (cuadrado <= num){
                cuadradoValido = cuadrado;
                cont++;
            }               
            aprox++;
        }
        resto = num - cuadradoValido;
        System.out.println("La raíz cuadrada de " + num + " es " + cont);
    }

}
