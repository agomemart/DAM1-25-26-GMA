package ud3.arrays.practicaex;

public class MayorFila {
    static int[] mayorCadaFila(int[][] t) {
        if (t == null || t.length == 0) {
            return null;
        }
        int[] mayorFila = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            mayorFila[i] = t[i][0];
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] > mayorFila[i]) {
                    mayorFila[i] = t[i][j];
                }
            }
        }
        return mayorFila;
    }
}
