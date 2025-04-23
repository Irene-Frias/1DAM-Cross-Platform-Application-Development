package Maquinaria;



/**
 *
 * @author Irene Frías Ramos
 */
public class Tren {
    int locomotora;
    final int vagon;
    String maquinista;
    
    public Tren(int locomotora, int vagon, String maquinista) {
        this.locomotora = 1;
        this.vagon = 5;
        this.maquinista = maquinista;
    }
    
    public void comprobarVagon(){
        if (vagon <= 5) {
            System.out.println("Es posible");
        } else {
            System.out.println("El máximo de vagones es 5");
        }
    }
    
}
