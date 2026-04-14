package ud3.practica;

public class SumaMatrices {
    public static int[][] sumaMatrices(int[][] t1, int[][] t2) {
        if (t1 == null || t1.length == 0 || t2 == null || t2.length == 0) {
            return null;
        }

        if (t1.length != t2.length || t1[0].length != t2[0].length) {
            return null;
        }

        int[][] suma = new int[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                suma[i][j] = t1[i][j] + t2[i][j];
            }
        }

        return suma;
    }
}
