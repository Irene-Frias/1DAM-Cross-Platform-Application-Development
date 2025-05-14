package tarea7.pkg13;

/**
 *
 * @author Irene Frías Ramos
 */
public class Pila {
    private Lista lista;

    public Pila() {
        lista = new Lista();
    }

    public void apilar(Integer nuevo) {
        lista.insertarFinal(nuevo);
    }

    public Integer desapilar() {
        if (lista.obtenerTamano() == 0) {
            System.out.println("La pila está vacía");
            return null;
        }
        return lista.eliminarIndice(lista.obtenerTamano() - 1);
    }

    public void mostrarPila() {
        lista.imprimir();
    }
}
