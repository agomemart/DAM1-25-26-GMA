package ud5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class E1208 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Collection<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numeros.add(rnd.nextInt( 10) + 1);
        }

        Integer[] numerosArray = new Integer[0];
        numerosArray = numeros.toArray(numerosArray);
        Arrays.sort(numerosArray);

        Collection<Integer> numerosOrdenados = Arrays.asList(numerosArray);

        System.out.println(numeros);
        System.out.println(numerosOrdenados);

        
    }
}
