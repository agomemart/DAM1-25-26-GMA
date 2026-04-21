package ud5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class E1304 {
    public static <T> List<T> filtrar(List<T> lista, Predicate<T> p) {
        lista.removeIf(p.negate());
        return lista;
    }

    public static <T> T[] filtrar(T[] tabla, Predicate<T> p) {
        List<T> lista = new ArrayList<>(Arrays.asList(tabla));
        lista.removeIf(p.negate());

        return (T[]) lista.toArray();
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> lista = new ArrayList<>();
        Integer[] tabla = new Integer[50];
        for (int i = 0; i < 50; i++) {
            int num = rnd.nextInt(100) + 1;
            lista.add(num);
            tabla[i] = num;
        }

        Predicate<Integer> multiplos3 = n -> n % 3 == 0;

        System.out.println(filtrar(lista, multiplos3));
        System.out.println(Arrays.toString(filtrar(tabla, multiplos3)));


    }
}
