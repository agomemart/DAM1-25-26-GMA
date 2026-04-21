package ud5.practicaEx;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparadorGenerico {
    public static <T> void ordenar(List<T> lista, Comparator<T> comp) {
        Collections.sort(lista, comp);
    }
}
