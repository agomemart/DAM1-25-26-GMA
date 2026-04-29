package ud5.practicaEx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionesSet {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> l2 = Arrays.asList(4, 5, 6, 7, 8);

        Set<Integer> union = new HashSet<>(l1);
        union.addAll(l2);

        Set<Integer> insercion = new HashSet<>(l1);
        insercion.retainAll(l2);

        Set<Integer> elementosUnicos = new HashSet<>(l1);
        elementosUnicos.removeAll(l2);
    }
}
