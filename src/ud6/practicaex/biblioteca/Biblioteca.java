package ud6.practicaex.biblioteca;

import java.io.Serializable;
import java.time.LocalDate;

public class Biblioteca implements Serializable{
    String nombre;
    String titulo;
    LocalDate fechaPrestamo;
    int diasPrestamo;
    
    public Biblioteca(String nombre, String titulo, LocalDate fechaPrestamo, int diasPrestamo) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.fechaPrestamo = fechaPrestamo;
        this.diasPrestamo = diasPrestamo;
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
        Biblioteca other = (Biblioteca) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return nombre + " - " + titulo + " (" + fechaPrestamo + ")";
    }

    
}
