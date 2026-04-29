package ud5.practicaEx;

import java.util.Collections;
import java.util.List;

public class Genericos3 {
    public static <T> int contar(List<T> lista, T elemento) {
        if (lista == null || lista.isEmpty()) {
            return 0;
        }

        int cont = 0;
        for (T e : lista) {
            if (e == null && elemento == null) {
                cont++;
            } else if (e.equals(elemento)) {
                cont++;
            }
        }

        return cont;
    }

    public static <T extends Comparable<T>> T minimo(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            return null;
        }

        return Collections.min(lista);
    }

    public static <T> void invertir(List<T> lista) {
        for (int i = 0; i < lista.size() / 2; i++) {
            T aux = lista.get(i);
            lista.set(i, lista.get(lista.size() - 1 - i));
            lista.set(lista.size() - 1 - i, aux);
        }
    }
}
