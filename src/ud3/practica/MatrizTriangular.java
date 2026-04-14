package ud3.practica;

public class MatrizTriangular {
    public static boolean esTriangularSuperior(int[][] t){
        if (t == null || t.length == 0) {
            return false;
        }

        if (t.length != t[0].length) {
            return false;
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < i; j++) {
                if (t[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean esTriangularInferior(int[][] t){
        if (t == null || t.length == 0) {
            return false;
        }

        if (t.length != t[0].length) {
            return false;
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
