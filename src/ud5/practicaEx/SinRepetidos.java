package ud5.practicaEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SinRepetidos {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            lista.add(rnd.nextInt(10) + 1);
        }

        System.out.println("Con repetidos: " + lista);

        Set<Integer> sinRepetidos = new HashSet<>(lista);

        System.out.println("Sin repetidos: " + sinRepetidos);

    }
}
