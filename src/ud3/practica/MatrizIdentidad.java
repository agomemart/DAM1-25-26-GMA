package ud3.practica;

public class MatrizIdentidad {
    public static boolean esIdentidad(int[][] t) {
        if (t == null || t.length == 0) {
            return false;
        }

        if (t.length != t[0].length) {
            return false;
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (i == j) {
                    if (t[i][i] != 1) {
                        return false;
                    }
                } else {
                    if (t[i][j] != 0) {
                        return false;
                    }
                }
                
            }
        }

        return true;
    }
}
