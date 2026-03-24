package ud5;

import java.util.Arrays;

public class E1201_MetodosGenericos {
    public static <U> U[] add(U e, U[] t) {
        if (t == null) {
            return null;
        }

        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = e;

        return t;
    }

    public static <U> boolean buscar(U e, U[] t) {
        for (U u : t) {
            if (u.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public static <U> U[] concatenar(U[] t1, U[] t2) {
        U[] concatenado = t1.clone();
        concatenado = Arrays.copyOf(concatenado, concatenado.length + t2.length);
        int indiceT2 = 0;
        for (int i = concatenado.length - t2.length - 1; i < concatenado.length; i++) {
            concatenado[i] = t2[indiceT2];
            indiceT2++;
        }
        return concatenado;
    }

    public static <U, V> Object[] concatenar2(U[] t1, V[] t2) {
        Object[] concatenado = t1.clone();
        concatenado = Arrays.copyOf(t2, concatenado.length + t2.length);
        int indiceT2 = 0;
        for (int i = concatenado.length - t2.length - 1; i < concatenado.length; i++) {
            concatenado[i] = t2[indiceT2];
            indiceT2++;
        }
        return concatenado;
    }
}
