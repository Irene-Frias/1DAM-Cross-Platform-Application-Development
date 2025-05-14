package tarea7.pkg13;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea713 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila =  new Pila();

        System.out.println("Apilando elementos 10, 20, 30,... ");
        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);

        pila.mostrarPila();

        System.out.println("Desapilado elementos,... " );
        pila.desapilar();
        
        pila.mostrarPila(); 
    }
    
}
