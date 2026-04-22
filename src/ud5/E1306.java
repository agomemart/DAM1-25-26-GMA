package ud5;


import java.util.function.Consumer;

public class E1306 {
    static <T> void paraCada(T[] t, Consumer<T> c) {
        for (T e : t) {
            c.accept(e);
        }
    }

    public static void main(String[] args) {
        Cliente[] clientes = {
            new Cliente("77777777S", "Adrián", "01/01/2000"),
            new Cliente("77777778S", "Pepe", "02/02/2009"),
            new Cliente("77777779S", "Juan", "02/02/2008")
        };
        
        Consumer<Cliente> accion = c -> System.out.println(c.nombre + " (" + c.getEdad() + ")");

        paraCada(clientes, accion);
    }
}
