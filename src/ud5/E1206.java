package ud5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class E1206 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Collection<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numeros.add(rnd.nextInt( 10) + 1);
        }

        System.out.println("Lista números:");
        for (Integer num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        Iterator<Integer> itNumeros = numeros.iterator();
        while (itNumeros.hasNext()) {
            if (itNumeros.next() == 5) {
                itNumeros.remove();
            }
        }

        System.out.println("Lista números sin 5:");
        for (Integer num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
