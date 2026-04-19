package ud3.practica;

import java.util.Arrays;

public class RotarDerecha {
    public static int[][] rotarColumnas(int[][] t) {
        if (t == null || t.length == 0) {
            return null;
        }

        for (int i = 0; i < t.length; i++) {
            int ultimoElemento = t[i][t[0].length - 1];
            for (int j = t[0].length - 1; j > 0; j--) {
                t[i][j] = t[i][j - 1];
            }

            t[i][0] = ultimoElemento;
        }
        
        return t;
    }

    public static void main(String[] args) {
        int[][] t = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(rotarColumnas(t)));
    }
}
