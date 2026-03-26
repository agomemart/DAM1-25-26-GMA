package ud5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class E1205 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Collection<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numeros.add(rnd.nextInt( 10) + 1);
        }

        Collection<Integer> numerosSinRepetidos = new HashSet<>();
        numerosSinRepetidos.addAll(numeros);

        System.out.println("Lista números:");
        for (Integer num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Lista números sin repetidos:");
        for (Integer num : numerosSinRepetidos) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
