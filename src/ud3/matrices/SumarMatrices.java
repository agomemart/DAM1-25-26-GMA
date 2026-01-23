package ud3.matrices;

public class SumarMatrices {
    static int[][] sumaMatrices(int[][] t1, int[][] t2) {
        if (t1 == null || t2 == null) {
            return null;
        }
        if (t1.length != t2.length || t1.length == 0) {
            return t1;
        }

        for (int i = 0; i < t1.length; i++) {
            if (t1[i].length != t2[i].length) {
                return null;
            }
        }

        int[][] sumaMatrices = new int[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                sumaMatrices[i][j] = t1[i][j] + t2[i][j];
            }
        }

        return sumaMatrices;
    }
}
