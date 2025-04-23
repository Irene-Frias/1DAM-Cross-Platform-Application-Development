package Maquinaria;



/**
 *
 * @author Irene Frías Ramos
 */
public class Locomotora {
    public String matricula;
    public double potencia;
    public int antiguedad;
    public String mecanico;
    
    public Locomotora(String matricula, double potencia, int antiguedad,
            String mecanico){
        this.matricula = matricula;
        this.potencia = potencia;
        this.antiguedad = antiguedad;
        this.mecanico = mecanico;
    }
    
}
