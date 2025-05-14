package tarea7.pkg11;

/**
 *
 * @author Irene Frías Ramos
 */
public class Tarea711 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        lista.insertarFinal(5);
        lista.insertarFinal(10);
        lista.insertarInicio(1);
        lista.insertarIndice(1, 3);
        
        System.out.println("Lista después de inserciones:");
        lista.imprimir();
        
        lista.eliminarIndice(2);
        System.out.println("Lista después de eliminar el índice 2:");
        lista.imprimir();
        
        int posicion = lista.buscarNum(10);
        System.out.println("El número 10 está en la posición: " + posicion);
        
        lista.insertarFinal(20);
        lista.insertarFinal(25);
    }
}
