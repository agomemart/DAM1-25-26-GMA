package ud5.practicaEx;

import java.util.List;

public class MaximoElemento {
    public static <T extends Comparable<T>> T maximo(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return max;
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
}
