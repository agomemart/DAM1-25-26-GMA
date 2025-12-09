package ud3.arrays;

import java.util.Arrays;

public class InsercionOrdenada {
    public static void main(String[] args) {
        int[] t = { 1, 2, 3, 4, 6, 7, 8, 9 };
        int nuevo = 5;

        int pos = Arrays.binarySearch(t, nuevo);

        if (pos < 0) {
            pos = -pos - 1;
        }

        t = Arrays.copyOf(t, t.length + 1);
        System.arraycopy(t, pos, t, pos + 1, t.length - pos - 1);
        t[pos] = nuevo;

        System.out.println(Arrays.toString(t));
    }
}
