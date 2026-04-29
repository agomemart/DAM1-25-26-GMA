package ud5.practicaEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class Genericos4 {
    static <T> List<T> filtrarMenores(Collection<T> col, T elem, Comparator<T> comp) {
        if (col == null || col.isEmpty()) {
            return new ArrayList<>();
        }

        List<T> menores = new ArrayList<>();
        for (T e : col) {
            if (comp.compare(e, elem) <= 0) {
                menores.add(e);
            }
        }

        return menores;
    }

    static <T> T maximo(Collection<T> col, Comparator<T> comp) {
        if (col == null || col.isEmpty()) {
            return null;
        }

        List<T> lista = new ArrayList<>(col);
        Collections.sort(lista, comp);

        return lista.getLast();
    }

    static <T> boolean estaOrdenado(List<T> lista, Comparator<T> comp) {
        if (lista == null || lista.isEmpty()) {
            return false;
        }

        for (int i = 0; i < lista.size(); i++) {
            if (comp.compare(lista.get(i), lista.get(i + 1)) > 0) {
                return false;
            }
        }

        return true;
    }

    static <T, K> Map<K, List<T>> agrupar(Collection<T> col, Function<T, K> clasificador) {
        if (col == null || col.isEmpty()) {
            return new HashMap<>();
        }
        
        Map<K, List<T>> res = new HashMap<>();
        for (T e : col) {
            K clave = clasificador.apply(e);

            if (res.containsKey(clave)) {
                res.get(clave).add(e);
            } else {
                List<T> lista = new ArrayList<>();
                lista.add(e);
                res.put(clave, lista);
            }
            
        }

        return res;
    }

    static <T> Map<T, Integer> contar(Collection<T> col) {
        if (col == null || col.isEmpty()) {
            return new HashMap<>();
        }

        Map<T, Integer> res = new HashMap<>();
        for (T e : col) {
            if (res.containsKey(e)) {
                res.put(e, res.get(e) + 1);
            } else {
                res.put(e, 1);
            }
        }

        return res;
    }

    static <K, V> Map<V, List<K>> invertir(Map<K, V> mapa) {
        if (mapa == null || mapa.isEmpty()) {
            return new HashMap<>();
        }

        Map<V, List<K>> res = new HashMap<>();
        for (Map.Entry<K, V> entry : mapa.entrySet()) {
            V valor = entry.getValue();
            K clave = entry.getKey();

            if (res.containsKey(valor)) {
                res.get(valor).add(clave);
            } else {
                List<K> lista = new ArrayList<>();
                lista.add(clave);
                res.put(valor, lista);
            }
        }

        return res;
    }

    static <T> List<T> sinDuplicados(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            return new ArrayList<>();
        }

        Set<T> sinDuplicados = new LinkedHashSet<>(lista);
        
        return new ArrayList<>(sinDuplicados);
    }

    static <T> List<T> interseccion(List<T> l1, List<T> l2) {
        List<T> interseccion = new ArrayList<>(l1);
        interseccion.retainAll(l2);
        Set<T> interseccionSinRepetidos = new LinkedHashSet<>(interseccion);

        return new ArrayList<>(interseccionSinRepetidos);
    }

    static <T> Set<T> diferenciaSimetrica(Collection<T> c1, Collection<T> c2) {
        Set<T> res = new HashSet<>(c1);
        Set<T> aux = new HashSet<>(c2);

        res.removeAll(c2);
        aux.removeAll(c1);

        res.addAll(aux);

        return res;
    }
}
