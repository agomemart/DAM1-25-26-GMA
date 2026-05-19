package ud6.practicaex.entrenamiento;

import java.io.Serializable;
import java.time.LocalDate;

public class Entrenamiento implements Serializable{
    String nombre;
    LocalDate fecha;
    int numKm;
    
    public Entrenamiento(String nombre, LocalDate fecha, int numKm) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.numKm = numKm;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Entrenamiento other = (Entrenamiento) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return nombre + " - " + fecha + " - " + numKm;
    }

    
}
