package ud3.practica;

public class MaximoMatriz {
    public static int maxMatriz(int[][] t) {
        if (t == null || t.length == 0) {
            return -1;
        }

        int max = t[0][0];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (max <= t[i][j]) {
                    max = t[i][j];
                }
            }
        }

        return max;
    }
}
