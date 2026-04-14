package ud3.practica;

import java.util.Arrays;

public class IntercambiarFilas {
    public static int[][] intercambiarFilas(int[][] t, int f1, int f2) {
        if (t == null || t.length == 0) {
            return null;
        }

        if (f1 < 0 || f1 >= t.length || f2 < 0 || f2 >= t.length) {
            return null;
        }

        int[] filaF1 = new int[t[f1].length];
        for (int i = 0; i < t[f1].length; i++) {
            filaF1[i] = t[f1][i];
        }

        int[] fliaF2 = new int[t[f2].length];
        for (int i = 0; i < t[f2].length; i++) {
            fliaF2[i] = t[f2][i];
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (i == f1) {
                    t[i][j] = fliaF2[j];
                } else if(i == f2) {
                    t[i][j] = filaF1[j];
                }
            }
        }
        
        return t;
    }

    public static void main(String[] args) {
        int[][] arr = {{2, 3, 4}, {5, 6, 7}};

        System.out.println(Arrays.deepToString(intercambiarFilas(arr, 0, 1)));
    }
}
