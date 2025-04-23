package tarea7.pkg6;

/**
 *
 * @author Irene Frías Ramos
 */
public class Hora {
    private byte hora;
    private byte min;
    private byte seg;
    
    public int getHora() {
        return this.hora;
    }
    
    public void setHora(int hora) {
        if (0 <= this.hora && this.hora <= 23) {
            this.hora = (byte) hora;
        } else {
            this.hora = 0;
        }
    }
    
    public int getMin() {
        return this.min;
    }
    
    public void setMin(int min) {
        if (0 <= this.min && this.min <= 59) {
            this.min = (byte) min;
        } else {
            this.min = 0;
        }
    }
    
    public int getSeg() {
        return this.seg;
    }
    
    public void setSeg(int seg) {
        if (0 <= this.seg && this.seg <= 59) {
            this.seg = (byte) seg;
        } else {
            this.seg = 0;
        }
    }
    
    public void aumentarSeg() {
        this.seg++;
        if (this.seg == 60) {
            this.seg = 0;
            this.min++;
            if (this.min == 60) {
                this.min = 0;
                this.hora++;
                if (this.hora == 24) {
                    this.hora = 0;
                }
            }
        }
    }
            
}
