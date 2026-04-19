package ud3.practica;

public class PosicionMaximo {
    public static int[] posicionMaximo(int t[][]) {
        if (t == null || t.length == 0) {
            return null;
        }

        int max = t[0][0];
        int fila = 0;
        int columna = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] > max) {
                    max = t[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }

        int[] posicionMax = { fila, columna };

        return posicionMax;
    }
}
