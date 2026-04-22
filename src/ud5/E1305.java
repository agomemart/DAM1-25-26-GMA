package ud5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class E1305 {
    static <T, V> V[] transformar(T[] t, V[] transf, Function<T, V> f) {
        V[] res = Arrays.copyOf(transf, t.length);

        for (int i = 0; i < t.length; i++) {
            res[i] = f.apply(t[i]);
        }

        return res;
    }

    static <T, V> List<V> transformar(List<T> t, Function<T, V> f) {
        List<V> res = new ArrayList<>();

        for (T e : t) {
            res.add(f.apply(e));
        }

        return res;
    }

    public static void main(String[] args) {
        Integer[] numeros = {16, 49, 25};

        Function<Integer, Double> funcion = Math::sqrt;

        Double[] raices = transformar(numeros, new Double[0], funcion);
        System.out.println(Arrays.toString(raices));

        List<Integer> lista = Arrays.asList(numeros);

        
        System.out.println(transformar(lista, Calculos::cubo));

    }
}
