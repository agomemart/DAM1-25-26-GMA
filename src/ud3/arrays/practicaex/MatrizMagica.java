package ud3.arrays.practicaex;

public class MatrizMagica {
    public static boolean esMatrizMagica(int[][] t) {
        if (t.length != t[0].length) {
            return false;
        }

        int sumaDiagonal = 0;
        int sumaDiagonalSec = 0;
        int[] sumaFilas = new int[t.length];
        int[] sumaColumnas = new int[t[0].length];

        for (int i = 0; i < t.length; i++) {
            sumaDiagonal += t[i][i];
            for (int j = 0; j < t[0].length; j++) {
                if (i + j == t.length - 1) {
                    sumaDiagonalSec += t[i][j];
                }
                sumaFilas[i] += t[i][j];
                sumaColumnas[j] += t[i][j];
            }
        }

        int sumaRef = sumaFilas[0];

        if (sumaDiagonal != sumaRef || sumaDiagonalSec != sumaRef) {
            return false;
        }

        for (int i = 0; i < t.length; i++) {
            if (sumaFilas[i] != sumaRef || sumaColumnas[i] != sumaRef) {
                return false;
            }
        }

        return true;
    }
}
