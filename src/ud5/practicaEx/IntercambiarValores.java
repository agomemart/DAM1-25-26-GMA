package ud5.practicaEx;

public class IntercambiarValores {
    public static <T> void intercambiar(T[] array, int i, int j) {
        if (array == null || i < 0 || j < 0 || i >= array.length || j >= array.length) {
            throw new IllegalArgumentException("Índices inválidos");
        }
        T elementoI = array[i];
        T elementoJ = array[j];
        array[i] = elementoJ;
        array[j] = elementoI;
    }

    public static <T> void mostrar(T[] array) {
        if (array == null) {
            return;
        }
        for (T t : array) {
            System.out.println(String.valueOf(t));
        }
    }
}
