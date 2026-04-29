package ud5.practicaEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FuncionesColecciones {
    static List<String> eliminarDuplicados(List<String> lista) {
        if (lista == null || lista.isEmpty()) {
            return new ArrayList<>();
        }

        Set<String> sinRepetidos = new LinkedHashSet<>(lista);
        List<String> listaSinRepetidos = new ArrayList<>();
        listaSinRepetidos.addAll(sinRepetidos);

        return listaSinRepetidos;
    }

    static List<Integer> interseccion(List<Integer> l1, List<Integer> l2) {
        if (l1 == null || l1.isEmpty() || l2 == null || l2.isEmpty()) {
            return new ArrayList<>();
        }

        Set<Integer> interseccion = new HashSet<>(l1);
        interseccion.retainAll(l2);
        List<Integer> listaInterseccion = new ArrayList<>(interseccion);

        return listaInterseccion;
    }

    static Set<Integer> diferenciaSimetrica(List<Integer> l1, List<Integer> l2) {
        if (l1 == null || l1.isEmpty() || l2 == null || l2.isEmpty()) {
            return new HashSet<>();
        }

        Set<Integer> diferencia = new HashSet<>(l1);
        Set<Integer> aux = new HashSet<>(l2);
        diferencia.removeAll(l2);
        aux.removeAll(l1);
        diferencia.addAll(aux);

        return diferencia;
    }

    static void limpiarLista(List<String> lista) {
        if (lista == null || lista.isEmpty())
            return;

        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            String palabra = it.next();
            if (palabra.length() < 4 || palabra.toLowerCase().contains("a")) {
                it.remove();
            }
        }
    }

    static void reemplazarPares(List<Integer> lista) {
        if (lista == null || lista.isEmpty())
            return;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                lista.set(i, lista.get(i) * 2);
            }
        }
    }

    static void ordenarRaro(List<String> lista) {
        if (lista == null || lista.isEmpty())
            return;

        lista.sort((s1, s2) -> {
            if (Integer.compare(s2.length(), s1.length()) == 0) {
                return s1.compareTo(s2);
            }

            return Integer.compare(s2.length(), s1.length());
        });
    }

    static List<Integer> ordenarPorFrecuencia(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            return new ArrayList<>();
        }

        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (Integer num : lista) {
            if (frecuencia.containsKey(num)) {
                frecuencia.put(num, frecuencia.get(num) + 1);
            } else {
                frecuencia.put(num, 1);
            }
        }

        List<Integer> resultado = new ArrayList<>(lista);
        resultado.sort((n1, n2) -> {
            int f1 = frecuencia.get(n1);
            int f2 = frecuencia.get(n2);

            if (f1 == f2) {
                return Integer.compare(n1, n2);
            }

            return Integer.compare(f1, f2);
        });

        return resultado;
    }
}
