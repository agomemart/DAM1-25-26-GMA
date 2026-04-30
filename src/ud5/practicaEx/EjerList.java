package ud5.practicaEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EjerList {
    static List<Integer> interseccionSinDuplicados(List<Integer> l1, List<Integer> l2) {
        if (l1 == null || l2 == null || l1.isEmpty() || l2.isEmpty()) {
            return new ArrayList<>();
        }

        Set<Integer> intersecSinDuplicados = new HashSet<>(l1);
        intersecSinDuplicados.retainAll(l2);

        return new ArrayList<>(intersecSinDuplicados);
    }

    static Set<Integer> diferenciaSimetrica(List<Integer> l1, List<Integer> l2) {
        if (l1 == null || l2 == null || l1.isEmpty() || l2.isEmpty()) {
            return new HashSet<>();
        }

        Set<Integer> res = new HashSet<>(l1);
        Set<Integer> aux = new HashSet<>(l2);

        res.removeAll(l2);
        aux.removeAll(l1);
        res.addAll(aux);

        return res;
    }

    static void eliminarImpares(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) 
            return;

        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 != 0) {
                it.remove();
            }
        }
    }
}
