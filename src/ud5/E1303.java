package ud5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import ud3.Util;

public class E1303 {
    public static void main(String[] args) {
        List<String> alumnado = Arrays.asList(Util.readFileToStringArray("null"));
        String maximo = max(alumnado,Comparator.naturalOrder());
        System.out.println(maximo);
    }

    static <T> T max(List<T> lista, Comparator<T> comparador) {
        T max = lista.getFirst();
        for (T t : lista) {
            if (comparador.compare(t, max) > 0) {
                max = t;
            }
        }
        return max;
    }
}
