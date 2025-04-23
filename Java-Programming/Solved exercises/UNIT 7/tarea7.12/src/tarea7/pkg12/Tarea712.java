package tarea7.pkg12;

/**
 *
 * @author ALUMNO2425
 */
public class Tarea712 {

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
        
        Lista otraLista = new Lista();
        otraLista.insertarFinal(20);
        otraLista.insertarFinal(25);
        
        lista.concatenar(otraLista);
        System.out.println("Lista después de concatenar otra lista:");
        lista.imprimir();
    }
    
}
