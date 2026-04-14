package ud3.practica;

import java.util.Arrays;

public class Traspuesta {
    public static int[][] traspuesta(int t[][]) {
        if (t == null || t.length == 0) {
            return new int[0][0];
        }

        int[][] traspuesta = new int[t[0].length][t.length];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                traspuesta[j][i] = t[i][j];
            }
        }

        return traspuesta;
    }

    public static void main(String[] args) {
        int[][] matriz = {  {1, 2}, 
                            {1, 2}};

        System.out.println(Arrays.deepToString(traspuesta(matriz)));
    }
}
