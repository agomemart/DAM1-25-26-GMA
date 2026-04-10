package ud5;

import java.util.Comparator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class EP1221 {
    public static void main(String[] args) {
        Random rnd = new Random(7);
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        
        while (numeros.size() < 20) {
            numeros.add(rnd.nextInt(100));
        }

        System.out.println(numeros);
    }
}
