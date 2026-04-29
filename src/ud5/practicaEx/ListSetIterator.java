package ud5.practicaEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListSetIterator {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,2,3,6,7,8,2);

        List<Integer> mayoresQue3 = new ArrayList<>();
        for (Integer num : lista) {
            if (num > 3) {
                mayoresQue3.add(num);
            }
        }

        Iterator<Integer> it = mayoresQue3.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }

        Set<Integer> listaSet = new HashSet<>(lista);

        int cont2 = 0;
        for (Integer num : lista) {
            if (num == 2) {
                cont2++;
            }
        }

        System.out.println("Numero 2 aparece " + cont2 + " veces.");

        System.out.println(Collections.max(lista));
    }
}
