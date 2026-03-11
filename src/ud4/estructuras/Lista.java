package ud4.estructuras;

import java.util.Arrays;

public class Lista {
    Integer[] elementos;

    public Lista() {
        elementos = new Integer[0];
    }

    public boolean add(Integer e) {
        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        elementos[elementos.length - 1] = e;
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.add(5);
        lista.add(7);
        lista.add(3);
        System.out.println(lista);
    }
}
