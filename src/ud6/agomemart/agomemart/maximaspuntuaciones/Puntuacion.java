package ud6.agomemart.maximaspuntuaciones;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Adrián Gómez
 */
public class Puntuacion implements Serializable {
    String nombre;
    int puntuacion;
    LocalDateTime fechaActual;

    public Puntuacion(String nombre, int puntuacion, LocalDateTime fechaActual) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.fechaActual = fechaActual;
    }

    @Override
    public String toString() {
        return nombre + " (" + puntuacion + " puntos)";
    }

}
