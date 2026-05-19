package ud6.practicaex.bibliotecatexto;

public class Libro {
    String titulo;
    String autor;
    int valoracion;
    String comentario;
    
    public Libro(String titulo, String autor, int valoracion, String comentario) {
        this.titulo = titulo;
        this.autor = autor;
        this.valoracion = valoracion;
        this.comentario = comentario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
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
        Libro other = (Libro) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " - " + valoracion + " puntos";
    }

    
}
