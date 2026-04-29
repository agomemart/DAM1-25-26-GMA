package ud5.practicaEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        numeros.add(3);
        numeros.add(5);
        numeros.add(4);
        numeros.add(1);

        for (Integer i : numeros) {
            System.out.println(i);
        }

        System.out.println(numeros.contains(2));

        System.out.println(numeros.remove(5));
        
        List<Integer> numerosList = new ArrayList<>(numeros);
    }
}
