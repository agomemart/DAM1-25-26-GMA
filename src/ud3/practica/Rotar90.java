package ud3.practica;

import java.util.Arrays;

public class Rotar90 {
    public static int[][] rotar90(int t[][]) {
        if (t == null || t.length == 0) {
            return new int[0][];
        }

        int[][] rotada = new int [t[0].length][t.length];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                rotada[j][t.length - 1 - i] = t[i][j];
            }
        }
        return rotada;
    }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(rotar90(matriz)));
    }
}
