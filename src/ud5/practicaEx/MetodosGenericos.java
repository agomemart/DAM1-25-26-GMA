package ud5.practicaEx;

import java.util.List;

public class MetodosGenericos {
    public static <T> int contar(T[] array, T elemento) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int cont = 0;
        for (T e : array) {
            if (elemento == null && e == null) {
                cont++;
            } else {
                if (e.equals(elemento)) {
                    cont++;
                }
            }
        }

        return cont;
    }

    public static <T extends Comparable<T>> T minimo(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            return null;
        }

        T min = null;

        for (T e : lista) {
            if (min == null || e.compareTo(min) < 0) {
                min = e;
            }
        }

        return min;
    }

    public static <T> void intercambiar(List<T> lista, int i, int j) {
        T aux = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, aux);
    }
}
