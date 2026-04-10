package ud5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EP1224 {
    public static List<Integer> fusionOrdenadaInteger(List<Integer> l1, List<Integer> l2) {
        List<Integer> fusionOrdenada = new LinkedList<>(l1);
        fusionOrdenada.addAll(l2);
        Collections.sort(fusionOrdenada);
        
        return fusionOrdenada;
    }

     public static <T extends Comparable<T>> List<T> fusionOrdenada(List<T> l1, List<T> l2) {
        List<T> fusionOrdenada = new LinkedList<>(l1);
        fusionOrdenada.addAll(l2);
        Collections.sort(fusionOrdenada);

        return fusionOrdenada;
    }
}
