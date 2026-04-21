package ud5.practicaEx;

public class ContarOcurrencias {
    public static <T> int contar(T[] array, T elemento) {
        if(array == null || array.length == 0) {
            return 0;
        }

        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null && array[i].equals(elemento)) {
                contador++;
            }
        }

        return contador;
    }
}
