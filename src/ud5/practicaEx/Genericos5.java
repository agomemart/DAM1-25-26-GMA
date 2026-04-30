package ud5.practicaEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class Genericos5 {
    static <T> List<T> filtrarUnicos(Collection<T> col) {
        if (col == null || col.isEmpty()) {
            return null;
        }

        List<T> resultado = new ArrayList<>();
        for (T e : col) {
            if (Collections.frequency(col, e) == 1) {
                resultado.add(e);
            }
        }

        return resultado;
    }

    static <T> boolean hayDuplicados(Collection<T> col) {
        if (col == null || col.isEmpty()) {
            return false;
        }

        for (T e : col) {
            if (Collections.frequency(col, e) > 1) {
                return true;
            }
        }
        
        return false;
    }

    static <T> T minimo(Collection<T> col, Comparator<T> comp) {
        if (col == null || col.isEmpty()) {
            return null;
        }

        return Collections.min(col, comp);
    }

    static <T, K> Map<K, List<T>> agruparYFiltrar(Collection<T> col, Predicate<T> filtro, Function<T, K> clasificador) {
        if (col == null || col.isEmpty() || filtro == null || clasificador == null) {
            return new HashMap<>();
        }

        Map<K, List<T>> res = new HashMap<>();

        for (T e : col) {
            if (filtro.test(e)) {
                K clave = clasificador.apply(e);
                if (res.containsKey(clave)) {
                    List<T> lista = res.get(clave);
                    lista.add(e);
                    res.put(clave, lista);
                } else {
                    List<T> lista = new ArrayList<>();
                    lista.add(e);
                    res.put(clave, lista);
                }
            }
        }

        return res;
    }

    static <T> List<T> ordenarPorFrecuencia(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            return new ArrayList<>();
        }

        Map<T, Integer> freq = new HashMap<>();
        for (T e : lista) {
            freq.put(e, freq.getOrDefault(e, 0) + 1);
        }

        List<T> res = new ArrayList<>(lista);
        res.sort((e1, e2) -> {
            int f1 = freq.get(e1);
            int f2 = freq.get(e2);

            if (f1 != f2) {
                return Integer.compare(f1, f2);
            }

            return 0;
        });
        
        return res;
    }
}
