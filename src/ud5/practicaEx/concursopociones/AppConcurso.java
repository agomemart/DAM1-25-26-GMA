package ud5.practicaEx.concursopociones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppConcurso {
    static <T> List<T> filtrarMayores(Collection<T> col, T elem, Comparator<T> comp) {
        if (col == null || col.isEmpty() || comp == null) {
            return new ArrayList<>();
        }

        List<T> mayores = new ArrayList<>();
        for (T e : col) {
            if (comp.compare(e, elem) >= 0) {
                mayores.add(e);
            }
        }

        return mayores;
    }

    public static void main(String[] args) {
        List<Alquimista> alquimistas = new ArrayList<>();
        Comparator<Alquimista> porPosicionAsc = (a1, a2) -> Integer.compare(a1.getPociones().size(),
                a2.getPociones().size());
        alquimistas.sort(porPosicionAsc);

        Map<Alquimista, Integer> clasificacion = new HashMap();
        for (Alquimista a : alquimistas) {
            System.out.println(a);
            int puntuacion = a.crearPociones();
            clasificacion.put(a, puntuacion);
        }

        List<Map.Entry<Alquimista, Integer>> lista = new ArrayList<>(clasificacion.entrySet());

        lista.sort((e1, e2) -> {
            int cmp = Integer.compare(e2.getValue(), e1.getValue());
            if (cmp == 0) {
                return e1.getKey().compareTo(e2.getKey());
            }
            return cmp;
        });
    }
}
