package ud3.arrays.practicaex;

public class EstaOrdenado {
    static boolean estaArrayOrdenado(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        boolean asc = true;
        boolean desc = true;

        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length) {
                if (array[i] > array[i + 1]) {
                    asc = false;
                } else if (array[i] < array[i + 1]) {
                    desc = false;
                }
            }
        }

        return asc || desc;
    }
}
