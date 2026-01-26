package ud3.arrays.practicaex;

public class MayorPorFila {
    static int[] mayorPorFila(int[][] t) {
        if (t == null || t.length == 0) {
            return null;
        }

        int[] maxFila = new int[t.length];

        for (int i = 0; i < t.length; i++) {
            int mayorFila = 0;
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] > mayorFila) {
                    mayorFila = t[i][j];
                }
            }
            maxFila[i] = mayorFila;
        }

        return maxFila;
    }
}
