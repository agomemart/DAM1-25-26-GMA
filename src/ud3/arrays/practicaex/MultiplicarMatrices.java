package ud3.arrays.practicaex;

public class MultiplicarMatrices {
    static int[][] multiplicarMatrices(int[][] t1, int[][] t2) {
        if (t1 == null || t2 == null || t1.length == 0 || t2.length == 0) {
            return null;
        }

        if (t1[0].length != t2.length) {
            return null; 
        }

        int[][] resultado = new int[t1.length][t2[0].length];

        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t2[0].length; j++) {
                for (int k = 0; k < t1[0].length; k++) {
                    resultado[i][j] += t1[i][k] * t2[k][j];
                }
            }
        }

        return resultado;
    }
}
