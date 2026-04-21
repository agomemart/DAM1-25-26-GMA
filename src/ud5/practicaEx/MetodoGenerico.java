package ud5.practicaEx;

public class MetodoGenerico {
    public static <T> boolean contiene(T[] array, T elemento) {
        if (array == null || array.length == 0) {
            return false;
        }
        for (T item : array) {
            if (item == null && elemento == null) {
                return true;
            }
            if (item != null && item.equals(elemento)) {
                return true;
            }
        }

        return false;
    } 
}
