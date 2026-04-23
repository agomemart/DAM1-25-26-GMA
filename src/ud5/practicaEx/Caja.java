package ud5.practicaEx;

public class Caja<T> {
    private T contenido;

    public Caja(T contenido) {
        this.contenido = contenido;
    }

    public boolean guardar(T elemento) {
        if (elemento == null) {
            return false;
        }

        this.contenido = elemento;

        return true;
    }

    public T obtener() {
        return contenido;
    }

    @Override
    public String toString() {
        return contenido.toString();
    }

    
}
