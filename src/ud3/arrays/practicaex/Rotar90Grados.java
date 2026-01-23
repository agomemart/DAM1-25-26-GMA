package ud3.arrays.practicaex;

public class Rotar90Grados {
    static int[][] rotar90Grados(int[][] t) {
        if (t == null || t.length == 0) {
            return null;
        }

        int[][] resultado = new int[t[0].length][t.length];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                resultado[j][t.length - 1 - i] = t[i][j];
            }
        }

        return resultado;
    }
}
