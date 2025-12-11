package ud3.arrays;

import java.util.Arrays;

public class Util {
    public static int[] insertarAlFinal(int[] t, int num) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = num;
        return t;
    }

    public static int[] insertarAlInicio(int[] t, int num) {
        t = Arrays.copyOf(t, t.length + 1);
        System.arraycopy(t, 0, t, 1, t.length - 1);
        t[0] = num;
        return t;
    }

    public static int[] insertarEnPosicion(int[] t, int num, int pos) {
        t = Arrays.copyOf(t, t.length + 1);
        System.arraycopy(t, pos, t, pos + 1, t.length - pos - 1);
        t[pos] = num;
        return t;
    }

    public static int[] eliminarAlFinal(int[] t) {
        t = Arrays.copyOf(t, t.length - 1);
        return t;
    }

    public static int[] eliminarAlInicio(int[] t) {
        /*for (int i = 0; i < t.length - 1; i++) {
            t[i] = t[i + 1];
        }*/

        //t = Arrays.copyOf(t, t.length - 1);

        t = Arrays.copyOfRange(t, 1, t.length);
        return t;
    }
}
