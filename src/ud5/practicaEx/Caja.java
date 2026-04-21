package ud5.practicaEx;

public class Caja<T> {
    T valor;

    public void guardar(T v) {
        valor = v;
    }

    public T obtener() {
        return valor;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
