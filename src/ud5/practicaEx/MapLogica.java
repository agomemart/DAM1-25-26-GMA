package ud5.practicaEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;

public class MapLogica {
    static Map<Character, List<String>> agruparPorInicial(List<String> lista) {
        if (lista == null || lista.isEmpty()) {
            return new HashMap<>();
        }

        Map<Character, List<String>> res = new HashMap<>();
        for (String palabra : lista) {
            char inicial = palabra.toLowerCase().charAt(0);
            if (res.containsKey(inicial)) {
                List<String> palabras = res.get(inicial);
                palabras.add(palabra);
                res.put(inicial, palabras);
            } else {
                List<String> palabras = new ArrayList<>();
                palabras.add(palabra);
                res.put(inicial, palabras);
            }
        }

        return res;
    }

    static String palabraMasFrecuente(List<String> lista) {
        if (lista == null ||lista.isEmpty()) {
            return null;
        }

        int masRepetida = 0;
        String palabraMasRepetida = "";
        for (String palabra : lista) {
            if (Collections.frequency(lista, palabra) > masRepetida) {
                masRepetida = Collections.frequency(lista, palabra);
                palabraMasRepetida = palabra;
            } else if (Collections.frequency(lista, palabra) == masRepetida) {
                Comparator<String> ordenAsc = Comparator.naturalOrder();
                if (ordenAsc.compare(palabra, palabraMasRepetida) < 0) {
                    palabraMasRepetida = palabra;
                }
            }
        }
        
        return palabraMasRepetida;
    }

    static <K, V> Map<V, List<K>> invertir(Map<K, V> mapa) {
        if (mapa == null || mapa.isEmpty()) {
            return new HashMap<>();
        }

        Map<V, List<K>> res = new HashMap<>();

        for (Map.Entry<K, V> entrada : mapa.entrySet()) {
            K clave = entrada.getKey();
            V valor = entrada.getValue();

            if (res.containsKey(valor)) {
                List<K> lista = res.get(valor);
                lista.add(clave);
                res.put(valor, lista);
            } else {
                List<K> lista = new ArrayList<>();
                lista.add(clave);
                res.put(valor, lista);
            }
        }

        return res;
    }

    static void eliminarMenores(Map<String, Integer> mapa, int limite) {
        if (mapa == null || mapa.isEmpty()) {
            return;
        }

        Iterator<Entry<String, Integer>> it = mapa.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() < limite) {
                it.remove();
            }
        }
    }

    static List<Integer> eliminarDuplicadosManteniendoUltimo(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            return new ArrayList<>();
        }

        List<Integer> res = new ArrayList<>(lista);
        
        for (int i = lista.size() - 1; i >= 0; i--) {
            Integer e = lista.get(i);
            if (!res.contains(e)) {
                res.add(0, e);
            }
        }
            
        return res;
    }

    static List<Integer> soloEnUna(List<Integer> l1, List<Integer> l2) {
        if (l1 == null || l2 == null || l1.isEmpty() || l2.isEmpty()) {
            return new ArrayList<>();
        }

        Set<Integer> s1 = new HashSet<>(l1);
        Set<Integer> s2 = new HashSet<>(l2);

        Set<Integer> res = new HashSet<>(s1);
        res.removeAll(s2);

        Set<Integer> aux = new HashSet<>(s2);
        aux.removeAll(s1);

        res.addAll(aux);

        return new ArrayList<>(res);
    }

    static <T> List<T> entre(Collection<T> col, T min, T max, Comparator<T> comp) {
        if (col == null || col.isEmpty() || min == null || max == null || comp == null) {
            return new ArrayList<>();
        }

        List<T> res = new ArrayList<>();
        for (T e : col) {
            if (comp.compare(e, min) >= 0 && comp.compare(e, max) <= 0) {
                res.add(e);
            }
        }

        return res;
    }

    static <T> Map<T, Integer> contarFrecuencia(Collection<T> col) {
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

    static <T, K> Map<K, List<T>> agrupar(Collection<T> col, Function<T, K> f) {
        if (col == null || col.isEmpty() || f == null) {
            return new HashMap<>();
        }

        Map<K, List<T>> res = new HashMap<>();
        for (T e : col) {
            K clave = f.apply(e);
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

        return res;
    }

    static <T> List<T> ordenarPorFrecuencia(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            return new ArrayList<>();
        }

        List<T> res = new ArrayList<>(lista);
        res.sort((e1, e2) -> {
            int f1 = Collections.frequency(lista, e1);
            int f2 = Collections.frequency(lista, e2);
            int compFreq = f1 - f2;

            if (compFreq == 0) {
                return 0;
            }
            return compFreq;
        });

        return res;
    }

    static List<Integer> elementosQueDesaparecen(List<Integer> original, List<Integer> modificada) {
        if (original == null || modificada == null || original.isEmpty() || modificada.isEmpty()) {
            return new ArrayList<>();
        }

        List<Integer> elementosDesaparecidos = new ArrayList<>();
        for (Integer num : original) {
            if (!modificada.contains(num)) {
                elementosDesaparecidos.add(num);
            }
        }
        return elementosDesaparecidos;
    }
}
