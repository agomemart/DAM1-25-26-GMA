package ud5.practicaEx;

public class ContarNulls {
    public static <T> int contarNulls(T[] array) {
        if (array == null ||array.length == 0) {
            return 0;
        }

        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                cont++;
            }
        }

        return cont;
    }
}
