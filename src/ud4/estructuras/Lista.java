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

    public void clear() {
        elementos = new Integer[0];
    }

    public boolean contains(Integer elemento) {
        for (Integer num : elementos) {
            if (num.equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public Integer get(int index) {
        if (index < elementos.length) {
            return elementos[index];
        }
        return -1;
    }

    public int indexOf(Integer num) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i].equals(num)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int index) {
        if (index < 0 || index >= elementos.length) {
            throw new IndexOutOfBoundsException();
        }

        Integer[] nuevo = new Integer[elementos.length - 1];

        for (int i = 0, j = 0; i < elementos.length; i++) {

            if (i != index) {
                nuevo[j] = elementos[i];
                j++;
            }

        }

        elementos = nuevo;
    }

    public boolean remove(Integer element) {
        int index = indexOf(element);

        if (index == -1) {
            return false;
        }

        remove(index);
        return true;
    }

    public int size() {
        return elementos.length;
    }

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.add(5);
        lista.add(7);
        lista.add(3);
        System.out.println(lista);
    }
}
