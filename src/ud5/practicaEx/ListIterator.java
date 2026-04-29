package ud5.practicaEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListIterator {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();

        Iterator<String> it = palabras.iterator();

        while (it.hasNext()) {
            if (it.next().length() < 4) {
                it.remove();
            }
        }

        Iterator<String> it2 = palabras.iterator();
        while (it2.hasNext()) {
            if (it2.next().toLowerCase().contains("a")) {
                it2.remove();
            }
        }

        List<Integer> l1 = Arrays.asList(1,2,3,4,5,5,5);
        List<Integer> l2 = Arrays.asList(4,5,6,7);

        Set<Integer> union = new HashSet<>(l1);
        union.addAll(l2);
        Set<Integer> interseccion = new HashSet<>(l1);
        interseccion.retainAll(l2);
            
        
    }
}
