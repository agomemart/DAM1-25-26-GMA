package ud5.practicaEx;

import java.util.List;

public class Genericos2 {
    public static <T> int contar(T[] array, T elemento) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int cont = 0;
        for (T e : array) {
            if (elemento == null && e == null) {
                cont++;
            } else if (e != null && e.equals(elemento)) {
                cont++;
            }
        }

        return cont;
    }

    public static <T extends Comparable<T>> T maximo(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            return null;
        }

        T max = lista.get(0);
        for (T e : lista) {
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        return max;
    }

    public static <T> void intercambiar(List<T> lista, int i, int j) {
        if (lista == null || lista.isEmpty() || i < 0 || j < 0 || i >= lista.size() || j >= lista.size())
            return;

        T aux = lista.get(i);

        lista.set(i, lista.get(j));
        lista.set(j, aux);

    }
}
