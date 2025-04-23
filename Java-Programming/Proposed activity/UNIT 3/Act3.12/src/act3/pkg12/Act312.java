package act3.pkg12;

import java.util.Scanner;

/**
 *
 * @author Irene Frías Ramos
 */
public class Act312 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int binario;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número binario: ");
        binario = sc.nextInt();
        
        int ult_digito = 0;
        int potencia = 0;
        while (binario >= 0){
            ult_digito = binario % 10;
            binario += ult_digito * (Math.pow (2, potencia));
            potencia++;
            binario /= 10;
        }
        System.out.println("El número binario es " + ult_digito);
    }
    
}
