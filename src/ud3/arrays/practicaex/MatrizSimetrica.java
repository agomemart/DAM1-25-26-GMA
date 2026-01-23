package ud3.arrays.practicaex;

public class MatrizSimetrica {
    static boolean esMatrizSimetrica(int[][] t) {
        if (t == null || t.length == 0) {
            return false;
        }

        if (t[0].length != t.length) {
            return false;
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i][j] != t[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
