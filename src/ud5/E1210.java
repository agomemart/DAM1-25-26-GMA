package ud5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class E1210 {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            lista.add(rnd.nextInt(10) + 1);
        }

        System.out.println("Lista números:");
        System.out.println(lista);

        Set<Integer> conjunto = new LinkedHashSet<>(lista);
        System.out.println(conjunto);

        Set<Integer> repetidos = new LinkedHashSet<>();
        Set<Integer> noRepetidos = new LinkedHashSet<>();
        for (Integer n : conjunto) {
            if (lista.indexOf(n) == lista.lastIndexOf(n)) {
                noRepetidos.add(n);
            } else {
                repetidos.add(n);
            }
        }

        System.out.println("Repetidos:");
        System.out.println(repetidos);
        System.out.println("No repetidos:");
        System.out.println(noRepetidos);

    }
}
