package ud3.practica;

public class BuscarEnMatriz {
    public static int[] buscarEnMatriz(int[][] t, int n) {
        if (t == null || t.length == 0) {
            return new int[0];
        }

        int[] res = new int[2];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] == n) {
                    res[0] = i;
                    res[0] = j;
                    return res;
                }
            }
        }
        return new int[0];
    }
}
