package ud5.practicaEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ListasColecciones {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            lista.add(rnd.nextInt( 50) + 1);
        }

        Comparator<Integer> porNumAsc = (n1, n2) -> Integer.compare(n1, n2);
        Collections.sort(lista, porNumAsc);
        Collections.sort(lista, porNumAsc.reversed());

        System.out.println("Max: " + Collections.max(lista, porNumAsc));
        System.out.println("Min: " + Collections.min(lista, porNumAsc));

        System.out.println("Contiene 5: " + lista.contains(5));

        List<Integer> listaPares = new ArrayList<>();
        for (Integer i : lista) {
            if (i % 2 == 0) {
                listaPares.add(i);
            }
        }

        List<Integer> listaDobles = new ArrayList<>();
        for (Integer i : lista) {
            listaDobles.add(i * 2);
        }

        int contMayores5 = 0;
        for (Integer i : listaDobles) {
            if (i > 5) {
                contMayores5++;
            }
        }
    }
}
