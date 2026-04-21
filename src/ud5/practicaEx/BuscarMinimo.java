package ud5.practicaEx;

import java.util.Collection;
import java.util.Collections;

public class BuscarMinimo {
    public static <T extends Comparable<T>> T minimo(Collection<T> coleccion) {
        if (coleccion.isEmpty()) {
            return null;
        }

        return Collections.min(coleccion);
    }
}
