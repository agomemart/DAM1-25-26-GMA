package ud5;

public class Contenedor<T> {
    private T objeto;

    public Contenedor() {

    }

    void guardar(T nuevo) {
        objeto = nuevo;
    }

    T extraer() {
        T res = objeto;
        objeto = null;
        return res;
    }

    public static void main(String[] args) {
        Contenedor<Integer> c = new Contenedor<>();
        c.guardar(7);

        Contenedor<String> cStr = new Contenedor<>();
        cStr.guardar("roca");

        //Double x = (Double) c.extraer(); //error compilación
    }
}

