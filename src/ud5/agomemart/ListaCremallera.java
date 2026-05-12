package ud5.agomemart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Adrián Gómez Martínez
 */

public class ListaCremallera {
    public static <T> List<T> listaCremallera(List<T> l1, List<T> l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null || l1.isEmpty()) {
            return l2;
        }

        if (l2 == null || l2.isEmpty()) {
            return l1;
        }

        List<T> res = new ArrayList<>();

        int tamanho = 0;
        if (l1.size() > l2.size()) {
            tamanho = l1.size();
        } else {
            tamanho = l2.size();
        }

        for (int i = 0; i < tamanho; i++) {
            if (l1.size() < l2.size()) {
                if (i < l1.size()) {
                    res.add(l1.get(i));
                    res.add(l2.get(i));
                } else {
                    res.add(l2.get(i));
                }
            } else {
                if (i < l2.size()) {
                    res.add(l1.get(i));
                    res.add(l2.get(i));
                } else {
                    res.add(l1.get(i));
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        List<String> nombres1 = Arrays.asList("Pepe", "Juan");
        List<String> nombres2 = Arrays.asList("Mario", "Adrián");

        System.out.println(listaCremallera(nombres1, nombres2));
    }
}
