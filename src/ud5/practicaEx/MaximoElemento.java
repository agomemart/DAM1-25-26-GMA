package ud5.practicaEx;

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
}
