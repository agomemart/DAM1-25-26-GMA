package ud6.practicaex.peliculas;

import java.io.Serializable;
import java.time.LocalDate;

public class Pelicula implements Serializable{
    String titulo;
    String genero;
    LocalDate fechaVista;
    int puntuacion;
    
    public Pelicula(String titulo, String genero, LocalDate fechaVista, int puntuacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.fechaVista = fechaVista;
        this.puntuacion = puntuacion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((fechaVista == null) ? 0 : fechaVista.hashCode());
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
        Pelicula other = (Pelicula) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (fechaVista == null) {
            if (other.fechaVista != null)
                return false;
        } else if (!fechaVista.equals(other.fechaVista))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return titulo + " - " + genero + " - " + puntuacion;
    }

    
}
