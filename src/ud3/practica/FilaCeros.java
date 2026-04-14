package ud3.practica;

public class FilaCeros {
    public static boolean filaCeros(int[][] t, int fila) {
        if (t == null || t.length == 0) {
            return false;
        }

        if (fila < 0 || fila >= t.length) {
            return false;
        }

 
        for (int j = 0; j < t[fila].length; j++) {
            if (t[fila][j] != 0) {
                return false;
            }
        }


        return true;
    }
}
