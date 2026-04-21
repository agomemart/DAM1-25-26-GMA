package ud5.practicaEx;

import java.util.Arrays;

public class UnionArrays {
    public static <T> T[] unir(T[] a , T[] b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        T[] res = Arrays.copyOf(a, a.length + b.length);

        for (int i = 0; i < b.length; i++) {
            res[a.length + i] = b[i];
        }

        return res;
    }
}
