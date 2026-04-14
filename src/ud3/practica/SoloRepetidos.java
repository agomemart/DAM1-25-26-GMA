package ud3.practica;

import java.util.Arrays;

public class SoloRepetidos {
    public static int[] repetidos(int[] t) {
        if (t == null || t.length == 0) {
            return new int[0];
        }

        Arrays.sort(t);
        int[] repetidos = new int[0];
        int contRepetidos = 0;

        for (int i = 1; i < t.length; i++) {
            if (t[i - 1] == t[i]) {
                if (contRepetidos == 0 || repetidos[contRepetidos - 1] != t[i]) {
                    repetidos = Arrays.copyOf(repetidos, repetidos.length + 1);
                    repetidos[contRepetidos] = t[i];
                    contRepetidos++;
                }
                
            }

        }

        return repetidos;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 5, 6, 8, 9, 8, 9, 6 };
        System.out.println(Arrays.toString(repetidos(arr)));
    }
}
