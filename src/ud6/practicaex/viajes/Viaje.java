package ud6.practicaex.viajes;

import java.io.Serializable;
import java.time.LocalDate;

public class Viaje implements Serializable{
    String destino;
    LocalDate fecha;
    String transporte;
    double precio;
    boolean seguro;
    
    

    public Viaje(String destino, LocalDate fecha, String transporte, double precio, boolean seguro) {
        this.destino = destino;
        this.fecha = fecha;
        this.transporte = transporte;
        this.precio = precio;
        this.seguro = seguro;
    }



    @Override
    public String toString() {
        return destino + " (" + fecha + ") - " + precio + " euros";
    }

    
}
